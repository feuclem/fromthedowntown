package com.app.downtown.infra.repositories.cache

import com.app.downtown.domain.Cache
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.PropertyNamingStrategy
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import com.fasterxml.jackson.module.kotlin.KotlinModule
import org.springframework.data.redis.connection.RedisConnection
import org.springframework.data.redis.connection.RedisConnectionFactory
import org.springframework.stereotype.Service
import java.time.Duration

@Service
class RedisCacheManager(
    private val redisConnectionFactory: RedisConnectionFactory
) : Cache {
    private val objectMapper = ObjectMapper()
        .setPropertyNamingStrategy(PropertyNamingStrategy.UPPER_CAMEL_CASE)
        .registerModule(JavaTimeModule())
        .registerModule(KotlinModule())

    private var redisConnection: RedisConnection? = null

    override fun get(key: String): String? {
        val rawValue = getRedisConnection().get(key.toByteArray()) ?: return null
        return String(rawValue)
    }

    override fun <T> get(key: String, clazz: Class<T>): T? {
        val rawValue = getRedisConnection().get(key.toByteArray()) ?: return null
        return objectMapper.readValue(rawValue, clazz)
    }

    override fun <T> set(key: String, value: T, expiresIn: Duration) {
        val keyInByte = key.toByteArray()
        getRedisConnection().set(keyInByte, valueToBytes(value))

        if (!Duration.ZERO.equals(expiresIn)) {
            getRedisConnection().pExpire(keyInByte, expiresIn.toMillis())
        }
    }

    override fun clear() {
        getRedisConnection().flushDb()
    }

    override fun size() = getRedisConnection().dbSize() ?: 0L

    private fun getRedisConnection(): RedisConnection {
        if (redisConnection == null || redisConnection!!.isClosed) {
            redisConnection = redisConnectionFactory.connection
        }

        return redisConnection!!
    }

    private fun <T> valueToBytes(value: T): ByteArray {
        return if (value is String) {
            value.toByteArray()
        } else {
            objectMapper.writeValueAsBytes(value)
        }
    }
}

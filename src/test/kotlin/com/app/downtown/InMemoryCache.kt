package com.app.downtown

import com.app.downtown.domain.Cache
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.PropertyNamingStrategy
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import com.fasterxml.jackson.module.kotlin.KotlinModule
import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Service
import java.time.Duration

@Service
@Primary
class InMemoryCache : Cache {
    private val objectMapper = ObjectMapper()
        .setPropertyNamingStrategy(PropertyNamingStrategy.UPPER_CAMEL_CASE)
        .registerModule(JavaTimeModule())
        .registerModule(KotlinModule())

    private val inMemoryRegistry = mutableMapOf<String, ByteArray>()
    override fun get(key: String): String? {
        val rawValue = inMemoryRegistry[key] ?: return null
        return String(rawValue)
    }

    override fun <T> get(key: String, clazz: Class<T>): T? {
        val value = inMemoryRegistry[key] ?: return null
        return objectMapper.readValue(String(value), clazz)
    }

    override fun <T> set(key: String, value: T, expiresIn: Duration) {
        inMemoryRegistry[key] = valueToBytes(value)
    }

    override fun clear() {
        inMemoryRegistry.clear()
    }

    override fun size(): Long {
        return inMemoryRegistry.size.toLong()
    }

    private fun <T> valueToBytes(value: T): ByteArray {
        return if (value is String) {
            value.toByteArray()
        } else {
            objectMapper.writeValueAsBytes(value)
        }
    }
}

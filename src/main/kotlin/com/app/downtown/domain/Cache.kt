package com.app.downtown.domain

import java.time.Duration

interface Cache {
    companion object {
        private val DEFAULT_CACHE_DURATION = Duration.ofMinutes(5)
    }

    fun get(key: String): String?
    fun <T> set(key: String, value: T, expiresIn: Duration = DEFAULT_CACHE_DURATION)
    fun <T> get(key: String, clazz: Class<T>): T?
    fun clear()
    fun size(): Long
}

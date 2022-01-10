package com.app.downtown.infra.repositories.player

import java.io.Serializable
import org.springframework.data.redis.core.RedisHash

@RedisHash("Player")
class PlayerEntity(
    val id: String,
    val firstName: String,
    val lastName: String,
    val team: String,
    val number: String,
    val position: String,
    val pointPerMatch: String,
    val reboundPerMatch: String,
    val assistPerMatch: String,
): Serializable

package com.app.downtown.domain.player

import com.app.downtown.domain.Team

interface Player {
    val firstName: String
    val lastName: String
    val team: Team
}
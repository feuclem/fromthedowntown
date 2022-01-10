package com.app.downtown.domain.player

import com.app.downtown.domain.team.Team

interface Player {
    val firstName: String
    val lastName: String
    val team: Team
}
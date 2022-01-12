package com.app.downtown.infra.controller

data class RostersRestResource(
    val titularPlayers: List<PlayerRestResource>
): RostersRestResourcePossibilities

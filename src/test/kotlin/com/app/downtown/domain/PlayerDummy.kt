package com.app.downtown.domain

import com.app.downtown.domain.Position.*
import com.app.downtown.domain.Team.*

object PlayerDummy {

    val jamesHarden = Player(
        firstName = "James",
        lastName = "Harden",
        team = BROOKLYN_NETS,
        number = 13,
        position = SHOOTING_GUARD,
        average = Average(26.1, 11.2, 8.9),
        price = 46.2
    )

    val joelEmbiid = Player(
        firstName = "Joel",
        lastName = "Embiid",
        team = PHILADELPHIA_76_ERS,
        number = 21,
        position = CENTER,
        average = Average(29.9, 3.3, 11.5),
        price = 44.7
    )

    val zionWilliamson = Player(
        firstName = "Zion",
        lastName = "Williamson",
        team = NEW_ORLEANS_PELICANS,
        number = 1,
        position = POWER_FORWARD,
        average = Average(26.4, 3.5, 7.1),
        price = 37.0
    )

    val tylerHerro = Player(
        firstName = "Tyler",
        lastName = "Heroo",
        team = MIAMI_HEAT,
        number = 14,
        position = POINT_GUARD,
        average = Average(15.7, 3.5, 5.2),
        price = 24.4
    )

    val lameloBall = Player(
        firstName = "LaMelo",
        lastName = "Ball",
        team = CHARLOTTE_HORNETS,
        number = 1,
        position = POINT_GUARD,
        average = Average(15.9, 6.1, 5.9),
        price = 27.9
    )

    val tobiasHarris = Player(
        firstName = "Tobias",
        lastName = "Harris",
        team = PHILADELPHIA_76_ERS,
        number = 12,
        position = SMALL_FORWARD,
        average = Average(20.5, 3.6, 7.3),
        price = 31.4
    )

    val rudyGobert = Player(
        firstName = "Rudy",
        lastName = "Gobert",
        team = UTAH_JAZZ,
        number = 27,
        position = CENTER,
        average = Average(14.6, 13.3, 1.3),
        price = 29.2
    )

    val donovanMitchell = Player(
        firstName = "Donovan",
        lastName = "Mitchell",
        team = UTAH_JAZZ,
        number = 45,
        position = SHOOTING_GUARD,
        average = Average(25.7, 5.5, 4.5),
        price = 35.7
    )

    val juliusRandle = Player(
        firstName = "Julius",
        lastName = "Randle",
        team = NEW_YORK_KNICKS,
        number = 30,
        position = POWER_FORWARD,
        average = Average(23.1, 10.8, 5.8),
        price = 39.7
    )

    val stephenCurry = Player(
        firstName = "Stephen",
        lastName = "Curry",
        team = GOLDEN_STATE_WARRIORS,
        number = 30,
        position = POINT_GUARD,
        average = Average(29.2, 6.1, 5.5),
        price = 40.8
    )

    val nikolaJokic = Player(
        firstName = "Nikola",
        lastName = "Jokic",
        team = DENVER_NUGGETS,
        number = 15,
        position = CENTER,
        average = Average(26.5, 8.4, 11.0),
        price = 45.9
    )

    val luguentzDort = Player(
        firstName = "Luguentz",
        lastName = "Dort",
        team = OKLAHOMA_CITY_THUNDER,
        number = 5,
        position = SMALL_FORWARD,
        average = Average(12.6, 1.6, 3.4),
        price = 17.6
    )


    val players = listOf(
        jamesHarden,
        joelEmbiid,
        zionWilliamson,
        tylerHerro,
        lameloBall,
        tobiasHarris,
        rudyGobert,
        donovanMitchell,
        juliusRandle,
        stephenCurry,
        nikolaJokic,
        luguentzDort
    )
}
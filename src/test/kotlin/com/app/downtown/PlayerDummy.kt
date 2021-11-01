package com.app.downtown

import com.app.downtown.domain.Average
import com.app.downtown.domain.player.EndPlayer
import com.app.downtown.domain.Position.*
import com.app.downtown.domain.Team.*

object PlayerDummy {

    val jamesHarden = EndPlayer(
        firstName = "James",
        lastName = "Harden",
        team = BROOKLYN_NETS,
        number = 13,
        position = POINT_GUARD,
        average = Average(26.1, 8.9, 11.2)
    )

    val joelEmbiid = EndPlayer(
        firstName = "Joel",
        lastName = "Embiid",
        team = PHILADELPHIA_76_ERS,
        number = 21,
        position = CENTER,
        average = Average(29.9, 11.5, 3.3)
    )

    val zionWilliamson = EndPlayer(
        firstName = "Zion",
        lastName = "Williamson",
        team = NEW_ORLEANS_PELICANS,
        number = 1,
        position = POWER_FORWARD,
        average = Average(26.4, 7.1, 3.5)
    )

    val tylerHerro = EndPlayer(
        firstName = "Tyler",
        lastName = "Heroo",
        team = MIAMI_HEAT,
        number = 14,
        position = POINT_GUARD,
        average = Average(15.7, 5.2, 3.5)
    )

    val lameloBall = EndPlayer(
        firstName = "LaMelo",
        lastName = "Ball",
        team = CHARLOTTE_HORNETS,
        number = 1,
        position = POINT_GUARD,
        average = Average(15.9, 5.9, 6.1)
    )

    val tobiasHarris = EndPlayer(
        firstName = "Tobias",
        lastName = "Harris",
        team = PHILADELPHIA_76_ERS,
        number = 12,
        position = SMALL_FORWARD,
        average = Average(20.5, 7.3, 3.6)
    )

    val rudyGobert = EndPlayer(
        firstName = "Rudy",
        lastName = "Gobert",
        team = UTAH_JAZZ,
        number = 27,
        position = CENTER,
        average = Average(14.6, 1.3, 13.3)
    )

    val donovanMitchell = EndPlayer(
        firstName = "Donovan",
        lastName = "Mitchell",
        team = UTAH_JAZZ,
        number = 45,
        position = SHOOTING_GUARD,
        average = Average(25.7, 4.5, 5.5)
    )

    val juliusRandle = EndPlayer(
        firstName = "Julius",
        lastName = "Randle",
        team = NEW_YORK_KNICKS,
        number = 30,
        position = POWER_FORWARD,
        average = Average(23.1, 5.8, 10.8)
    )

    val stephenCurry = EndPlayer(
        firstName = "Stephen",
        lastName = "Curry",
        team = GOLDEN_STATE_WARRIORS,
        number = 30,
        position = POINT_GUARD,
        average = Average(29.2, 5.5, 6.1)
    )

    val nikolaJokic = EndPlayer(
        firstName = "Nikola",
        lastName = "Jokic",
        team = DENVER_NUGGETS,
        number = 15,
        position = CENTER,
        average = Average(26.5, 11.0, 8.4)
    )

    val luguentzDort = EndPlayer(
        firstName = "Luguentz",
        lastName = "Dort",
        team = OKLAHOMA_CITY_THUNDER,
        number = 5,
        position = SMALL_FORWARD,
        average = Average(12.6, 3.4, 1.6)
    )

    val karlAntonyTowns = EndPlayer(
        firstName = "Karl-Anthony",
        lastName = "Towns",
        team = MINNESOTA_TIMBERWOLVES,
        number = 32,
        position = CENTER,
        average = Average(24.6, 11.0, 4.3)
    )

    val jimmyButler = EndPlayer(
        firstName = "Jimmy",
        lastName = "Butler",
        team = MIAMI_HEAT,
        number = 22,
        position = SMALL_FORWARD,
        average = Average(21.2, 7.5, 7.3)
    )

    val devinBooker = EndPlayer(
        firstName = "Devin",
        lastName = "Booker",
        team = PHOENIX_SUNS,
        number = 1,
        position = SHOOTING_GUARD,
        average = Average(25.6, 4.1, 4.5)
    )

    val jakobPoeltl = EndPlayer(
        firstName = "Jakob",
        lastName = "Poeltl",
        team = SAN_ANTONIO_SPURS,
        number = 25,
        position = CENTER,
        average = Average(8.0, 1.8, 8.1)
    )

    val aaronGordon = EndPlayer(
        firstName = "Aaron",
        lastName = "Gordon",
        team = DENVER_NUGGETS,
        number = 50,
        position = POWER_FORWARD,
        average = Average(14.5, 6.4, 4.0)
    )

    val garrisonMathews = EndPlayer(
        firstName = "Garrison",
        lastName = "Mathews",
        team = WASHINGTON_WIZARDS,
        number = 24,
        position = SHOOTING_GUARD,
        average = Average(6.5, 0.5, 1.6)
    )

    val grantWilliams = EndPlayer(
        firstName = "Grant",
        lastName = "Williams",
        team = BOSTON_CELTICS,
        number = 12,
        position = POWER_FORWARD,
        average = Average(4.7, 3.0, 1.0)
    )

    val aaronHoliday = EndPlayer(
        firstName = "Aaron",
        lastName = "Holiday",
        team = BOSTON_CELTICS,
        number = 3,
        position = POINT_GUARD,
        average = Average(7.0, 1.2, 1.7)
    )

    val isaiahStewart = EndPlayer(
        firstName = "Isaiah",
        lastName = "Stewart",
        team = DETROIT_PISTONS,
        number = 28,
        position = POWER_FORWARD,
        average = Average(6.3, 5.8, 0.8)
    )

    val lamarcusAldridge = EndPlayer(
        firstName = "LaMarcus",
        lastName = "Aldridge",
        team = BROOKLYN_NETS,
        number = 21,
        position = CENTER,
        average = Average(13.5, 4.6, 1.9)
    )

    val chrisPaul = EndPlayer(
        firstName = "Chris",
        lastName = "Paul",
        team = PHOENIX_SUNS,
        number = 3,
        position = POINT_GUARD,
        average = Average(16.0, 4.7, 8.7)
    )

    val kawhiLeonard = EndPlayer(
        firstName = "Kawhi",
        lastName = "Leonard",
        team = LOS_ANGELES_CLIPPERS,
        number = 2,
        position = SMALL_FORWARD,
        average = Average(25.7, 6.5, 4.9)
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
        luguentzDort,
        karlAntonyTowns,
        jimmyButler,
        devinBooker,
        jakobPoeltl,
        aaronGordon,
        garrisonMathews,
        grantWilliams,
        aaronHoliday,
        isaiahStewart,
        lamarcusAldridge,
        chrisPaul,
        kawhiLeonard
    )

    val rosterTitularPlayers = mutableListOf(
        karlAntonyTowns,
        jimmyButler,
        kawhiLeonard,
        chrisPaul,
        stephenCurry
    )

    val rosterBenchPlayers = mutableListOf(
        aaronGordon,
        lamarcusAldridge,
        isaiahStewart,
        garrisonMathews,
        aaronHoliday
    )

    val lalPlayers = """<!DOCTYPE html>
<html data-version="klecko-" data-root="/home/bbr/build" itemscope itemtype="https://schema.org/WebSite" lang="en" class="no-js" >
                                <body class="bbr">
                                    <div id="wrap">                      
<div id="content">
<div id="all_per_game-playoffs_per_game" class="table_wrapper tabbed">
    <span class="section_anchor" id="per_game-playoffs_per_game_link" data-label="Per Game"></span>
    <div class="section_heading assoc_per_game" id="per_game_sh">
        <span class="section_anchor" id="per_game_link" data-label="Per Game" data-no-inpage="1"></span>
        <h2>Per Game</h2>
        <div class="section_heading_text">
            <ul>
      </ul>
        </div>
    </div>
    <div class="filter switcher" data-controls="#switcher_per_game-playoffs_per_game">
        <div class=" current">
            <a class="sr_preset" data-hide="#all_per_game-playoffs_per_game .section_heading, #all_per_game-playoffs_per_game .topscroll_div" data-show=".assoc_per_game">Regular Season</a>
        </div>
    </div>
    <div class="table_container current" id="div_per_game">
        <table class="stats_table sortable " id="per_game" data-cols-to-freeze=",2">
            <caption>Per Game Table</caption>
            <colgroup>
                <col>
                <col>
                <col>
                <col>
                <col>
                <col>
                <col>
                <col>
                <col>
                <col>
                <col>
                <col>
                <col>
                <col>
                <col>
                <col>
                <col>
                <col>
                <col>
                <col>
                <col>
                <col>
                <col>
                <col>
                <col>
                <col>
                <col>
                <col>
            </colgroup>
            <thead>
                <tr>
                    <th aria-label="Rank" data-stat="ranker" scope="col" class="ranker poptip sort_default_asc show_partial_when_sorting center" data-tip="Rank" >Rk</th>
                    <th aria-label="&nbsp;" data-stat="player" scope="col" class=" poptip sort_default_asc center" >&nbsp;</th>
                    <th aria-label="Player's age on February 1 of the season" data-stat="age" scope="col" class=" poptip sort_default_asc center" data-tip="Player's age on February 1 of the season" >Age</th>
                    <th aria-label="Games" data-stat="g" scope="col" class=" poptip center" data-tip="Games" >G</th>
                    <th aria-label="Games Started" data-stat="gs" scope="col" class=" poptip center" data-tip="Games Started" >GS</th>
                    <th aria-label="Minutes Played Per Game" data-stat="mp_per_g" scope="col" class=" poptip center" data-tip="Minutes Played Per Game" >MP</th>
                    <th aria-label="Field Goals Per Game" data-stat="fg_per_g" scope="col" class=" poptip center" data-tip="Field Goals Per Game" >FG</th>
                    <th aria-label="Field Goal Attempts Per Game" data-stat="fga_per_g" scope="col" class=" poptip center" data-tip="Field Goal Attempts Per Game" >FGA</th>
                    <th aria-label="Field Goal Percentage" data-stat="fg_pct" scope="col" class=" poptip center" data-tip="Field Goal Percentage" >FG%</th>
                    <th aria-label="3-Point Field Goals Per Game" data-stat="fg3_per_g" scope="col" class=" poptip center" data-tip="3-Point Field Goals Per Game" >3P</th>
                    <th aria-label="3-Point Field Goal Attempts Per Game" data-stat="fg3a_per_g" scope="col" class=" poptip center" data-tip="3-Point Field Goal Attempts Per Game" >3PA</th>
                    <th aria-label="3-Point Field Goal Percentage" data-stat="fg3_pct" scope="col" class=" poptip center" data-tip="3-Point Field Goal Percentage" >3P%</th>
                    <th aria-label="2-Point Field Goals Per Game" data-stat="fg2_per_g" scope="col" class=" poptip center" data-tip="2-Point Field Goals Per Game" >2P</th>
                    <th aria-label="2-Point Field Goal Attempts Per Game" data-stat="fg2a_per_g" scope="col" class=" poptip center" data-tip="2-Point Field Goal Attempts Per Game" >2PA</th>
                    <th aria-label="2-Point Field Goal Percentage" data-stat="fg2_pct" scope="col" class=" poptip center" data-tip="2-Point Field Goal Percentage" >2P%</th>
                    <th aria-label="Effective Field Goal Percentage" data-stat="efg_pct" scope="col" class=" poptip center" data-tip="
                        <strong>Effective Field Goal Percentage</strong>
                        <br>This statistic adjusts for the fact that a 3-point field goal is worth one more point than a 2-point field goal." >eFG%
                    </th>
                    <th aria-label="Free Throws Per Game" data-stat="ft_per_g" scope="col" class=" poptip center" data-tip="Free Throws Per Game" >FT</th>
                    <th aria-label="Free Throw Attempts Per Game" data-stat="fta_per_g" scope="col" class=" poptip center" data-tip="Free Throw Attempts Per Game" >FTA</th>
                    <th aria-label="Free Throw Percentage" data-stat="ft_pct" scope="col" class=" poptip center" data-tip="Free Throw Percentage" >FT%</th>
                    <th aria-label="Offensive Rebounds Per Game" data-stat="orb_per_g" scope="col" class=" poptip center" data-tip="Offensive Rebounds Per Game" >ORB</th>
                    <th aria-label="Defensive Rebounds Per Game" data-stat="drb_per_g" scope="col" class=" poptip center" data-tip="Defensive Rebounds Per Game" >DRB</th>
                    <th aria-label="Total Rebounds Per Game" data-stat="trb_per_g" scope="col" class=" poptip center" data-tip="Total Rebounds Per Game" >TRB</th>
                    <th aria-label="Assists Per Game" data-stat="ast_per_g" scope="col" class=" poptip center" data-tip="Assists Per Game" >AST</th>
                    <th aria-label="Steals Per Game" data-stat="stl_per_g" scope="col" class=" poptip center" data-tip="Steals Per Game" >STL</th>
                    <th aria-label="Blocks Per Game" data-stat="blk_per_g" scope="col" class=" poptip center" data-tip="Blocks Per Game" >BLK</th>
                    <th aria-label="Turnovers Per Game" data-stat="tov_per_g" scope="col" class=" poptip center" data-tip="Turnovers Per Game" >TOV</th>
                    <th aria-label="Personal Fouls Per Game" data-stat="pf_per_g" scope="col" class=" poptip center" data-tip="Personal Fouls Per Game" >PF</th>
                    <th aria-label="Points Per Game" data-stat="pts_per_g" scope="col" class=" poptip center" data-tip="Points Per Game" >PTS/G</th>
                </tr>
            </thead>
            <tbody>
                <tr >
                    <th scope="row" class="center " data-stat="ranker" >1</th>
                    <td class="left " data-stat="player" csk="James,LeBron" >
                        <a href='/players/j/jamesle01.html'>LeBron James</a>
                    </td>
                    <td class="center " data-stat="age" >37</td>
                    <td class="right " data-stat="g" >
                        <a href="/players/j/jamesle01/gamelog/2022/">5</a>
                    </td>
                    <td class="right " data-stat="gs" >5</td>
                    <td class="right " data-stat="mp_per_g" >37.2</td>
                    <td class="right " data-stat="fg_per_g" >8.8</td>
                    <td class="right " data-stat="fga_per_g" >20.2</td>
                    <td class="right " data-stat="fg_pct" >.436</td>
                    <td class="right " data-stat="fg3_per_g" >3.0</td>
                    <td class="right " data-stat="fg3a_per_g" >9.0</td>
                    <td class="right " data-stat="fg3_pct" >.333</td>
                    <td class="right " data-stat="fg2_per_g" >5.8</td>
                    <td class="right " data-stat="fg2a_per_g" >11.2</td>
                    <td class="right " data-stat="fg2_pct" >.518</td>
                    <td class="right " data-stat="efg_pct" >.510</td>
                    <td class="right " data-stat="ft_per_g" >3.2</td>
                    <td class="right " data-stat="fta_per_g" >4.2</td>
                    <td class="right " data-stat="ft_pct" >.762</td>
                    <td class="right " data-stat="orb_per_g" >0.6</td>
                    <td class="right " data-stat="drb_per_g" >5.2</td>
                    <td class="right " data-stat="trb_per_g" >5.8</td>
                    <td class="right " data-stat="ast_per_g" >6.4</td>
                    <td class="right " data-stat="stl_per_g" >2.4</td>
                    <td class="right " data-stat="blk_per_g" >1.0</td>
                    <td class="right " data-stat="tov_per_g" >4.2</td>
                    <td class="right " data-stat="pf_per_g" >2.2</td>
                    <td class="right " data-stat="pts_per_g" >23.8</td>
                </tr>
                <tr >
                    <th scope="row" class="center " data-stat="ranker" >2</th>
                    <td class="left " data-stat="player" csk="Davis,Anthony" >
                        <a href='/players/d/davisan02.html'>Anthony Davis</a>
                    </td>
                    <td class="center " data-stat="age" >28</td>
                    <td class="right " data-stat="g" >
                        <a href="/players/d/davisan02/gamelog/2022/">7</a>
                    </td>
                    <td class="right " data-stat="gs" >7</td>
                    <td class="right " data-stat="mp_per_g" >36.1</td>
                    <td class="right " data-stat="fg_per_g" >10.0</td>
                    <td class="right " data-stat="fga_per_g" >20.4</td>
                    <td class="right " data-stat="fg_pct" >.490</td>
                    <td class="right " data-stat="fg3_per_g" >0.4</td>
                    <td class="right " data-stat="fg3a_per_g" >2.4</td>
                    <td class="right " data-stat="fg3_pct" >.176</td>
                    <td class="right " data-stat="fg2_per_g" >9.6</td>
                    <td class="right " data-stat="fg2a_per_g" >18.0</td>
                    <td class="right " data-stat="fg2_pct" >.532</td>
                    <td class="right " data-stat="efg_pct" >.500</td>
                    <td class="right " data-stat="ft_per_g" >4.3</td>
                    <td class="right " data-stat="fta_per_g" >5.7</td>
                    <td class="right " data-stat="ft_pct" >.750</td>
                    <td class="right " data-stat="orb_per_g" >4.1</td>
                    <td class="right " data-stat="drb_per_g" >7.3</td>
                    <td class="right " data-stat="trb_per_g" >11.4</td>
                    <td class="right " data-stat="ast_per_g" >2.6</td>
                    <td class="right " data-stat="stl_per_g" >0.7</td>
                    <td class="right " data-stat="blk_per_g" >2.3</td>
                    <td class="right " data-stat="tov_per_g" >2.0</td>
                    <td class="right " data-stat="pf_per_g" >1.9</td>
                    <td class="right " data-stat="pts_per_g" >24.7</td>
                </tr>
                <tr >
                    <th scope="row" class="center " data-stat="ranker" >3</th>
                    <td class="left " data-stat="player" csk="Westbrook,Russell" >
                        <a href='/players/w/westbru01.html'>Russell Westbrook</a>
                    </td>
                    <td class="center " data-stat="age" >33</td>
                    <td class="right " data-stat="g" >
                        <a href="/players/w/westbru01/gamelog/2022/">7</a>
                    </td>
                    <td class="right " data-stat="gs" >7</td>
                    <td class="right " data-stat="mp_per_g" >35.7</td>
                    <td class="right " data-stat="fg_per_g" >7.9</td>
                    <td class="right " data-stat="fga_per_g" >17.9</td>
                    <td class="right " data-stat="fg_pct" >.440</td>
                    <td class="right " data-stat="fg3_per_g" >1.0</td>
                    <td class="right " data-stat="fg3a_per_g" >4.0</td>
                    <td class="right " data-stat="fg3_pct" >.250</td>
                    <td class="right " data-stat="fg2_per_g" >6.9</td>
                    <td class="right " data-stat="fg2a_per_g" >13.9</td>
                    <td class="right " data-stat="fg2_pct" >.495</td>
                    <td class="right " data-stat="efg_pct" >.468</td>
                    <td class="right " data-stat="ft_per_g" >1.6</td>
                    <td class="right " data-stat="fta_per_g" >3.3</td>
                    <td class="right " data-stat="ft_pct" >.478</td>
                    <td class="right " data-stat="orb_per_g" >1.4</td>
                    <td class="right " data-stat="drb_per_g" >7.3</td>
                    <td class="right " data-stat="trb_per_g" >8.7</td>
                    <td class="right " data-stat="ast_per_g" >8.7</td>
                    <td class="right " data-stat="stl_per_g" >1.6</td>
                    <td class="right " data-stat="blk_per_g" >0.1</td>
                    <td class="right " data-stat="tov_per_g" >5.1</td>
                    <td class="right " data-stat="pf_per_g" >3.9</td>
                    <td class="right " data-stat="pts_per_g" >18.3</td>
                </tr>
                <tr >
                    <th scope="row" class="center " data-stat="ranker" >4</th>
                    <td class="left " data-stat="player" csk="Bazemore,Kent" >
                        <a href='/players/b/bazemke01.html'>Kent Bazemore</a>
                    </td>
                    <td class="center " data-stat="age" >32</td>
                    <td class="right " data-stat="g" >
                        <a href="/players/b/bazemke01/gamelog/2022/">7</a>
                    </td>
                    <td class="right " data-stat="gs" >7</td>
                    <td class="right " data-stat="mp_per_g" >28.0</td>
                    <td class="right " data-stat="fg_per_g" >2.6</td>
                    <td class="right " data-stat="fga_per_g" >6.1</td>
                    <td class="right " data-stat="fg_pct" >.419</td>
                    <td class="right " data-stat="fg3_per_g" >1.6</td>
                    <td class="right " data-stat="fg3a_per_g" >3.7</td>
                    <td class="right " data-stat="fg3_pct" >.423</td>
                    <td class="right " data-stat="fg2_per_g" >1.0</td>
                    <td class="right " data-stat="fg2a_per_g" >2.4</td>
                    <td class="right " data-stat="fg2_pct" >.412</td>
                    <td class="right " data-stat="efg_pct" >.547</td>
                    <td class="right " data-stat="ft_per_g" >0.7</td>
                    <td class="right " data-stat="fta_per_g" >1.1</td>
                    <td class="right " data-stat="ft_pct" >.625</td>
                    <td class="right iz" data-stat="orb_per_g" >0.0</td>
                    <td class="right " data-stat="drb_per_g" >2.0</td>
                    <td class="right " data-stat="trb_per_g" >2.0</td>
                    <td class="right " data-stat="ast_per_g" >1.3</td>
                    <td class="right " data-stat="stl_per_g" >1.4</td>
                    <td class="right " data-stat="blk_per_g" >0.3</td>
                    <td class="right " data-stat="tov_per_g" >0.7</td>
                    <td class="right " data-stat="pf_per_g" >3.3</td>
                    <td class="right " data-stat="pts_per_g" >7.4</td>
                </tr>
                <tr >
                    <th scope="row" class="center " data-stat="ranker" >5</th>
                    <td class="left " data-stat="player" csk="Anthony,Carmelo" >
                        <a href='/players/a/anthoca01.html'>Carmelo Anthony</a>
                    </td>
                    <td class="center " data-stat="age" >37</td>
                    <td class="right " data-stat="g" >
                        <a href="/players/a/anthoca01/gamelog/2022/">7</a>
                    </td>
                    <td class="right iz" data-stat="gs" >0</td>
                    <td class="right " data-stat="mp_per_g" >27.0</td>
                    <td class="right " data-stat="fg_per_g" >5.9</td>
                    <td class="right " data-stat="fga_per_g" >11.7</td>
                    <td class="right " data-stat="fg_pct" >.500</td>
                    <td class="right " data-stat="fg3_per_g" >3.4</td>
                    <td class="right " data-stat="fg3a_per_g" >6.6</td>
                    <td class="right " data-stat="fg3_pct" >.522</td>
                    <td class="right " data-stat="fg2_per_g" >2.4</td>
                    <td class="right " data-stat="fg2a_per_g" >5.1</td>
                    <td class="right " data-stat="fg2_pct" >.472</td>
                    <td class="right " data-stat="efg_pct" >.646</td>
                    <td class="right " data-stat="ft_per_g" >1.6</td>
                    <td class="right " data-stat="fta_per_g" >2.0</td>
                    <td class="right " data-stat="ft_pct" >.786</td>
                    <td class="right " data-stat="orb_per_g" >0.6</td>
                    <td class="right " data-stat="drb_per_g" >3.3</td>
                    <td class="right " data-stat="trb_per_g" >3.9</td>
                    <td class="right " data-stat="ast_per_g" >0.9</td>
                    <td class="right " data-stat="stl_per_g" >0.7</td>
                    <td class="right " data-stat="blk_per_g" >1.0</td>
                    <td class="right " data-stat="tov_per_g" >1.1</td>
                    <td class="right " data-stat="pf_per_g" >2.1</td>
                    <td class="right " data-stat="pts_per_g" >16.7</td>
                </tr>
                <tr >
                    <th scope="row" class="center " data-stat="ranker" >6</th>
                    <td class="left " data-stat="player" csk="Monk,Malik" >
                        <a href='/players/m/monkma01.html'>Malik Monk</a>
                    </td>
                    <td class="center " data-stat="age" >23</td>
                    <td class="right " data-stat="g" >
                        <a href="/players/m/monkma01/gamelog/2022/">7</a>
                    </td>
                    <td class="right " data-stat="gs" >2</td>
                    <td class="right " data-stat="mp_per_g" >21.7</td>
                    <td class="right " data-stat="fg_per_g" >2.6</td>
                    <td class="right " data-stat="fga_per_g" >6.6</td>
                    <td class="right " data-stat="fg_pct" >.391</td>
                    <td class="right " data-stat="fg3_per_g" >1.4</td>
                    <td class="right " data-stat="fg3a_per_g" >4.3</td>
                    <td class="right " data-stat="fg3_pct" >.333</td>
                    <td class="right " data-stat="fg2_per_g" >1.1</td>
                    <td class="right " data-stat="fg2a_per_g" >2.3</td>
                    <td class="right " data-stat="fg2_pct" >.500</td>
                    <td class="right " data-stat="efg_pct" >.500</td>
                    <td class="right " data-stat="ft_per_g" >0.7</td>
                    <td class="right " data-stat="fta_per_g" >0.9</td>
                    <td class="right " data-stat="ft_pct" >.833</td>
                    <td class="right " data-stat="orb_per_g" >0.4</td>
                    <td class="right " data-stat="drb_per_g" >1.3</td>
                    <td class="right " data-stat="trb_per_g" >1.7</td>
                    <td class="right " data-stat="ast_per_g" >1.7</td>
                    <td class="right " data-stat="stl_per_g" >0.7</td>
                    <td class="right iz" data-stat="blk_per_g" >0.0</td>
                    <td class="right " data-stat="tov_per_g" >0.7</td>
                    <td class="right " data-stat="pf_per_g" >0.9</td>
                    <td class="right " data-stat="pts_per_g" >7.3</td>
                </tr>
                <tr >
                    <th scope="row" class="center " data-stat="ranker" >7</th>
                    <td class="left " data-stat="player" csk="Reaves,Austin" >
                        <a href='/players/r/reaveau01.html'>Austin Reaves</a>
                    </td>
                    <td class="center " data-stat="age" >23</td>
                    <td class="right " data-stat="g" >
                        <a href="/players/r/reaveau01/gamelog/2022/">6</a>
                    </td>
                    <td class="right iz" data-stat="gs" >0</td>
                    <td class="right " data-stat="mp_per_g" >19.8</td>
                    <td class="right " data-stat="fg_per_g" >2.0</td>
                    <td class="right " data-stat="fga_per_g" >3.7</td>
                    <td class="right " data-stat="fg_pct" >.545</td>
                    <td class="right " data-stat="fg3_per_g" >0.8</td>
                    <td class="right " data-stat="fg3a_per_g" >2.2</td>
                    <td class="right " data-stat="fg3_pct" >.385</td>
                    <td class="right " data-stat="fg2_per_g" >1.2</td>
                    <td class="right " data-stat="fg2a_per_g" >1.5</td>
                    <td class="right " data-stat="fg2_pct" >.778</td>
                    <td class="right " data-stat="efg_pct" >.659</td>
                    <td class="right " data-stat="ft_per_g" >0.7</td>
                    <td class="right " data-stat="fta_per_g" >0.7</td>
                    <td class="right " data-stat="ft_pct" >1.000</td>
                    <td class="right iz" data-stat="orb_per_g" >0.0</td>
                    <td class="right " data-stat="drb_per_g" >1.5</td>
                    <td class="right " data-stat="trb_per_g" >1.5</td>
                    <td class="right " data-stat="ast_per_g" >1.0</td>
                    <td class="right iz" data-stat="stl_per_g" >0.0</td>
                    <td class="right " data-stat="blk_per_g" >0.2</td>
                    <td class="right " data-stat="tov_per_g" >1.0</td>
                    <td class="right " data-stat="pf_per_g" >1.7</td>
                    <td class="right " data-stat="pts_per_g" >5.5</td>
                </tr>
                <tr >
                    <th scope="row" class="center " data-stat="ranker" >8</th>
                    <td class="left " data-stat="player" csk="Rondo,Rajon" >
                        <a href='/players/r/rondora01.html'>Rajon Rondo</a>
                    </td>
                    <td class="center " data-stat="age" >35</td>
                    <td class="right " data-stat="g" >
                        <a href="/players/r/rondora01/gamelog/2022/">4</a>
                    </td>
                    <td class="right iz" data-stat="gs" >0</td>
                    <td class="right " data-stat="mp_per_g" >17.5</td>
                    <td class="right " data-stat="fg_per_g" >2.5</td>
                    <td class="right " data-stat="fga_per_g" >6.3</td>
                    <td class="right " data-stat="fg_pct" >.400</td>
                    <td class="right " data-stat="fg3_per_g" >1.0</td>
                    <td class="right " data-stat="fg3a_per_g" >2.3</td>
                    <td class="right " data-stat="fg3_pct" >.444</td>
                    <td class="right " data-stat="fg2_per_g" >1.5</td>
                    <td class="right " data-stat="fg2a_per_g" >4.0</td>
                    <td class="right " data-stat="fg2_pct" >.375</td>
                    <td class="right " data-stat="efg_pct" >.480</td>
                    <td class="right iz" data-stat="ft_per_g" >0.0</td>
                    <td class="right iz" data-stat="fta_per_g" >0.0</td>
                    <td class="right iz" data-stat="ft_pct" ></td>
                    <td class="right " data-stat="orb_per_g" >0.3</td>
                    <td class="right " data-stat="drb_per_g" >1.5</td>
                    <td class="right " data-stat="trb_per_g" >1.8</td>
                    <td class="right " data-stat="ast_per_g" >4.3</td>
                    <td class="right " data-stat="stl_per_g" >1.0</td>
                    <td class="right iz" data-stat="blk_per_g" >0.0</td>
                    <td class="right " data-stat="tov_per_g" >2.3</td>
                    <td class="right " data-stat="pf_per_g" >1.5</td>
                    <td class="right " data-stat="pts_per_g" >6.0</td>
                </tr>
                <tr >
                    <th scope="row" class="center " data-stat="ranker" >9</th>
                    <td class="left " data-stat="player" csk="Bradley,Avery" >
                        <a href='/players/b/bradlav01.html'>Avery Bradley</a>
                    </td>
                    <td class="center " data-stat="age" >31</td>
                    <td class="right " data-stat="g" >
                        <a href="/players/b/bradlav01/gamelog/2022/">6</a>
                    </td>
                    <td class="right " data-stat="gs" >1</td>
                    <td class="right " data-stat="mp_per_g" >16.8</td>
                    <td class="right " data-stat="fg_per_g" >1.8</td>
                    <td class="right " data-stat="fga_per_g" >3.8</td>
                    <td class="right " data-stat="fg_pct" >.478</td>
                    <td class="right " data-stat="fg3_per_g" >1.0</td>
                    <td class="right " data-stat="fg3a_per_g" >2.3</td>
                    <td class="right " data-stat="fg3_pct" >.429</td>
                    <td class="right " data-stat="fg2_per_g" >0.8</td>
                    <td class="right " data-stat="fg2a_per_g" >1.5</td>
                    <td class="right " data-stat="fg2_pct" >.556</td>
                    <td class="right " data-stat="efg_pct" >.609</td>
                    <td class="right iz" data-stat="ft_per_g" >0.0</td>
                    <td class="right iz" data-stat="fta_per_g" >0.0</td>
                    <td class="right iz" data-stat="ft_pct" ></td>
                    <td class="right " data-stat="orb_per_g" >0.5</td>
                    <td class="right " data-stat="drb_per_g" >0.8</td>
                    <td class="right " data-stat="trb_per_g" >1.3</td>
                    <td class="right " data-stat="ast_per_g" >0.2</td>
                    <td class="right " data-stat="stl_per_g" >0.5</td>
                    <td class="right " data-stat="blk_per_g" >0.2</td>
                    <td class="right " data-stat="tov_per_g" >0.3</td>
                    <td class="right " data-stat="pf_per_g" >1.7</td>
                    <td class="right " data-stat="pts_per_g" >4.7</td>
                </tr>
                <tr >
                    <th scope="row" class="center " data-stat="ranker" >10</th>
                    <td class="left " data-stat="player" csk="Howard,Dwight" >
                        <a href='/players/h/howardw01.html'>Dwight Howard</a>
                    </td>
                    <td class="center " data-stat="age" >36</td>
                    <td class="right " data-stat="g" >
                        <a href="/players/h/howardw01/gamelog/2022/">6</a>
                    </td>
                    <td class="right iz" data-stat="gs" >0</td>
                    <td class="right " data-stat="mp_per_g" >15.2</td>
                    <td class="right " data-stat="fg_per_g" >1.3</td>
                    <td class="right " data-stat="fga_per_g" >1.8</td>
                    <td class="right " data-stat="fg_pct" >.727</td>
                    <td class="right " data-stat="fg3_per_g" >0.2</td>
                    <td class="right " data-stat="fg3a_per_g" >0.2</td>
                    <td class="right " data-stat="fg3_pct" >1.000</td>
                    <td class="right " data-stat="fg2_per_g" >1.2</td>
                    <td class="right " data-stat="fg2a_per_g" >1.7</td>
                    <td class="right " data-stat="fg2_pct" >.700</td>
                    <td class="right " data-stat="efg_pct" >.773</td>
                    <td class="right " data-stat="ft_per_g" >1.5</td>
                    <td class="right " data-stat="fta_per_g" >1.8</td>
                    <td class="right " data-stat="ft_pct" >.818</td>
                    <td class="right " data-stat="orb_per_g" >0.3</td>
                    <td class="right " data-stat="drb_per_g" >3.7</td>
                    <td class="right " data-stat="trb_per_g" >4.0</td>
                    <td class="right " data-stat="ast_per_g" >0.5</td>
                    <td class="right " data-stat="stl_per_g" >1.0</td>
                    <td class="right " data-stat="blk_per_g" >0.5</td>
                    <td class="right " data-stat="tov_per_g" >0.7</td>
                    <td class="right " data-stat="pf_per_g" >2.0</td>
                    <td class="right " data-stat="pts_per_g" >4.3</td>
                </tr>
                <tr >
                    <th scope="row" class="center " data-stat="ranker" >11</th>
                    <td class="left " data-stat="player" csk="Jordan,DeAndre" >
                        <a href='/players/j/jordade01.html'>DeAndre Jordan</a>
                    </td>
                    <td class="center " data-stat="age" >33</td>
                    <td class="right " data-stat="g" >
                        <a href="/players/j/jordade01/gamelog/2022/">7</a>
                    </td>
                    <td class="right " data-stat="gs" >6</td>
                    <td class="right " data-stat="mp_per_g" >14.0</td>
                    <td class="right " data-stat="fg_per_g" >2.6</td>
                    <td class="right " data-stat="fga_per_g" >3.0</td>
                    <td class="right " data-stat="fg_pct" >.857</td>
                    <td class="right iz" data-stat="fg3_per_g" >0.0</td>
                    <td class="right iz" data-stat="fg3a_per_g" >0.0</td>
                    <td class="right iz" data-stat="fg3_pct" ></td>
                    <td class="right " data-stat="fg2_per_g" >2.6</td>
                    <td class="right " data-stat="fg2a_per_g" >3.0</td>
                    <td class="right " data-stat="fg2_pct" >.857</td>
                    <td class="right " data-stat="efg_pct" >.857</td>
                    <td class="right " data-stat="ft_per_g" >0.1</td>
                    <td class="right " data-stat="fta_per_g" >0.3</td>
                    <td class="right " data-stat="ft_pct" >.500</td>
                    <td class="right " data-stat="orb_per_g" >1.6</td>
                    <td class="right " data-stat="drb_per_g" >3.7</td>
                    <td class="right " data-stat="trb_per_g" >5.3</td>
                    <td class="right " data-stat="ast_per_g" >0.7</td>
                    <td class="right " data-stat="stl_per_g" >0.4</td>
                    <td class="right " data-stat="blk_per_g" >1.4</td>
                    <td class="right " data-stat="tov_per_g" >0.3</td>
                    <td class="right " data-stat="pf_per_g" >2.1</td>
                    <td class="right " data-stat="pts_per_g" >5.3</td>
                </tr>
            </tbody>
        </table>
    </div>
</div>
</div>
</div>
</div>
</body>
</html>""".trimIndent()
}
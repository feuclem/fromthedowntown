package com.app.downtown

import com.app.downtown.domain.Average
import com.app.downtown.domain.player.EndPlayer
import com.app.downtown.domain.Position.*
import com.app.downtown.domain.team.Team.*

object PlayerDummy {

    val jamesHarden = EndPlayer(
        firstName = "James",
        lastName = "Harden",
        team = BROOKLYN_NETS,
        number = "13",
        position = POINT_GUARD,
        average = Average(26.1, 8.9, 11.2)
    )

    val joelEmbiid = EndPlayer(
        firstName = "Joel",
        lastName = "Embiid",
        team = PHILADELPHIA_76_ERS,
        number = "21",
        position = CENTER,
        average = Average(29.9, 11.5, 3.3)
    )

    val zionWilliamson = EndPlayer(
        firstName = "Zion",
        lastName = "Williamson",
        team = NEW_ORLEANS_PELICANS,
        number = "1",
        position = POWER_FORWARD,
        average = Average(26.4, 7.1, 3.5)
    )

    val tylerHerro = EndPlayer(
        firstName = "Tyler",
        lastName = "Heroo",
        team = MIAMI_HEAT,
        number = "14",
        position = POINT_GUARD,
        average = Average(15.7, 5.2, 3.5)
    )

    val lameloBall = EndPlayer(
        firstName = "LaMelo",
        lastName = "Ball",
        team = CHARLOTTE_HORNETS,
        number = "1",
        position = POINT_GUARD,
        average = Average(15.9, 5.9, 6.1)
    )

    val tobiasHarris = EndPlayer(
        firstName = "Tobias",
        lastName = "Harris",
        team = PHILADELPHIA_76_ERS,
        number = "12",
        position = SMALL_FORWARD,
        average = Average(20.5, 7.3, 3.6)
    )

    val rudyGobert = EndPlayer(
        firstName = "Rudy",
        lastName = "Gobert",
        team = UTAH_JAZZ,
        number = "27",
        position = CENTER,
        average = Average(14.6, 1.3, 13.3)
    )

    val donovanMitchell = EndPlayer(
        firstName = "Donovan",
        lastName = "Mitchell",
        team = UTAH_JAZZ,
        number = "45",
        position = SHOOTING_GUARD,
        average = Average(25.7, 4.5, 5.5)
    )

    val juliusRandle = EndPlayer(
        firstName = "Julius",
        lastName = "Randle",
        team = NEW_YORK_KNICKS,
        number = "30",
        position = POWER_FORWARD,
        average = Average(23.1, 5.8, 10.8)
    )

    val stephenCurry = EndPlayer(
        firstName = "Stephen",
        lastName = "Curry",
        team = GOLDEN_STATE_WARRIORS,
        number = "30",
        position = POINT_GUARD,
        average = Average(29.2, 5.5, 6.1)
    )

    val nikolaJokic = EndPlayer(
        firstName = "Nikola",
        lastName = "Jokic",
        team = DENVER_NUGGETS,
        number = "15",
        position = CENTER,
        average = Average(26.5, 11.0, 8.4)
    )

    val luguentzDort = EndPlayer(
        firstName = "Luguentz",
        lastName = "Dort",
        team = OKLAHOMA_CITY_THUNDER,
        number = "5",
        position = SMALL_FORWARD,
        average = Average(12.6, 3.4, 1.6)
    )

    val karlAntonyTowns = EndPlayer(
        firstName = "Karl-Anthony",
        lastName = "Towns",
        team = MINNESOTA_TIMBERWOLVES,
        number = "32",
        position = CENTER,
        average = Average(24.6, 11.0, 4.3)
    )

    val jimmyButler = EndPlayer(
        firstName = "Jimmy",
        lastName = "Butler",
        team = MIAMI_HEAT,
        number = "22",
        position = SMALL_FORWARD,
        average = Average(21.2, 7.5, 7.3)
    )

    val devinBooker = EndPlayer(
        firstName = "Devin",
        lastName = "Booker",
        team = PHOENIX_SUNS,
        number = "1",
        position = SHOOTING_GUARD,
        average = Average(25.6, 4.1, 4.5)
    )

    val jakobPoeltl = EndPlayer(
        firstName = "Jakob",
        lastName = "Poeltl",
        team = SAN_ANTONIO_SPURS,
        number = "25",
        position = CENTER,
        average = Average(8.0, 1.8, 8.1)
    )

    val aaronGordon = EndPlayer(
        firstName = "Aaron",
        lastName = "Gordon",
        team = DENVER_NUGGETS,
        number = "50",
        position = POWER_FORWARD,
        average = Average(14.5, 6.4, 4.0)
    )

    val garrisonMathews = EndPlayer(
        firstName = "Garrison",
        lastName = "Mathews",
        team = WASHINGTON_WIZARDS,
        number = "24",
        position = SHOOTING_GUARD,
        average = Average(6.5, 0.5, 1.6)
    )

    val grantWilliams = EndPlayer(
        firstName = "Grant",
        lastName = "Williams",
        team = BOSTON_CELTICS,
        number = "12",
        position = POWER_FORWARD,
        average = Average(4.7, 3.0, 1.0)
    )

    val aaronHoliday = EndPlayer(
        firstName = "Aaron",
        lastName = "Holiday",
        team = BOSTON_CELTICS,
        number = "3",
        position = POINT_GUARD,
        average = Average(7.0, 1.2, 1.7)
    )

    val isaiahStewart = EndPlayer(
        firstName = "Isaiah",
        lastName = "Stewart",
        team = DETROIT_PISTONS,
        number = "28",
        position = POWER_FORWARD,
        average = Average(6.3, 5.8, 0.8)
    )

    val lamarcusAldridge = EndPlayer(
        firstName = "LaMarcus",
        lastName = "Aldridge",
        team = BROOKLYN_NETS,
        number = "21",
        position = CENTER,
        average = Average(13.5, 4.6, 1.9)
    )

    val chrisPaul = EndPlayer(
        firstName = "Chris",
        lastName = "Paul",
        team = PHOENIX_SUNS,
        number = "3",
        position = POINT_GUARD,
        average = Average(16.0, 4.7, 8.7)
    )

    val kawhiLeonard = EndPlayer(
        firstName = "Kawhi",
        lastName = "Leonard",
        team = LOS_ANGELES_CLIPPERS,
        number = "2",
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
<html data-version="klecko-" data-root="/home/bbr/build" itemscope itemtype="https://schema.org/WebSite" lang="en"
      class="no-js">

<body class="bbr">
<div id="wrap">
    <div id="content" role="main">
        <div id="all_roster" class="table_wrapper">

            <div class="section_heading assoc_roster" id="roster_sh">
                <span class="section_anchor" id="roster_link" data-label="Roster"></span>
                <h2>Roster</h2>
                <div class="section_heading_text">
                    <ul>
                        <li><span class='note'>(TW) - Signed to two-way contract w/ G-League affiliate</span></li>
                    </ul>
                </div>

            </div>
            <div class="table_container" id="div_roster">

                <table class="sortable stats_table" id="roster" data-cols-to-freeze=",2">
                    <caption>Roster Table</caption>

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
                    </colgroup>
                    <thead>
                    <tr>
                        <th aria-label="Uniform Number" data-stat="number" scope="col"
                            class=" poptip sort_default_asc center" data-tip="Uniform Number">No.</th>
                        <th aria-label="Player" data-stat="player" scope="col"
                            class=" poptip sort_default_asc center">Player</th>
                        <th aria-label="Position" data-stat="pos" scope="col"
                            class=" poptip sort_default_asc center" data-tip="Position">Pos</th>
                        <th aria-label="Height" data-stat="height" scope="col"
                            class=" poptip sort_default_asc center" data-tip="Height">Ht</th>
                        <th aria-label="Weight" data-stat="weight" scope="col"
                            class=" poptip sort_default_asc center" data-tip="Weight">Wt</th>
                        <th aria-label="Birth Date" data-stat="birth_date" scope="col"
                            class=" poptip sort_default_asc center">Birth Date</th>
                        <th aria-label="&nbsp;" data-stat="birth_country" scope="col" class=" poptip center">&nbsp;
                        </th>
                        <th aria-label="Years experience in NBA/ABA (prior to this season)"
                            data-stat="years_experience" scope="col" class=" poptip sort_default_asc center"
                            data-tip="Years experience in NBA/ABA (prior to this season)">Exp</th>
                        <th aria-label="College" data-stat="college" scope="col"
                            class=" poptip sort_default_asc center">College</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <th scope="row" class="center iz" data-stat="number">0</th>
                        <td class="left " data-stat="player" csk="Westbrook,Russell"><a
                                href='/players/w/westbru01.html'>Russell Westbrook</a></td>
                        <td class="center " data-stat="pos" csk="1">PG</td>
                        <td class="right " data-stat="height" csk="75.0">6-3</td>
                        <td class="right " data-stat="weight">200</td>
                        <td class="left " data-stat="birth_date" csk="19881112">November 12, 1988</td>
                        <td class="right " data-stat="birth_country"><span class="f-i f-us" style="">us</span></td>
                        <td class="right " data-stat="years_experience" csk="13">13</td>
                        <td class="left " data-stat="college"><a href='/friv/colleges.fcgi?college=ucla'>UCLA</a>
                        </td>
                    </tr>
                    <tr>
                        <th scope="row" class="center " data-stat="number">7</th>
                        <td class="left " data-stat="player" csk="Anthony,Carmelo"><a
                                href='/players/a/anthoca01.html'>Carmelo Anthony</a></td>
                        <td class="center " data-stat="pos" csk="4">PF</td>
                        <td class="right " data-stat="height" csk="79.0">6-7</td>
                        <td class="right " data-stat="weight">238</td>
                        <td class="left " data-stat="birth_date" csk="19840529">May 29, 1984</td>
                        <td class="right " data-stat="birth_country"><span class="f-i f-us" style="">us</span></td>
                        <td class="right " data-stat="years_experience" csk="18">18</td>
                        <td class="left " data-stat="college"><a
                                href='/friv/colleges.fcgi?college=syracuse'>Syracuse</a></td>
                    </tr>
                    <tr>
                        <th scope="row" class="center " data-stat="number">6</th>
                        <td class="left " data-stat="player" csk="James,LeBron"><a
                                href='/players/j/jamesle01.html'>LeBron James</a></td>
                        <td class="center " data-stat="pos" csk="3">SF</td>
                        <td class="right " data-stat="height" csk="81.0">6-9</td>
                        <td class="right " data-stat="weight">250</td>
                        <td class="left " data-stat="birth_date" csk="19841230">December 30, 1984</td>
                        <td class="right " data-stat="birth_country"><span class="f-i f-us" style="">us</span></td>
                        <td class="right " data-stat="years_experience" csk="18">18</td>
                        <td class="left iz" data-stat="college"></td>
                    </tr>
                </table>
            </div>
        </div>
        <div id="all_per_game-playoffs_per_game" class="table_wrapper tabbed">
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
                        <th aria-label="Rank" data-stat="ranker" scope="col"
                            class="ranker poptip sort_default_asc show_partial_when_sorting center"
                            data-tip="Rank">Rk</th>
                        <th aria-label="&nbsp;" data-stat="player" scope="col"
                            class=" poptip sort_default_asc center">&nbsp;</th>
                        <th aria-label="Player's age on February 1 of the season" data-stat="age" scope="col"
                            class=" poptip sort_default_asc center"
                            data-tip="Player's age on February 1 of the season">Age</th>
                        <th aria-label="Games" data-stat="g" scope="col" class=" poptip center"
                            data-tip="Games">G</th>
                        <th aria-label="Games Started" data-stat="gs" scope="col" class=" poptip center"
                            data-tip="Games Started">GS</th>
                        <th aria-label="Minutes Played Per Game" data-stat="mp_per_g" scope="col"
                            class=" poptip center" data-tip="Minutes Played Per Game">MP</th>
                        <th aria-label="Field Goals Per Game" data-stat="fg_per_g" scope="col"
                            class=" poptip center" data-tip="Field Goals Per Game">FG</th>
                        <th aria-label="Field Goal Attempts Per Game" data-stat="fga_per_g" scope="col"
                            class=" poptip center" data-tip="Field Goal Attempts Per Game">FGA</th>
                        <th aria-label="Field Goal Percentage" data-stat="fg_pct" scope="col"
                            class=" poptip center" data-tip="Field Goal Percentage">FG%</th>
                        <th aria-label="3-Point Field Goals Per Game" data-stat="fg3_per_g" scope="col"
                            class=" poptip center" data-tip="3-Point Field Goals Per Game">3P</th>
                        <th aria-label="3-Point Field Goal Attempts Per Game" data-stat="fg3a_per_g" scope="col"
                            class=" poptip center" data-tip="3-Point Field Goal Attempts Per Game">3PA</th>
                        <th aria-label="3-Point Field Goal Percentage" data-stat="fg3_pct" scope="col"
                            class=" poptip center" data-tip="3-Point Field Goal Percentage">3P%</th>
                        <th aria-label="2-Point Field Goals Per Game" data-stat="fg2_per_g" scope="col"
                            class=" poptip center" data-tip="2-Point Field Goals Per Game">2P</th>
                        <th aria-label="2-Point Field Goal Attempts Per Game" data-stat="fg2a_per_g" scope="col"
                            class=" poptip center" data-tip="2-Point Field Goal Attempts Per Game">2PA</th>
                        <th aria-label="2-Point Field Goal Percentage" data-stat="fg2_pct" scope="col"
                            class=" poptip center" data-tip="2-Point Field Goal Percentage">2P%</th>
                        <th aria-label="Effective Field Goal Percentage" data-stat="efg_pct" scope="col"
                            class=" poptip center"
                            data-tip="<strong>Effective Field Goal Percentage</strong><br>This statistic adjusts for the fact that a 3-point field goal is worth one more point than a 2-point field goal.">
                            eFG%</th>
                        <th aria-label="Free Throws Per Game" data-stat="ft_per_g" scope="col"
                            class=" poptip center" data-tip="Free Throws Per Game">FT</th>
                        <th aria-label="Free Throw Attempts Per Game" data-stat="fta_per_g" scope="col"
                            class=" poptip center" data-tip="Free Throw Attempts Per Game">FTA</th>
                        <th aria-label="Free Throw Percentage" data-stat="ft_pct" scope="col"
                            class=" poptip center" data-tip="Free Throw Percentage">FT%</th>
                        <th aria-label="Offensive Rebounds Per Game" data-stat="orb_per_g" scope="col"
                            class=" poptip center" data-tip="Offensive Rebounds Per Game">ORB</th>
                        <th aria-label="Defensive Rebounds Per Game" data-stat="drb_per_g" scope="col"
                            class=" poptip center" data-tip="Defensive Rebounds Per Game">DRB</th>
                        <th aria-label="Total Rebounds Per Game" data-stat="trb_per_g" scope="col"
                            class=" poptip center" data-tip="Total Rebounds Per Game">TRB</th>
                        <th aria-label="Assists Per Game" data-stat="ast_per_g" scope="col"
                            class=" poptip center" data-tip="Assists Per Game">AST</th>
                        <th aria-label="Steals Per Game" data-stat="stl_per_g" scope="col"
                            class=" poptip center" data-tip="Steals Per Game">STL</th>
                        <th aria-label="Blocks Per Game" data-stat="blk_per_g" scope="col"
                            class=" poptip center" data-tip="Blocks Per Game">BLK</th>
                        <th aria-label="Turnovers Per Game" data-stat="tov_per_g" scope="col"
                            class=" poptip center" data-tip="Turnovers Per Game">TOV</th>
                        <th aria-label="Personal Fouls Per Game" data-stat="pf_per_g" scope="col"
                            class=" poptip center" data-tip="Personal Fouls Per Game">PF</th>
                        <th aria-label="Points Per Game" data-stat="pts_per_g" scope="col"
                            class=" poptip center" data-tip="Points Per Game">PTS/G</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <th scope="row" class="center " data-stat="ranker">1</th>
                        <td class="left " data-stat="player" csk="James,LeBron"><a
                                href='/players/j/jamesle01.html'>LeBron James</a></td>
                        <td class="center " data-stat="age">37</td>
                        <td class="right " data-stat="g"><a href="/players/j/jamesle01/gamelog/2022/">28</a>
                        </td>
                        <td class="right " data-stat="gs">28</td>
                        <td class="right " data-stat="mp_per_g">36.9</td>
                        <td class="right " data-stat="fg_per_g">10.7</td>
                        <td class="right " data-stat="fga_per_g">20.5</td>
                        <td class="right " data-stat="fg_pct">.521</td>
                        <td class="right " data-stat="fg3_per_g">2.9</td>
                        <td class="right " data-stat="fg3a_per_g">7.9</td>
                        <td class="right " data-stat="fg3_pct">.365</td>
                        <td class="right " data-stat="fg2_per_g">7.8</td>
                        <td class="right " data-stat="fg2a_per_g">12.6</td>
                        <td class="right " data-stat="fg2_pct">.619</td>
                        <td class="right " data-stat="efg_pct">.591</td>
                        <td class="right " data-stat="ft_per_g">4.4</td>
                        <td class="right " data-stat="fta_per_g">5.7</td>
                        <td class="right " data-stat="ft_pct">.780</td>
                        <td class="right " data-stat="orb_per_g">1.0</td>
                        <td class="right " data-stat="drb_per_g">6.4</td>
                        <td class="right " data-stat="trb_per_g">7.4</td>
                        <td class="right " data-stat="ast_per_g">6.6</td>
                        <td class="right " data-stat="stl_per_g">1.8</td>
                        <td class="right " data-stat="blk_per_g">1.2</td>
                        <td class="right " data-stat="tov_per_g">3.3</td>
                        <td class="right " data-stat="pf_per_g">2.3</td>
                        <td class="right " data-stat="pts_per_g">28.7</td>
                    </tr>
                    <tr>
                        <th scope="row" class="center " data-stat="ranker">2</th>
                        <td class="left " data-stat="player" csk="Westbrook,Russell"><a
                                href='/players/w/westbru01.html'>Russell Westbrook</a></td>
                        <td class="center " data-stat="age">33</td>
                        <td class="right " data-stat="g"><a href="/players/w/westbru01/gamelog/2022/">40</a>
                        </td>
                        <td class="right " data-stat="gs">40</td>
                        <td class="right " data-stat="mp_per_g">35.7</td>
                        <td class="right " data-stat="fg_per_g">7.3</td>
                        <td class="right " data-stat="fga_per_g">16.3</td>
                        <td class="right " data-stat="fg_pct">.449</td>
                        <td class="right " data-stat="fg3_per_g">1.1</td>
                        <td class="right " data-stat="fg3a_per_g">3.5</td>
                        <td class="right " data-stat="fg3_pct">.300</td>
                        <td class="right " data-stat="fg2_per_g">6.3</td>
                        <td class="right " data-stat="fg2a_per_g">12.8</td>
                        <td class="right " data-stat="fg2_pct">.489</td>
                        <td class="right " data-stat="efg_pct">.481</td>
                        <td class="right " data-stat="ft_per_g">3.6</td>
                        <td class="right " data-stat="fta_per_g">5.5</td>
                        <td class="right " data-stat="ft_pct">.650</td>
                        <td class="right " data-stat="orb_per_g">1.4</td>
                        <td class="right " data-stat="drb_per_g">6.8</td>
                        <td class="right " data-stat="trb_per_g">8.1</td>
                        <td class="right " data-stat="ast_per_g">8.3</td>
                        <td class="right " data-stat="stl_per_g">1.2</td>
                        <td class="right " data-stat="blk_per_g">0.3</td>
                        <td class="right " data-stat="tov_per_g">4.6</td>
                        <td class="right " data-stat="pf_per_g">3.2</td>
                        <td class="right " data-stat="pts_per_g">19.3</td>
                    </tr>
                    <tr>
                        <th scope="row" class="center " data-stat="ranker">3</th>
                        <td class="left " data-stat="player" csk="Davis,Anthony"><a
                                href='/players/d/davisan02.html'>Anthony Davis</a></td>
                        <td class="center " data-stat="age">28</td>
                        <td class="right " data-stat="g"><a href="/players/d/davisan02/gamelog/2022/">27</a>
                        </td>
                        <td class="right " data-stat="gs">27</td>
                        <td class="right " data-stat="mp_per_g">35.4</td>
                        <td class="right " data-stat="fg_per_g">9.3</td>
                        <td class="right " data-stat="fga_per_g">17.9</td>
                        <td class="right " data-stat="fg_pct">.521</td>
                        <td class="right " data-stat="fg3_per_g">0.4</td>
                        <td class="right " data-stat="fg3a_per_g">2.1</td>
                        <td class="right " data-stat="fg3_pct">.179</td>
                        <td class="right " data-stat="fg2_per_g">8.9</td>
                        <td class="right " data-stat="fg2a_per_g">15.8</td>
                        <td class="right " data-stat="fg2_pct">.566</td>
                        <td class="right " data-stat="efg_pct">.531</td>
                        <td class="right " data-stat="ft_per_g">4.3</td>
                        <td class="right " data-stat="fta_per_g">6.0</td>
                        <td class="right " data-stat="ft_pct">.727</td>
                        <td class="right " data-stat="orb_per_g">2.7</td>
                        <td class="right " data-stat="drb_per_g">7.1</td>
                        <td class="right " data-stat="trb_per_g">9.9</td>
                        <td class="right " data-stat="ast_per_g">2.9</td>
                        <td class="right " data-stat="stl_per_g">1.2</td>
                        <td class="right " data-stat="blk_per_g">2.0</td>
                        <td class="right " data-stat="tov_per_g">2.2</td>
                        <td class="right " data-stat="pf_per_g">2.3</td>
                        <td class="right " data-stat="pts_per_g">23.3</td>
                    </tr>
                    <tr>
                        <th scope="row" class="center " data-stat="ranker">4</th>
                        <td class="left " data-stat="player" csk="Horton-Tucker,Talen"><a
                                href='/players/h/hortota01.html'>Talen Horton-Tucker</a></td>
                        <td class="center " data-stat="age">21</td>
                        <td class="right " data-stat="g"><a href="/players/h/hortota01/gamelog/2022/">24</a>
                        </td>
                        <td class="right " data-stat="gs">15</td>
                        <td class="right " data-stat="mp_per_g">28.3</td>
                        <td class="right " data-stat="fg_per_g">4.1</td>
                        <td class="right " data-stat="fga_per_g">10.2</td>
                        <td class="right " data-stat="fg_pct">.404</td>
                        <td class="right " data-stat="fg3_per_g">0.7</td>
                        <td class="right " data-stat="fg3a_per_g">3.2</td>
                        <td class="right " data-stat="fg3_pct">.224</td>
                        <td class="right " data-stat="fg2_per_g">3.4</td>
                        <td class="right " data-stat="fg2a_per_g">7.0</td>
                        <td class="right " data-stat="fg2_pct">.485</td>
                        <td class="right " data-stat="efg_pct">.439</td>
                        <td class="right " data-stat="ft_per_g">1.9</td>
                        <td class="right " data-stat="fta_per_g">2.3</td>
                        <td class="right " data-stat="ft_pct">.836</td>
                        <td class="right " data-stat="orb_per_g">0.8</td>
                        <td class="right " data-stat="drb_per_g">3.3</td>
                        <td class="right " data-stat="trb_per_g">4.0</td>
                        <td class="right " data-stat="ast_per_g">2.8</td>
                        <td class="right " data-stat="stl_per_g">1.0</td>
                        <td class="right " data-stat="blk_per_g">0.4</td>
                        <td class="right " data-stat="tov_per_g">1.5</td>
                        <td class="right " data-stat="pf_per_g">2.8</td>
                        <td class="right " data-stat="pts_per_g">10.9</td>
                    </tr>
                    <tr>
                        <th scope="row" class="center " data-stat="ranker">5</th>
                        <td class="left " data-stat="player" csk="Anthony,Carmelo"><a
                                href='/players/a/anthoca01.html'>Carmelo Anthony</a></td>
                        <td class="center " data-stat="age">37</td>
                        <td class="right " data-stat="g"><a href="/players/a/anthoca01/gamelog/2022/">40</a>
                        </td>
                        <td class="right " data-stat="gs">3</td>
                        <td class="right " data-stat="mp_per_g">27.1</td>
                        <td class="right " data-stat="fg_per_g">4.6</td>
                        <td class="right " data-stat="fga_per_g">10.6</td>
                        <td class="right " data-stat="fg_pct">.430</td>
                        <td class="right " data-stat="fg3_per_g">2.4</td>
                        <td class="right " data-stat="fg3a_per_g">6.1</td>
                        <td class="right " data-stat="fg3_pct">.395</td>
                        <td class="right " data-stat="fg2_per_g">2.2</td>
                        <td class="right " data-stat="fg2a_per_g">4.5</td>
                        <td class="right " data-stat="fg2_pct">.478</td>
                        <td class="right " data-stat="efg_pct">.544</td>
                        <td class="right " data-stat="ft_per_g">1.9</td>
                        <td class="right " data-stat="fta_per_g">2.3</td>
                        <td class="right " data-stat="ft_pct">.804</td>
                        <td class="right " data-stat="orb_per_g">0.9</td>
                        <td class="right " data-stat="drb_per_g">3.4</td>
                        <td class="right " data-stat="trb_per_g">4.2</td>
                        <td class="right " data-stat="ast_per_g">1.0</td>
                        <td class="right " data-stat="stl_per_g">0.8</td>
                        <td class="right " data-stat="blk_per_g">0.8</td>
                        <td class="right " data-stat="tov_per_g">0.8</td>
                        <td class="right " data-stat="pf_per_g">2.3</td>
                        <td class="right " data-stat="pts_per_g">13.4</td>
                    </tr>
                    <tr>
                        <th scope="row" class="center " data-stat="ranker">6</th>
                        <td class="left " data-stat="player" csk="Monk,Malik"><a
                                href='/players/m/monkma01.html'>Malik Monk</a></td>
                        <td class="center " data-stat="age">23</td>
                        <td class="right " data-stat="g"><a href="/players/m/monkma01/gamelog/2022/">35</a></td>
                        <td class="right " data-stat="gs">8</td>
                        <td class="right " data-stat="mp_per_g">25.9</td>
                        <td class="right " data-stat="fg_per_g">4.5</td>
                        <td class="right " data-stat="fga_per_g">9.3</td>
                        <td class="right " data-stat="fg_pct">.481</td>
                        <td class="right " data-stat="fg3_per_g">2.1</td>
                        <td class="right " data-stat="fg3a_per_g">5.4</td>
                        <td class="right " data-stat="fg3_pct">.397</td>
                        <td class="right " data-stat="fg2_per_g">2.3</td>
                        <td class="right " data-stat="fg2a_per_g">3.9</td>
                        <td class="right " data-stat="fg2_pct">.600</td>
                        <td class="right " data-stat="efg_pct">.597</td>
                        <td class="right " data-stat="ft_per_g">1.1</td>
                        <td class="right " data-stat="fta_per_g">1.3</td>
                        <td class="right " data-stat="ft_pct">.844</td>
                        <td class="right " data-stat="orb_per_g">0.4</td>
                        <td class="right " data-stat="drb_per_g">2.4</td>
                        <td class="right " data-stat="trb_per_g">2.8</td>
                        <td class="right " data-stat="ast_per_g">2.2</td>
                        <td class="right " data-stat="stl_per_g">0.7</td>
                        <td class="right " data-stat="blk_per_g">0.4</td>
                        <td class="right " data-stat="tov_per_g">1.2</td>
                        <td class="right " data-stat="pf_per_g">1.5</td>
                        <td class="right " data-stat="pts_per_g">12.1</td>
                    </tr>
                    <tr>
                        <th scope="row" class="center " data-stat="ranker">7</th>
                        <td class="left " data-stat="player" csk="Thomas,Isaiah"><a
                                href='/players/t/thomais02.html'>Isaiah Thomas</a></td>
                        <td class="center " data-stat="age">32</td>
                        <td class="right " data-stat="g"><a href="/players/t/thomais02/gamelog/2022/">4</a></td>
                        <td class="right " data-stat="gs">1</td>
                        <td class="right " data-stat="mp_per_g">25.3</td>
                        <td class="right " data-stat="fg_per_g">3.0</td>
                        <td class="right " data-stat="fga_per_g">9.8</td>
                        <td class="right " data-stat="fg_pct">.308</td>
                        <td class="right " data-stat="fg3_per_g">1.3</td>
                        <td class="right " data-stat="fg3a_per_g">5.5</td>
                        <td class="right " data-stat="fg3_pct">.227</td>
                        <td class="right " data-stat="fg2_per_g">1.8</td>
                        <td class="right " data-stat="fg2a_per_g">4.3</td>
                        <td class="right " data-stat="fg2_pct">.412</td>
                        <td class="right " data-stat="efg_pct">.372</td>
                        <td class="right " data-stat="ft_per_g">2.0</td>
                        <td class="right " data-stat="fta_per_g">2.8</td>
                        <td class="right " data-stat="ft_pct">.727</td>
                        <td class="right " data-stat="orb_per_g">0.3</td>
                        <td class="right " data-stat="drb_per_g">1.8</td>
                        <td class="right " data-stat="trb_per_g">2.0</td>
                        <td class="right " data-stat="ast_per_g">1.5</td>
                        <td class="right iz" data-stat="stl_per_g">0.0</td>
                        <td class="right " data-stat="blk_per_g">0.5</td>
                        <td class="right " data-stat="tov_per_g">1.3</td>
                        <td class="right " data-stat="pf_per_g">3.0</td>
                        <td class="right " data-stat="pts_per_g">9.3</td>
                    </tr>
                    <tr>
                        <th scope="row" class="center " data-stat="ranker">8</th>
                        <td class="left " data-stat="player" csk="Johnson,Stanley"><a
                                href='/players/j/johnsst04.html'>Stanley Johnson</a></td>
                        <td class="center " data-stat="age">25</td>
                        <td class="right " data-stat="g"><a href="/players/j/johnsst04/gamelog/2022/">6</a></td>
                        <td class="right " data-stat="gs">4</td>
                        <td class="right " data-stat="mp_per_g">24.2</td>
                        <td class="right " data-stat="fg_per_g">2.0</td>
                        <td class="right " data-stat="fga_per_g">4.3</td>
                        <td class="right " data-stat="fg_pct">.462</td>
                        <td class="right " data-stat="fg3_per_g">0.7</td>
                        <td class="right " data-stat="fg3a_per_g">2.8</td>
                        <td class="right " data-stat="fg3_pct">.235</td>
                        <td class="right " data-stat="fg2_per_g">1.3</td>
                        <td class="right " data-stat="fg2a_per_g">1.5</td>
                        <td class="right " data-stat="fg2_pct">.889</td>
                        <td class="right " data-stat="efg_pct">.538</td>
                        <td class="right " data-stat="ft_per_g">1.5</td>
                        <td class="right " data-stat="fta_per_g">1.7</td>
                        <td class="right " data-stat="ft_pct">.900</td>
                        <td class="right " data-stat="orb_per_g">0.3</td>
                        <td class="right " data-stat="drb_per_g">2.3</td>
                        <td class="right " data-stat="trb_per_g">2.7</td>
                        <td class="right " data-stat="ast_per_g">1.5</td>
                        <td class="right " data-stat="stl_per_g">1.2</td>
                        <td class="right " data-stat="blk_per_g">0.5</td>
                        <td class="right " data-stat="tov_per_g">0.5</td>
                        <td class="right " data-stat="pf_per_g">4.2</td>
                        <td class="right " data-stat="pts_per_g">6.2</td>
                    </tr>
                    <tr>
                        <th scope="row" class="center " data-stat="ranker">9</th>
                        <td class="left " data-stat="player" csk="Bradley,Avery"><a
                                href='/players/b/bradlav01.html'>Avery Bradley</a></td>
                        <td class="center " data-stat="age">31</td>
                        <td class="right " data-stat="g"><a href="/players/b/bradlav01/gamelog/2022/">32</a>
                        </td>
                        <td class="right " data-stat="gs">27</td>
                        <td class="right " data-stat="mp_per_g">23.8</td>
                        <td class="right " data-stat="fg_per_g">2.7</td>
                        <td class="right " data-stat="fga_per_g">6.0</td>
                        <td class="right " data-stat="fg_pct">.443</td>
                        <td class="right " data-stat="fg3_per_g">1.4</td>
                        <td class="right " data-stat="fg3a_per_g">3.5</td>
                        <td class="right " data-stat="fg3_pct">.405</td>
                        <td class="right " data-stat="fg2_per_g">1.3</td>
                        <td class="right " data-stat="fg2a_per_g">2.5</td>
                        <td class="right " data-stat="fg2_pct">.494</td>
                        <td class="right " data-stat="efg_pct">.560</td>
                        <td class="right " data-stat="ft_per_g">0.2</td>
                        <td class="right " data-stat="fta_per_g">0.2</td>
                        <td class="right " data-stat="ft_pct">1.000</td>
                        <td class="right " data-stat="orb_per_g">0.5</td>
                        <td class="right " data-stat="drb_per_g">2.1</td>
                        <td class="right " data-stat="trb_per_g">2.6</td>
                        <td class="right " data-stat="ast_per_g">0.8</td>
                        <td class="right " data-stat="stl_per_g">0.9</td>
                        <td class="right " data-stat="blk_per_g">0.3</td>
                        <td class="right " data-stat="tov_per_g">0.5</td>
                        <td class="right " data-stat="pf_per_g">1.8</td>
                        <td class="right " data-stat="pts_per_g">6.9</td>
                    </tr>
                    <tr>
                        <th scope="row" class="center " data-stat="ranker">10</th>
                        <td class="left " data-stat="player" csk="Ellington,Wayne"><a
                                href='/players/e/ellinwa01.html'>Wayne Ellington</a></td>
                        <td class="center " data-stat="age">34</td>
                        <td class="right " data-stat="g"><a href="/players/e/ellinwa01/gamelog/2022/">27</a>
                        </td>
                        <td class="right " data-stat="gs">8</td>
                        <td class="right " data-stat="mp_per_g">21.1</td>
                        <td class="right " data-stat="fg_per_g">2.1</td>
                        <td class="right " data-stat="fga_per_g">5.6</td>
                        <td class="right " data-stat="fg_pct">.387</td>
                        <td class="right " data-stat="fg3_per_g">1.9</td>
                        <td class="right " data-stat="fg3a_per_g">5.1</td>
                        <td class="right " data-stat="fg3_pct">.377</td>
                        <td class="right " data-stat="fg2_per_g">0.2</td>
                        <td class="right " data-stat="fg2a_per_g">0.4</td>
                        <td class="right " data-stat="fg2_pct">.500</td>
                        <td class="right " data-stat="efg_pct">.560</td>
                        <td class="right " data-stat="ft_per_g">0.1</td>
                        <td class="right " data-stat="fta_per_g">0.2</td>
                        <td class="right " data-stat="ft_pct">.800</td>
                        <td class="right " data-stat="orb_per_g">0.3</td>
                        <td class="right " data-stat="drb_per_g">1.5</td>
                        <td class="right " data-stat="trb_per_g">1.7</td>
                        <td class="right " data-stat="ast_per_g">0.8</td>
                        <td class="right " data-stat="stl_per_g">0.5</td>
                        <td class="right " data-stat="blk_per_g">0.1</td>
                        <td class="right " data-stat="tov_per_g">0.5</td>
                        <td class="right " data-stat="pf_per_g">1.0</td>
                        <td class="right " data-stat="pts_per_g">6.4</td>
                    </tr>
                    <tr>
                        <th scope="row" class="center " data-stat="ranker">11</th>
                        <td class="left " data-stat="player" csk="Reaves,Austin"><a
                                href='/players/r/reaveau01.html'>Austin Reaves</a></td>
                        <td class="center " data-stat="age">23</td>
                        <td class="right " data-stat="g"><a href="/players/r/reaveau01/gamelog/2022/">21</a>
                        </td>
                        <td class="right iz" data-stat="gs">0</td>
                        <td class="right " data-stat="mp_per_g">20.2</td>
                        <td class="right " data-stat="fg_per_g">1.9</td>
                        <td class="right " data-stat="fga_per_g">3.8</td>
                        <td class="right " data-stat="fg_pct">.488</td>
                        <td class="right " data-stat="fg3_per_g">0.8</td>
                        <td class="right " data-stat="fg3a_per_g">2.3</td>
                        <td class="right " data-stat="fg3_pct">.354</td>
                        <td class="right " data-stat="fg2_per_g">1.0</td>
                        <td class="right " data-stat="fg2a_per_g">1.5</td>
                        <td class="right " data-stat="fg2_pct">.688</td>
                        <td class="right " data-stat="efg_pct">.594</td>
                        <td class="right " data-stat="ft_per_g">0.9</td>
                        <td class="right " data-stat="fta_per_g">1.0</td>
                        <td class="right " data-stat="ft_pct">.900</td>
                        <td class="right " data-stat="orb_per_g">0.3</td>
                        <td class="right " data-stat="drb_per_g">2.0</td>
                        <td class="right " data-stat="trb_per_g">2.4</td>
                        <td class="right " data-stat="ast_per_g">1.1</td>
                        <td class="right " data-stat="stl_per_g">0.3</td>
                        <td class="right " data-stat="blk_per_g">0.1</td>
                        <td class="right " data-stat="tov_per_g">0.6</td>
                        <td class="right " data-stat="pf_per_g">1.6</td>
                        <td class="right " data-stat="pts_per_g">5.4</td>
                    </tr>
                    <tr>
                        <th scope="row" class="center " data-stat="ranker">12</th>
                        <td class="left " data-stat="player" csk="Bazemore,Kent"><a
                                href='/players/b/bazemke01.html'>Kent Bazemore</a></td>
                        <td class="center " data-stat="age">32</td>
                        <td class="right " data-stat="g"><a href="/players/b/bazemke01/gamelog/2022/">23</a>
                        </td>
                        <td class="right " data-stat="gs">14</td>
                        <td class="right " data-stat="mp_per_g">17.4</td>
                        <td class="right " data-stat="fg_per_g">1.4</td>
                        <td class="right " data-stat="fga_per_g">4.3</td>
                        <td class="right " data-stat="fg_pct">.330</td>
                        <td class="right " data-stat="fg3_per_g">0.8</td>
                        <td class="right " data-stat="fg3a_per_g">2.3</td>
                        <td class="right " data-stat="fg3_pct">.340</td>
                        <td class="right " data-stat="fg2_per_g">0.7</td>
                        <td class="right " data-stat="fg2a_per_g">2.0</td>
                        <td class="right " data-stat="fg2_pct">.319</td>
                        <td class="right " data-stat="efg_pct">.420</td>
                        <td class="right " data-stat="ft_per_g">0.4</td>
                        <td class="right " data-stat="fta_per_g">0.6</td>
                        <td class="right " data-stat="ft_pct">.769</td>
                        <td class="right " data-stat="orb_per_g">0.3</td>
                        <td class="right " data-stat="drb_per_g">1.7</td>
                        <td class="right " data-stat="trb_per_g">2.0</td>
                        <td class="right " data-stat="ast_per_g">0.8</td>
                        <td class="right " data-stat="stl_per_g">0.8</td>
                        <td class="right " data-stat="blk_per_g">0.3</td>
                        <td class="right " data-stat="tov_per_g">0.3</td>
                        <td class="right " data-stat="pf_per_g">2.2</td>
                        <td class="right " data-stat="pts_per_g">4.1</td>
                    </tr>
                    <tr>
                        <th scope="row" class="center " data-stat="ranker">13</th>
                        <td class="left " data-stat="player" csk="Ariza,Trevor"><a
                                href='/players/a/arizatr01.html'>Trevor Ariza</a></td>
                        <td class="center " data-stat="age">36</td>
                        <td class="right " data-stat="g"><a href="/players/a/arizatr01/gamelog/2022/">6</a></td>
                        <td class="right " data-stat="gs">1</td>
                        <td class="right " data-stat="mp_per_g">16.8</td>
                        <td class="right " data-stat="fg_per_g">1.2</td>
                        <td class="right " data-stat="fga_per_g">2.2</td>
                        <td class="right " data-stat="fg_pct">.538</td>
                        <td class="right " data-stat="fg3_per_g">1.0</td>
                        <td class="right " data-stat="fg3a_per_g">2.0</td>
                        <td class="right " data-stat="fg3_pct">.500</td>
                        <td class="right " data-stat="fg2_per_g">0.2</td>
                        <td class="right " data-stat="fg2a_per_g">0.2</td>
                        <td class="right " data-stat="fg2_pct">1.000</td>
                        <td class="right " data-stat="efg_pct">.769</td>
                        <td class="right " data-stat="ft_per_g">0.2</td>
                        <td class="right " data-stat="fta_per_g">0.3</td>
                        <td class="right " data-stat="ft_pct">.500</td>
                        <td class="right " data-stat="orb_per_g">0.2</td>
                        <td class="right " data-stat="drb_per_g">2.7</td>
                        <td class="right " data-stat="trb_per_g">2.8</td>
                        <td class="right " data-stat="ast_per_g">0.8</td>
                        <td class="right " data-stat="stl_per_g">0.2</td>
                        <td class="right " data-stat="blk_per_g">0.2</td>
                        <td class="right " data-stat="tov_per_g">0.2</td>
                        <td class="right " data-stat="pf_per_g">0.5</td>
                        <td class="right " data-stat="pts_per_g">3.5</td>
                    </tr>
                    <tr>
                        <th scope="row" class="center " data-stat="ranker">14</th>
                        <td class="left " data-stat="player" csk="Rondo,Rajon"><a
                                href='/players/r/rondora01.html'>Rajon Rondo</a></td>
                        <td class="center " data-stat="age">35</td>
                        <td class="right " data-stat="g"><a href="/players/r/rondora01/gamelog/2022/">18</a>
                        </td>
                        <td class="right iz" data-stat="gs">0</td>
                        <td class="right " data-stat="mp_per_g">16.1</td>
                        <td class="right " data-stat="fg_per_g">1.3</td>
                        <td class="right " data-stat="fga_per_g">3.9</td>
                        <td class="right " data-stat="fg_pct">.324</td>
                        <td class="right " data-stat="fg3_per_g">0.4</td>
                        <td class="right " data-stat="fg3a_per_g">1.7</td>
                        <td class="right " data-stat="fg3_pct">.267</td>
                        <td class="right " data-stat="fg2_per_g">0.8</td>
                        <td class="right " data-stat="fg2a_per_g">2.3</td>
                        <td class="right " data-stat="fg2_pct">.366</td>
                        <td class="right " data-stat="efg_pct">.380</td>
                        <td class="right " data-stat="ft_per_g">0.1</td>
                        <td class="right " data-stat="fta_per_g">0.1</td>
                        <td class="right " data-stat="ft_pct">.500</td>
                        <td class="right " data-stat="orb_per_g">0.6</td>
                        <td class="right " data-stat="drb_per_g">2.2</td>
                        <td class="right " data-stat="trb_per_g">2.7</td>
                        <td class="right " data-stat="ast_per_g">3.7</td>
                        <td class="right " data-stat="stl_per_g">0.7</td>
                        <td class="right " data-stat="blk_per_g">0.3</td>
                        <td class="right " data-stat="tov_per_g">1.9</td>
                        <td class="right " data-stat="pf_per_g">1.4</td>
                        <td class="right " data-stat="pts_per_g">3.1</td>
                    </tr>
                    <tr>
                        <th scope="row" class="center " data-stat="ranker">15</th>
                        <td class="left " data-stat="player" csk="Howard,Dwight"><a
                                href='/players/h/howardw01.html'>Dwight Howard</a></td>
                        <td class="center " data-stat="age">36</td>
                        <td class="right " data-stat="g"><a href="/players/h/howardw01/gamelog/2022/">30</a>
                        </td>
                        <td class="right " data-stat="gs">6</td>
                        <td class="right " data-stat="mp_per_g">14.9</td>
                        <td class="right " data-stat="fg_per_g">1.8</td>
                        <td class="right " data-stat="fga_per_g">3.0</td>
                        <td class="right " data-stat="fg_pct">.600</td>
                        <td class="right " data-stat="fg3_per_g">0.2</td>
                        <td class="right " data-stat="fg3a_per_g">0.3</td>
                        <td class="right " data-stat="fg3_pct">.750</td>
                        <td class="right " data-stat="fg2_per_g">1.6</td>
                        <td class="right " data-stat="fg2a_per_g">2.7</td>
                        <td class="right " data-stat="fg2_pct">.585</td>
                        <td class="right " data-stat="efg_pct">.633</td>
                        <td class="right " data-stat="ft_per_g">1.2</td>
                        <td class="right " data-stat="fta_per_g">1.9</td>
                        <td class="right " data-stat="ft_pct">.621</td>
                        <td class="right " data-stat="orb_per_g">1.7</td>
                        <td class="right " data-stat="drb_per_g">3.8</td>
                        <td class="right " data-stat="trb_per_g">5.5</td>
                        <td class="right " data-stat="ast_per_g">0.6</td>
                        <td class="right " data-stat="stl_per_g">0.8</td>
                        <td class="right " data-stat="blk_per_g">0.6</td>
                        <td class="right " data-stat="tov_per_g">0.8</td>
                        <td class="right " data-stat="pf_per_g">1.9</td>
                        <td class="right " data-stat="pts_per_g">5.0</td>
                    </tr>
                    <tr>
                        <th scope="row" class="center " data-stat="ranker">16</th>
                        <td class="left " data-stat="player" csk="Jordan,DeAndre"><a
                                href='/players/j/jordade01.html'>DeAndre Jordan</a></td>
                        <td class="center " data-stat="age">33</td>
                        <td class="right " data-stat="g"><a href="/players/j/jordade01/gamelog/2022/">27</a>
                        </td>
                        <td class="right " data-stat="gs">18</td>
                        <td class="right " data-stat="mp_per_g">13.2</td>
                        <td class="right " data-stat="fg_per_g">2.1</td>
                        <td class="right " data-stat="fga_per_g">3.1</td>
                        <td class="right " data-stat="fg_pct">.675</td>
                        <td class="right iz" data-stat="fg3_per_g">0.0</td>
                        <td class="right iz" data-stat="fg3a_per_g">0.0</td>
                        <td class="right iz" data-stat="fg3_pct"></td>
                        <td class="right " data-stat="fg2_per_g">2.1</td>
                        <td class="right " data-stat="fg2a_per_g">3.1</td>
                        <td class="right " data-stat="fg2_pct">.675</td>
                        <td class="right " data-stat="efg_pct">.675</td>
                        <td class="right " data-stat="ft_per_g">0.4</td>
                        <td class="right " data-stat="fta_per_g">0.6</td>
                        <td class="right " data-stat="ft_pct">.588</td>
                        <td class="right " data-stat="orb_per_g">1.6</td>
                        <td class="right " data-stat="drb_per_g">4.1</td>
                        <td class="right " data-stat="trb_per_g">5.7</td>
                        <td class="right " data-stat="ast_per_g">0.3</td>
                        <td class="right " data-stat="stl_per_g">0.3</td>
                        <td class="right " data-stat="blk_per_g">0.9</td>
                        <td class="right " data-stat="tov_per_g">0.7</td>
                        <td class="right " data-stat="pf_per_g">1.7</td>
                        <td class="right " data-stat="pts_per_g">4.5</td>
                    </tr>
                    <tr>
                        <th scope="row" class="center " data-stat="ranker">17</th>
                        <td class="left " data-stat="player" csk="Collison,Darren"><a
                                href='/players/c/collida01.html'>Darren Collison</a></td>
                        <td class="center " data-stat="age">34</td>
                        <td class="right " data-stat="g"><a href="/players/c/collida01/gamelog/2022/">3</a></td>
                        <td class="right iz" data-stat="gs">0</td>
                        <td class="right " data-stat="mp_per_g">12.3</td>
                        <td class="right " data-stat="fg_per_g">0.7</td>
                        <td class="right " data-stat="fga_per_g">2.3</td>
                        <td class="right " data-stat="fg_pct">.286</td>
                        <td class="right iz" data-stat="fg3_per_g">0.0</td>
                        <td class="right " data-stat="fg3a_per_g">1.0</td>
                        <td class="right iz" data-stat="fg3_pct">.000</td>
                        <td class="right " data-stat="fg2_per_g">0.7</td>
                        <td class="right " data-stat="fg2a_per_g">1.3</td>
                        <td class="right " data-stat="fg2_pct">.500</td>
                        <td class="right " data-stat="efg_pct">.286</td>
                        <td class="right iz" data-stat="ft_per_g">0.0</td>
                        <td class="right iz" data-stat="fta_per_g">0.0</td>
                        <td class="right iz" data-stat="ft_pct"></td>
                        <td class="right iz" data-stat="orb_per_g">0.0</td>
                        <td class="right " data-stat="drb_per_g">1.3</td>
                        <td class="right " data-stat="trb_per_g">1.3</td>
                        <td class="right " data-stat="ast_per_g">0.7</td>
                        <td class="right " data-stat="stl_per_g">0.3</td>
                        <td class="right iz" data-stat="blk_per_g">0.0</td>
                        <td class="right " data-stat="tov_per_g">0.3</td>
                        <td class="right " data-stat="pf_per_g">1.7</td>
                        <td class="right " data-stat="pts_per_g">1.3</td>
                    </tr>
                    <tr>
                        <th scope="row" class="center " data-stat="ranker">18</th>
                        <td class="left " data-stat="player" csk="Brown,Chaundee"><a
                                href='/players/b/brownch05.html'>Chaundee Brown Jr.</a></td>
                        <td class="center " data-stat="age">23</td>
                        <td class="right " data-stat="g"><a href="/players/b/brownch05/gamelog/2022/">2</a></td>
                        <td class="right iz" data-stat="gs">0</td>
                        <td class="right " data-stat="mp_per_g">10.5</td>
                        <td class="right " data-stat="fg_per_g">0.5</td>
                        <td class="right " data-stat="fga_per_g">3.5</td>
                        <td class="right " data-stat="fg_pct">.143</td>
                        <td class="right iz" data-stat="fg3_per_g">0.0</td>
                        <td class="right " data-stat="fg3a_per_g">1.5</td>
                        <td class="right iz" data-stat="fg3_pct">.000</td>
                        <td class="right " data-stat="fg2_per_g">0.5</td>
                        <td class="right " data-stat="fg2a_per_g">2.0</td>
                        <td class="right " data-stat="fg2_pct">.250</td>
                        <td class="right " data-stat="efg_pct">.143</td>
                        <td class="right iz" data-stat="ft_per_g">0.0</td>
                        <td class="right iz" data-stat="fta_per_g">0.0</td>
                        <td class="right iz" data-stat="ft_pct"></td>
                        <td class="right iz" data-stat="orb_per_g">0.0</td>
                        <td class="right " data-stat="drb_per_g">1.0</td>
                        <td class="right " data-stat="trb_per_g">1.0</td>
                        <td class="right iz" data-stat="ast_per_g">0.0</td>
                        <td class="right iz" data-stat="stl_per_g">0.0</td>
                        <td class="right iz" data-stat="blk_per_g">0.0</td>
                        <td class="right " data-stat="tov_per_g">0.5</td>
                        <td class="right iz" data-stat="pf_per_g">0.0</td>
                        <td class="right " data-stat="pts_per_g">1.0</td>
                    </tr>
                    <tr>
                        <th scope="row" class="center " data-stat="ranker">19</th>
                        <td class="left " data-stat="player" csk="Doumbouya,Sekou"><a
                                href='/players/d/doumbse01.html'>Sekou Doumbouya</a></td>
                        <td class="center " data-stat="age">21</td>
                        <td class="right " data-stat="g"><a href="/players/d/doumbse01/gamelog/2022/">2</a></td>
                        <td class="right iz" data-stat="gs">0</td>
                        <td class="right " data-stat="mp_per_g">8.0</td>
                        <td class="right " data-stat="fg_per_g">2.5</td>
                        <td class="right " data-stat="fga_per_g">4.0</td>
                        <td class="right " data-stat="fg_pct">.625</td>
                        <td class="right " data-stat="fg3_per_g">0.5</td>
                        <td class="right " data-stat="fg3a_per_g">1.0</td>
                        <td class="right " data-stat="fg3_pct">.500</td>
                        <td class="right " data-stat="fg2_per_g">2.0</td>
                        <td class="right " data-stat="fg2a_per_g">3.0</td>
                        <td class="right " data-stat="fg2_pct">.667</td>
                        <td class="right " data-stat="efg_pct">.688</td>
                        <td class="right " data-stat="ft_per_g">1.5</td>
                        <td class="right " data-stat="fta_per_g">2.0</td>
                        <td class="right " data-stat="ft_pct">.750</td>
                        <td class="right " data-stat="orb_per_g">1.0</td>
                        <td class="right " data-stat="drb_per_g">2.0</td>
                        <td class="right " data-stat="trb_per_g">3.0</td>
                        <td class="right iz" data-stat="ast_per_g">0.0</td>
                        <td class="right " data-stat="stl_per_g">1.5</td>
                        <td class="right " data-stat="blk_per_g">1.0</td>
                        <td class="right " data-stat="tov_per_g">1.0</td>
                        <td class="right " data-stat="pf_per_g">0.5</td>
                        <td class="right " data-stat="pts_per_g">7.0</td>
                    </tr>
                    <tr>
                        <th scope="row" class="center " data-stat="ranker">20</th>
                        <td class="left " data-stat="player" csk="Jones,Jemerrio"><a
                                href='/players/j/jonesje01.html'>Jemerrio Jones</a></td>
                        <td class="center " data-stat="age">26</td>
                        <td class="right " data-stat="g"><a href="/players/j/jonesje01/gamelog/2022/">2</a></td>
                        <td class="right iz" data-stat="gs">0</td>
                        <td class="right " data-stat="mp_per_g">7.5</td>
                        <td class="right " data-stat="fg_per_g">1.0</td>
                        <td class="right " data-stat="fga_per_g">1.5</td>
                        <td class="right " data-stat="fg_pct">.667</td>
                        <td class="right iz" data-stat="fg3_per_g">0.0</td>
                        <td class="right iz" data-stat="fg3a_per_g">0.0</td>
                        <td class="right iz" data-stat="fg3_pct"></td>
                        <td class="right " data-stat="fg2_per_g">1.0</td>
                        <td class="right " data-stat="fg2a_per_g">1.5</td>
                        <td class="right " data-stat="fg2_pct">.667</td>
                        <td class="right " data-stat="efg_pct">.667</td>
                        <td class="right iz" data-stat="ft_per_g">0.0</td>
                        <td class="right iz" data-stat="fta_per_g">0.0</td>
                        <td class="right iz" data-stat="ft_pct"></td>
                        <td class="right " data-stat="orb_per_g">1.0</td>
                        <td class="right " data-stat="drb_per_g">0.5</td>
                        <td class="right " data-stat="trb_per_g">1.5</td>
                        <td class="right iz" data-stat="ast_per_g">0.0</td>
                        <td class="right " data-stat="stl_per_g">0.5</td>
                        <td class="right iz" data-stat="blk_per_g">0.0</td>
                        <td class="right iz" data-stat="tov_per_g">0.0</td>
                        <td class="right " data-stat="pf_per_g">1.0</td>
                        <td class="right " data-stat="pts_per_g">2.0</td>
                    </tr>
                    <tr>
                        <th scope="row" class="center " data-stat="ranker">21</th>
                        <td class="left " data-stat="player" csk="Huff,Jay"><a
                                href='/players/h/huffja01.html'>Jay Huff</a></td>
                        <td class="center " data-stat="age">23</td>
                        <td class="right " data-stat="g"><a href="/players/h/huffja01/gamelog/2022/">4</a></td>
                        <td class="right iz" data-stat="gs">0</td>
                        <td class="right " data-stat="mp_per_g">5.0</td>
                        <td class="right iz" data-stat="fg_per_g">0.0</td>
                        <td class="right " data-stat="fga_per_g">0.8</td>
                        <td class="right iz" data-stat="fg_pct">.000</td>
                        <td class="right iz" data-stat="fg3_per_g">0.0</td>
                        <td class="right " data-stat="fg3a_per_g">0.5</td>
                        <td class="right iz" data-stat="fg3_pct">.000</td>
                        <td class="right iz" data-stat="fg2_per_g">0.0</td>
                        <td class="right " data-stat="fg2a_per_g">0.3</td>
                        <td class="right iz" data-stat="fg2_pct">.000</td>
                        <td class="right iz" data-stat="efg_pct">.000</td>
                        <td class="right iz" data-stat="ft_per_g">0.0</td>
                        <td class="right iz" data-stat="fta_per_g">0.0</td>
                        <td class="right iz" data-stat="ft_pct"></td>
                        <td class="right " data-stat="orb_per_g">0.3</td>
                        <td class="right " data-stat="drb_per_g">0.8</td>
                        <td class="right " data-stat="trb_per_g">1.0</td>
                        <td class="right " data-stat="ast_per_g">0.3</td>
                        <td class="right " data-stat="stl_per_g">0.3</td>
                        <td class="right " data-stat="blk_per_g">0.3</td>
                        <td class="right " data-stat="tov_per_g">0.3</td>
                        <td class="right " data-stat="pf_per_g">0.3</td>
                        <td class="right iz" data-stat="pts_per_g">0.0</td>
                    </tr>
                    <tr>
                        <th scope="row" class="center " data-stat="ranker">22</th>
                        <td class="left " data-stat="player" csk="Jones,Mason"><a
                                href='/players/j/jonesma05.html'>Mason Jones</a></td>
                        <td class="center " data-stat="age">23</td>
                        <td class="right " data-stat="g"><a href="/players/j/jonesma05/gamelog/2022/">2</a></td>
                        <td class="right iz" data-stat="gs">0</td>
                        <td class="right " data-stat="mp_per_g">4.5</td>
                        <td class="right " data-stat="fg_per_g">1.0</td>
                        <td class="right " data-stat="fga_per_g">4.0</td>
                        <td class="right " data-stat="fg_pct">.250</td>
                        <td class="right iz" data-stat="fg3_per_g">0.0</td>
                        <td class="right " data-stat="fg3a_per_g">1.0</td>
                        <td class="right iz" data-stat="fg3_pct">.000</td>
                        <td class="right " data-stat="fg2_per_g">1.0</td>
                        <td class="right " data-stat="fg2a_per_g">3.0</td>
                        <td class="right " data-stat="fg2_pct">.333</td>
                        <td class="right " data-stat="efg_pct">.250</td>
                        <td class="right " data-stat="ft_per_g">0.5</td>
                        <td class="right " data-stat="fta_per_g">1.0</td>
                        <td class="right " data-stat="ft_pct">.500</td>
                        <td class="right " data-stat="orb_per_g">0.5</td>
                        <td class="right " data-stat="drb_per_g">0.5</td>
                        <td class="right " data-stat="trb_per_g">1.0</td>
                        <td class="right iz" data-stat="ast_per_g">0.0</td>
                        <td class="right " data-stat="stl_per_g">0.5</td>
                        <td class="right iz" data-stat="blk_per_g">0.0</td>
                        <td class="right " data-stat="tov_per_g">0.5</td>
                        <td class="right " data-stat="pf_per_g">0.5</td>
                        <td class="right " data-stat="pts_per_g">2.5</td>
                    </tr>
                    </tbody>
                </table>


            </div>
        </div>
    </div>
</div>
</body>
</html>""".trimIndent()

    val bullsPlayers = """<!DOCTYPE html>
<html data-version="klecko-" data-root="/home/bbr/build" itemscope itemtype="https://schema.org/WebSite" lang="en"
      class="no-js">
<body class="bbr">
<div id="wrap">
    <div id="content" role="main">
        <div id="all_roster" class="table_wrapper">

            <div class="section_heading assoc_roster" id="roster_sh">
                <span class="section_anchor" id="roster_link" data-label="Roster"></span>
                <h2>Roster</h2>
                <div class="section_heading_text">
                    <ul>
                        <li><span class='note'>(TW) - Signed to two-way contract w/ G-League affiliate</span></li>
                    </ul>
                </div>

            </div>
            <div class="table_container" id="div_roster">

                <table class="sortable stats_table" id="roster" data-cols-to-freeze=",2">
                    <caption>Roster Table</caption>

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
                    </colgroup>
                    <thead>
                    <tr>
                        <th aria-label="Uniform Number" data-stat="number" scope="col"
                            class=" poptip sort_default_asc center" data-tip="Uniform Number">No.
                        </th>
                        <th aria-label="Player" data-stat="player" scope="col"
                            class=" poptip sort_default_asc center">Player
                        </th>
                        <th aria-label="Position" data-stat="pos" scope="col"
                            class=" poptip sort_default_asc center" data-tip="Position">Pos
                        </th>
                        <th aria-label="Height" data-stat="height" scope="col"
                            class=" poptip sort_default_asc center" data-tip="Height">Ht
                        </th>
                        <th aria-label="Weight" data-stat="weight" scope="col"
                            class=" poptip sort_default_asc center" data-tip="Weight">Wt
                        </th>
                        <th aria-label="Birth Date" data-stat="birth_date" scope="col"
                            class=" poptip sort_default_asc center">Birth Date
                        </th>
                        <th aria-label="&nbsp;" data-stat="birth_country" scope="col" class=" poptip center">&nbsp;
                        </th>
                        <th aria-label="Years experience in NBA/ABA (prior to this season)"
                            data-stat="years_experience" scope="col" class=" poptip sort_default_asc center"
                            data-tip="Years experience in NBA/ABA (prior to this season)">Exp
                        </th>
                        <th aria-label="College" data-stat="college" scope="col"
                            class=" poptip sort_default_asc center">College
                        </th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <th scope="row" class="center " data-stat="number">11</th>
                        <td class="left " data-stat="player" csk="DeRozan,DeMar"><a
                                href='/players/d/derozde01.html'>DeMar DeRozan</a></td>
                        <td class="center " data-stat="pos" csk="4">PF</td>
                        <td class="right " data-stat="height" csk="78.0">6-6</td>
                        <td class="right " data-stat="weight">220</td>
                        <td class="left " data-stat="birth_date" csk="19890807">August 7, 1989</td>
                        <td class="right " data-stat="birth_country"><span class="f-i f-us" style="">us</span></td>
                        <td class="right " data-stat="years_experience" csk="12">12</td>
                        <td class="left " data-stat="college"><a href='/friv/colleges.fcgi?college=usc'>USC</a></td>
                    </tr>
                    <tr>
                        <th scope="row" class="center " data-stat="number">8</th>
                        <td class="left " data-stat="player" csk="LaVine,Zach"><a
                                href='/players/l/lavinza01.html'>Zach LaVine</a></td>
                        <td class="center " data-stat="pos" csk="3">SF</td>
                        <td class="right " data-stat="height" csk="77.0">6-5</td>
                        <td class="right " data-stat="weight">200</td>
                        <td class="left " data-stat="birth_date" csk="19950310">March 10, 1995</td>
                        <td class="right " data-stat="birth_country"><span class="f-i f-us" style="">us</span></td>
                        <td class="right " data-stat="years_experience" csk="7">7</td>
                        <td class="left " data-stat="college"><a href='/friv/colleges.fcgi?college=ucla'>UCLA</a>
                        </td>
                    </tr>
                    <tr>
                        <th scope="row" class="center " data-stat="number">9</th>
                        <td class="left " data-stat="player" csk="Vučević,Nikola"><a
                                href='/players/v/vucevni01.html'>Nikola Vučević</a></td>
                        <td class="center " data-stat="pos" csk="5">C</td>
                        <td class="right " data-stat="height" csk="82.0">6-10</td>
                        <td class="right " data-stat="weight">260</td>
                        <td class="left " data-stat="birth_date" csk="19901024">October 24, 1990</td>
                        <td class="right " data-stat="birth_country"><span class="f-i f-ch" style="">ch</span></td>
                        <td class="right " data-stat="years_experience" csk="10">10</td>
                        <td class="left " data-stat="college"><a href='/friv/colleges.fcgi?college=usc'>USC</a></td>
                    </tr>
                </table>
            </div>
        </div>
        <div id="all_per_game-playoffs_per_game" class="table_wrapper tabbed">

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
                        <th aria-label="Rank" data-stat="ranker" scope="col"
                            class="ranker poptip sort_default_asc show_partial_when_sorting center"
                            data-tip="Rank">Rk
                        </th>
                        <th aria-label="&nbsp;" data-stat="player" scope="col"
                            class=" poptip sort_default_asc center">&nbsp;
                        </th>
                        <th aria-label="Player's age on February 1 of the season" data-stat="age" scope="col"
                            class=" poptip sort_default_asc center"
                            data-tip="Player's age on February 1 of the season">Age
                        </th>
                        <th aria-label="Games" data-stat="g" scope="col" class=" poptip center"
                            data-tip="Games">G
                        </th>
                        <th aria-label="Games Started" data-stat="gs" scope="col" class=" poptip center"
                            data-tip="Games Started">GS
                        </th>
                        <th aria-label="Minutes Played Per Game" data-stat="mp_per_g" scope="col"
                            class=" poptip center" data-tip="Minutes Played Per Game">MP
                        </th>
                        <th aria-label="Field Goals Per Game" data-stat="fg_per_g" scope="col"
                            class=" poptip center" data-tip="Field Goals Per Game">FG
                        </th>
                        <th aria-label="Field Goal Attempts Per Game" data-stat="fga_per_g" scope="col"
                            class=" poptip center" data-tip="Field Goal Attempts Per Game">FGA
                        </th>
                        <th aria-label="Field Goal Percentage" data-stat="fg_pct" scope="col"
                            class=" poptip center" data-tip="Field Goal Percentage">FG%
                        </th>
                        <th aria-label="3-Point Field Goals Per Game" data-stat="fg3_per_g" scope="col"
                            class=" poptip center" data-tip="3-Point Field Goals Per Game">3P
                        </th>
                        <th aria-label="3-Point Field Goal Attempts Per Game" data-stat="fg3a_per_g" scope="col"
                            class=" poptip center" data-tip="3-Point Field Goal Attempts Per Game">3PA
                        </th>
                        <th aria-label="3-Point Field Goal Percentage" data-stat="fg3_pct" scope="col"
                            class=" poptip center" data-tip="3-Point Field Goal Percentage">3P%
                        </th>
                        <th aria-label="2-Point Field Goals Per Game" data-stat="fg2_per_g" scope="col"
                            class=" poptip center" data-tip="2-Point Field Goals Per Game">2P
                        </th>
                        <th aria-label="2-Point Field Goal Attempts Per Game" data-stat="fg2a_per_g" scope="col"
                            class=" poptip center" data-tip="2-Point Field Goal Attempts Per Game">2PA
                        </th>
                        <th aria-label="2-Point Field Goal Percentage" data-stat="fg2_pct" scope="col"
                            class=" poptip center" data-tip="2-Point Field Goal Percentage">2P%
                        </th>
                        <th aria-label="Effective Field Goal Percentage" data-stat="efg_pct" scope="col"
                            class=" poptip center"
                            data-tip="<strong>Effective Field Goal Percentage</strong><br>This statistic adjusts for the fact that a 3-point field goal is worth one more point than a 2-point field goal.">
                            eFG%
                        </th>
                        <th aria-label="Free Throws Per Game" data-stat="ft_per_g" scope="col"
                            class=" poptip center" data-tip="Free Throws Per Game">FT
                        </th>
                        <th aria-label="Free Throw Attempts Per Game" data-stat="fta_per_g" scope="col"
                            class=" poptip center" data-tip="Free Throw Attempts Per Game">FTA
                        </th>
                        <th aria-label="Free Throw Percentage" data-stat="ft_pct" scope="col"
                            class=" poptip center" data-tip="Free Throw Percentage">FT%
                        </th>
                        <th aria-label="Offensive Rebounds Per Game" data-stat="orb_per_g" scope="col"
                            class=" poptip center" data-tip="Offensive Rebounds Per Game">ORB
                        </th>
                        <th aria-label="Defensive Rebounds Per Game" data-stat="drb_per_g" scope="col"
                            class=" poptip center" data-tip="Defensive Rebounds Per Game">DRB
                        </th>
                        <th aria-label="Total Rebounds Per Game" data-stat="trb_per_g" scope="col"
                            class=" poptip center" data-tip="Total Rebounds Per Game">TRB
                        </th>
                        <th aria-label="Assists Per Game" data-stat="ast_per_g" scope="col"
                            class=" poptip center" data-tip="Assists Per Game">AST
                        </th>
                        <th aria-label="Steals Per Game" data-stat="stl_per_g" scope="col"
                            class=" poptip center" data-tip="Steals Per Game">STL
                        </th>
                        <th aria-label="Blocks Per Game" data-stat="blk_per_g" scope="col"
                            class=" poptip center" data-tip="Blocks Per Game">BLK
                        </th>
                        <th aria-label="Turnovers Per Game" data-stat="tov_per_g" scope="col"
                            class=" poptip center" data-tip="Turnovers Per Game">TOV
                        </th>
                        <th aria-label="Personal Fouls Per Game" data-stat="pf_per_g" scope="col"
                            class=" poptip center" data-tip="Personal Fouls Per Game">PF
                        </th>
                        <th aria-label="Points Per Game" data-stat="pts_per_g" scope="col"
                            class=" poptip center" data-tip="Points Per Game">PTS/G
                        </th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <th scope="row" class="center " data-stat="ranker">2</th>
                        <td class="left " data-stat="player" csk="DeRozan,DeMar"><a
                                href='/players/d/derozde01.html'>DeMar DeRozan</a></td>
                        <td class="center " data-stat="age">32</td>
                        <td class="right " data-stat="g"><a href="/players/d/derozde01/gamelog/2022/">33</a>
                        </td>
                        <td class="right " data-stat="gs">33</td>
                        <td class="right " data-stat="mp_per_g">35.2</td>
                        <td class="right " data-stat="fg_per_g">9.5</td>
                        <td class="right " data-stat="fga_per_g">19.5</td>
                        <td class="right " data-stat="fg_pct">.489</td>
                        <td class="right " data-stat="fg3_per_g">0.8</td>
                        <td class="right " data-stat="fg3a_per_g">2.1</td>
                        <td class="right " data-stat="fg3_pct">.357</td>
                        <td class="right " data-stat="fg2_per_g">8.8</td>
                        <td class="right " data-stat="fg2a_per_g">17.3</td>
                        <td class="right " data-stat="fg2_pct">.505</td>
                        <td class="right " data-stat="efg_pct">.509</td>
                        <td class="right " data-stat="ft_per_g">6.8</td>
                        <td class="right " data-stat="fta_per_g">7.9</td>
                        <td class="right " data-stat="ft_pct">.858</td>
                        <td class="right " data-stat="orb_per_g">0.8</td>
                        <td class="right " data-stat="drb_per_g">4.3</td>
                        <td class="right " data-stat="trb_per_g">5.0</td>
                        <td class="right " data-stat="ast_per_g">4.6</td>
                        <td class="right " data-stat="stl_per_g">0.9</td>
                        <td class="right " data-stat="blk_per_g">0.3</td>
                        <td class="right " data-stat="tov_per_g">2.2</td>
                        <td class="right " data-stat="pf_per_g">2.3</td>
                        <td class="right " data-stat="pts_per_g">26.5</td>
                    </tr>
                    <tr>
                        <th scope="row" class="center " data-stat="ranker">3</th>
                        <td class="left " data-stat="player" csk="LaVine,Zach"><a
                                href='/players/l/lavinza01.html'>Zach LaVine</a></td>
                        <td class="center " data-stat="age">26</td>
                        <td class="right " data-stat="g"><a href="/players/l/lavinza01/gamelog/2022/">34</a>
                        </td>
                        <td class="right " data-stat="gs">34</td>
                        <td class="right " data-stat="mp_per_g">35.1</td>
                        <td class="right " data-stat="fg_per_g">9.6</td>
                        <td class="right " data-stat="fga_per_g">19.2</td>
                        <td class="right " data-stat="fg_pct">.497</td>
                        <td class="right " data-stat="fg3_per_g">3.1</td>
                        <td class="right " data-stat="fg3a_per_g">7.5</td>
                        <td class="right " data-stat="fg3_pct">.414</td>
                        <td class="right " data-stat="fg2_per_g">6.4</td>
                        <td class="right " data-stat="fg2a_per_g">11.7</td>
                        <td class="right " data-stat="fg2_pct">.550</td>
                        <td class="right " data-stat="efg_pct">.578</td>
                        <td class="right " data-stat="ft_per_g">4.1</td>
                        <td class="right " data-stat="fta_per_g">4.8</td>
                        <td class="right " data-stat="ft_pct">.864</td>
                        <td class="right " data-stat="orb_per_g">0.3</td>
                        <td class="right " data-stat="drb_per_g">4.6</td>
                        <td class="right " data-stat="trb_per_g">4.9</td>
                        <td class="right " data-stat="ast_per_g">4.2</td>
                        <td class="right " data-stat="stl_per_g">0.6</td>
                        <td class="right " data-stat="blk_per_g">0.4</td>
                        <td class="right " data-stat="tov_per_g">2.9</td>
                        <td class="right " data-stat="pf_per_g">1.6</td>
                        <td class="right " data-stat="pts_per_g">26.4</td>
                    </tr>
                    <tr>
                        <th scope="row" class="center " data-stat="ranker">4</th>
                        <td class="left " data-stat="player" csk="Vučević,Nikola"><a
                                href='/players/v/vucevni01.html'>Nikola Vučević</a></td>
                        <td class="center " data-stat="age">31</td>
                        <td class="right " data-stat="g"><a href="/players/v/vucevni01/gamelog/2022/">29</a>
                        </td>
                        <td class="right " data-stat="gs">29</td>
                        <td class="right " data-stat="mp_per_g">33.3</td>
                        <td class="right " data-stat="fg_per_g">6.6</td>
                        <td class="right " data-stat="fga_per_g">15.4</td>
                        <td class="right " data-stat="fg_pct">.429</td>
                        <td class="right " data-stat="fg3_per_g">1.7</td>
                        <td class="right " data-stat="fg3a_per_g">4.9</td>
                        <td class="right " data-stat="fg3_pct">.343</td>
                        <td class="right " data-stat="fg2_per_g">4.9</td>
                        <td class="right " data-stat="fg2a_per_g">10.5</td>
                        <td class="right " data-stat="fg2_pct">.469</td>
                        <td class="right " data-stat="efg_pct">.483</td>
                        <td class="right " data-stat="ft_per_g">1.0</td>
                        <td class="right " data-stat="fta_per_g">1.4</td>
                        <td class="right " data-stat="ft_pct">.667</td>
                        <td class="right " data-stat="orb_per_g">1.9</td>
                        <td class="right " data-stat="drb_per_g">9.8</td>
                        <td class="right " data-stat="trb_per_g">11.7</td>
                        <td class="right " data-stat="ast_per_g">3.4</td>
                        <td class="right " data-stat="stl_per_g">1.1</td>
                        <td class="right " data-stat="blk_per_g">1.1</td>
                        <td class="right " data-stat="tov_per_g">1.6</td>
                        <td class="right " data-stat="pf_per_g">2.3</td>
                        <td class="right " data-stat="pts_per_g">15.9</td>
                    </tr>
                    </tbody>
                </table>


            </div>


        </div>
    </div>
</div>
</body>
</html>""".trimIndent()
}
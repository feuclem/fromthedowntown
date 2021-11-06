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
<html data-version="klecko-" data-root="/home/bbr/build" itemscope itemtype="https://schema.org/WebSite" lang="en" class="no-js" >
                                <body class="bbr">
                                    <div id="wrap">                      
<div id="content">
<div id="all_roster" class="table_wrapper">

<div class="section_heading assoc_roster has_controls" id="roster_sh">
  <span class="section_anchor" id="roster_link" data-label="Roster"></span><h2>Roster</h2>    <div class="section_heading_text">
      <ul><li><span class="note">(TW) - Signed to two-way contract w/ G-League affiliate</span></li>
      <li class="hasmore"><span>Share &amp; Export</span><div><ul><li><button class="tooltip" tip="Use a customizable report creator that can<br>output HTML, CSV, or a shareable link." type="button" id="share_on_roster">Modify, Export &amp; Share Table</button></li><li><button class="tooltip" tip="Get a bit of widget code to embed this table on your site" type="button">Embed this Table</button></li><li><button class="tooltip" tip="Convert the table below to comma-separated values<br>suitable for use with Excel" type="button">Get as Excel Workbook</button><a id="dlink" style="display: none;"></a></li><li><button class="tooltip" tip="Get a link directly to this table on this page" type="button">Get table as CSV (for Excel)</button></li><li><button class="tooltip" tip="" type="button" id="a_roster" name="roster" href="#roster">Get Link to Table</button></li><li><button class="tooltip" tip="" type="button">About Sharing Tools</button></li><li><button class="tooltip" tip="" type="button"><a href="https://www.youtube.com/watch?v=MWapXbaWs_U&amp;feature=youtu.be" target="_blank">Video: SR Sharing Tools &amp; How-to</a></button></li><li><button class="tooltip" tip="" type="button"><a href="https://www.youtube.com/watch?v=JkDLV0roT14&amp;feature=youtu.be" target="_blank">Video: Stats Table Tips &amp; Tricks</a></button></li><li><button class="tooltip" tip="" type="button"><a href="https://www.sports-reference.com/data_use.html" target="_blank">Data Usage Terms</a></button></li></ul></div></li><li><button class="tooltip" tip="Show a glossary for each term in the table below<br>or hold your mouse over the header" type="button">Glossary</button></li></ul>
    </div>
    		
</div>
<div class="table_container is_setup" id="div_roster">
    
    <table class="sortable stats_table now_sortable" id="roster" data-cols-to-freeze=",2">
    <caption>Roster Table</caption>
    
   <colgroup><col><col><col><col><col><col><col><col><col></colgroup>
   <thead>      
      <tr>
         <th aria-label="Uniform Number" data-stat="number" scope="col" class=" poptip sort_default_asc center" data-tip="Uniform Number">No.</th>
         <th aria-label="Player" data-stat="player" scope="col" class=" poptip sort_default_asc center">Player</th>
         <th aria-label="Position" data-stat="pos" scope="col" class=" poptip sort_default_asc center" data-tip="Position">Pos</th>
         <th aria-label="Height" data-stat="height" scope="col" class=" poptip sort_default_asc center" data-tip="Height">Ht</th>
         <th aria-label="Weight" data-stat="weight" scope="col" class=" poptip sort_default_asc center" data-tip="Weight">Wt</th>
         <th aria-label="Birth Date" data-stat="birth_date" scope="col" class=" poptip sort_default_asc center">Birth Date</th>
         <th aria-label="&nbsp;" data-stat="birth_country" scope="col" class=" poptip center">&nbsp;</th>
         <th aria-label="Years experience in NBA/ABA (prior to this season)" data-stat="years_experience" scope="col" class=" poptip sort_default_asc center" data-tip="Years experience in NBA/ABA (prior to this season)">Exp</th>
         <th aria-label="College" data-stat="college" scope="col" class=" poptip sort_default_asc center">College</th>
      </tr>
      </thead>
<tbody><tr data-row="0"><th scope="row" class="center " data-stat="number">3</th><td class="left " data-stat="player" csk="Davis,Anthony"><a href="/players/d/davisan02.html">Anthony Davis</a></td><td class="center " data-stat="pos" csk="5">C</td><td class="right " data-stat="height" csk="82.0">6-10</td><td class="right " data-stat="weight">253</td><td class="left " data-stat="birth_date" csk="19930311">March 11, 1993</td><td class="right " data-stat="birth_country"><span class="f-i f-us" style="">us</span></td><td class="right " data-stat="years_experience" csk="9">9</td><td class="left " data-stat="college"><a href="/friv/colleges.fcgi?college=kentucky">Kentucky</a></td></tr>
<tr data-row="1"><th scope="row" class="center iz" data-stat="number">0</th><td class="left " data-stat="player" csk="Westbrook,Russell"><a href="/players/w/westbru01.html">Russell Westbrook</a></td><td class="center " data-stat="pos" csk="1">PG</td><td class="right " data-stat="height" csk="75.0">6-3</td><td class="right " data-stat="weight">200</td><td class="left " data-stat="birth_date" csk="19881112">November 12, 1988</td><td class="right " data-stat="birth_country"><span class="f-i f-us" style="">us</span></td><td class="right " data-stat="years_experience" csk="13">13</td><td class="left " data-stat="college"><a href="/friv/colleges.fcgi?college=ucla">UCLA</a></td></tr>
<tr data-row="2"><th scope="row" class="center " data-stat="number">7</th><td class="left " data-stat="player" csk="Anthony,Carmelo"><a href="/players/a/anthoca01.html">Carmelo Anthony</a></td><td class="center " data-stat="pos" csk="4">PF</td><td class="right " data-stat="height" csk="79.0">6-7</td><td class="right " data-stat="weight">238</td><td class="left " data-stat="birth_date" csk="19840529">May 29, 1984</td><td class="right " data-stat="birth_country"><span class="f-i f-us" style="">us</span></td><td class="right " data-stat="years_experience" csk="18">18</td><td class="left " data-stat="college"><a href="/friv/colleges.fcgi?college=syracuse">Syracuse</a></td></tr>
<tr data-row="3"><th scope="row" class="center " data-stat="number">9</th><td class="left " data-stat="player" csk="Bazemore,Kent"><a href="/players/b/bazemke01.html">Kent Bazemore</a></td><td class="center " data-stat="pos" csk="3">SF</td><td class="right " data-stat="height" csk="76.0">6-4</td><td class="right " data-stat="weight">195</td><td class="left " data-stat="birth_date" csk="19890701">July 1, 1989</td><td class="right " data-stat="birth_country"><span class="f-i f-us" style="">us</span></td><td class="right " data-stat="years_experience" csk="9">9</td><td class="left " data-stat="college"><a href="/friv/colleges.fcgi?college=olddom">Old Dominion</a></td></tr>
<tr data-row="4"><th scope="row" class="center " data-stat="number">11</th><td class="left " data-stat="player" csk="Monk,Malik"><a href="/players/m/monkma01.html">Malik Monk</a></td><td class="center " data-stat="pos" csk="2">SG</td><td class="right " data-stat="height" csk="75.0">6-3</td><td class="right " data-stat="weight">200</td><td class="left " data-stat="birth_date" csk="19980204">February 4, 1998</td><td class="right " data-stat="birth_country"><span class="f-i f-us" style="">us</span></td><td class="right " data-stat="years_experience" csk="4">4</td><td class="left " data-stat="college"><a href="/friv/colleges.fcgi?college=kentucky">Kentucky</a></td></tr>
<tr data-row="5"><th scope="row" class="center " data-stat="number">10</th><td class="left " data-stat="player" csk="Jordan,DeAndre"><a href="/players/j/jordade01.html">DeAndre Jordan</a></td><td class="center " data-stat="pos" csk="5">C</td><td class="right " data-stat="height" csk="83.0">6-11</td><td class="right " data-stat="weight">265</td><td class="left " data-stat="birth_date" csk="19880721">July 21, 1988</td><td class="right " data-stat="birth_country"><span class="f-i f-us" style="">us</span></td><td class="right " data-stat="years_experience" csk="13">13</td><td class="left " data-stat="college"><a href="/friv/colleges.fcgi?college=texasam">Texas A&amp;M</a></td></tr>
<tr data-row="6"><th scope="row" class="center " data-stat="number">15</th><td class="left " data-stat="player" csk="Reaves,Austin"><a href="/players/r/reaveau01.html">Austin Reaves</a></td><td class="center " data-stat="pos" csk="2">SG</td><td class="right " data-stat="height" csk="77.0">6-5</td><td class="right " data-stat="weight">206</td><td class="left " data-stat="birth_date" csk="19980529">May 29, 1998</td><td class="right " data-stat="birth_country"><span class="f-i f-us" style="">us</span></td><td class="right " data-stat="years_experience" csk="0.5">R</td><td class="left " data-stat="college"><a href="/friv/colleges.fcgi?college=wichitast">Wichita State</a>, <a href="/friv/colleges.fcgi?college=oklahoma">Oklahoma</a></td></tr>
<tr data-row="7"><th scope="row" class="center " data-stat="number">20</th><td class="left " data-stat="player" csk="Bradley,Avery"><a href="/players/b/bradlav01.html">Avery Bradley</a></td><td class="center " data-stat="pos" csk="2">SG</td><td class="right " data-stat="height" csk="75.0">6-3</td><td class="right " data-stat="weight">180</td><td class="left " data-stat="birth_date" csk="19901126">November 26, 1990</td><td class="right " data-stat="birth_country"><span class="f-i f-us" style="">us</span></td><td class="right " data-stat="years_experience" csk="11">11</td><td class="left " data-stat="college"><a href="/friv/colleges.fcgi?college=texas">Texas</a></td></tr>
<tr data-row="8"><th scope="row" class="center " data-stat="number">39</th><td class="left " data-stat="player" csk="Howard,Dwight"><a href="/players/h/howardw01.html">Dwight Howard</a></td><td class="center " data-stat="pos" csk="5">C</td><td class="right " data-stat="height" csk="82.0">6-10</td><td class="right " data-stat="weight">265</td><td class="left " data-stat="birth_date" csk="19851208">December 8, 1985</td><td class="right " data-stat="birth_country"><span class="f-i f-us" style="">us</span></td><td class="right " data-stat="years_experience" csk="17">17</td><td class="left iz" data-stat="college"></td></tr>
<tr data-row="9"><th scope="row" class="center " data-stat="number">6</th><td class="left " data-stat="player" csk="James,LeBron"><a href="/players/j/jamesle01.html">LeBron James</a></td><td class="center " data-stat="pos" csk="3">SF</td><td class="right " data-stat="height" csk="81.0">6-9</td><td class="right " data-stat="weight">250</td><td class="left " data-stat="birth_date" csk="19841230">December 30, 1984</td><td class="right " data-stat="birth_country"><span class="f-i f-us" style="">us</span></td><td class="right " data-stat="years_experience" csk="18">18</td><td class="left iz" data-stat="college"></td></tr>
<tr data-row="10"><th scope="row" class="center " data-stat="number">4</th><td class="left " data-stat="player" csk="Rondo,Rajon"><a href="/players/r/rondora01.html">Rajon Rondo</a></td><td class="center " data-stat="pos" csk="1">PG</td><td class="right " data-stat="height" csk="73.0">6-1</td><td class="right " data-stat="weight">180</td><td class="left " data-stat="birth_date" csk="19860222">February 22, 1986</td><td class="right " data-stat="birth_country"><span class="f-i f-us" style="">us</span></td><td class="right " data-stat="years_experience" csk="15">15</td><td class="left " data-stat="college"><a href="/friv/colleges.fcgi?college=kentucky">Kentucky</a></td></tr>
<tr data-row="11"><th scope="row" class="center " data-stat="number">2</th><td class="left " data-stat="player" csk="Ellington,Wayne"><a href="/players/e/ellinwa01.html">Wayne Ellington</a></td><td class="center " data-stat="pos" csk="2">SG</td><td class="right " data-stat="height" csk="76.0">6-4</td><td class="right " data-stat="weight">207</td><td class="left " data-stat="birth_date" csk="19871129">November 29, 1987</td><td class="right " data-stat="birth_country"><span class="f-i f-us" style="">us</span></td><td class="right " data-stat="years_experience" csk="12">12</td><td class="left " data-stat="college"><a href="/friv/colleges.fcgi?college=unc">UNC</a></td></tr>
<tr data-row="12"><th scope="row" class="center iz" data-stat="number"></th><td class="left " data-stat="player" csk="Horton-Tucker,Talen"><a href="/players/h/hortota01.html">Talen Horton-Tucker</a></td><td class="center " data-stat="pos" csk="2">SG</td><td class="right " data-stat="height" csk="76.0">6-4</td><td class="right " data-stat="weight">234</td><td class="left " data-stat="birth_date" csk="20001125">November 25, 2000</td><td class="right " data-stat="birth_country"><span class="f-i f-us" style="">us</span></td><td class="right " data-stat="years_experience" csk="2">2</td><td class="left " data-stat="college"><a href="/friv/colleges.fcgi?college=iowast">Iowa State</a></td></tr>
<tr data-row="13"><th scope="row" class="center iz" data-stat="number"></th><td class="left " data-stat="player" csk="Nunn,Kendrick"><a href="/players/n/nunnke01.html">Kendrick Nunn</a></td><td class="center " data-stat="pos" csk="1">PG</td><td class="right " data-stat="height" csk="74.0">6-2</td><td class="right " data-stat="weight">190</td><td class="left " data-stat="birth_date" csk="19950803">August 3, 1995</td><td class="right " data-stat="birth_country"><span class="f-i f-us" style="">us</span></td><td class="right " data-stat="years_experience" csk="2">2</td><td class="left " data-stat="college"><a href="/friv/colleges.fcgi?college=illinois">Illinois</a>, <a href="/friv/colleges.fcgi?college=oakland">Oakland</a></td></tr>
<tr data-row="14"><th scope="row" class="center iz" data-stat="number"></th><td class="left " data-stat="player" csk="Doumbouya,Sekou"><a href="/players/d/doumbse01.html">Sekou Doumbouya</a>&nbsp;&nbsp;<span class="note"><small>(TW)</small></span></td><td class="center " data-stat="pos" csk="4">PF</td><td class="right " data-stat="height" csk="80.0">6-8</td><td class="right " data-stat="weight">230</td><td class="left " data-stat="birth_date" csk="20001223">December 23, 2000</td><td class="right " data-stat="birth_country"><span class="f-i f-gn" style="">gn</span></td><td class="right " data-stat="years_experience" csk="2">2</td><td class="left iz" data-stat="college"></td></tr>
<tr data-row="15"><th scope="row" class="center iz" data-stat="number"></th><td class="left " data-stat="player" csk="Ariza,Trevor"><a href="/players/a/arizatr01.html">Trevor Ariza</a></td><td class="center " data-stat="pos" csk="3">SF</td><td class="right " data-stat="height" csk="80.0">6-8</td><td class="right " data-stat="weight">215</td><td class="left " data-stat="birth_date" csk="19850630">June 30, 1985</td><td class="right " data-stat="birth_country"><span class="f-i f-us" style="">us</span></td><td class="right " data-stat="years_experience" csk="17">17</td><td class="left " data-stat="college"><a href="/friv/colleges.fcgi?college=ucla">UCLA</a></td></tr>
<tr data-row="16"><th scope="row" class="center iz" data-stat="number"></th><td class="left " data-stat="player" csk="Huff,Jay"><a href="/players/h/huffja01.html">Jay Huff</a>&nbsp;&nbsp;<span class="note"><small>(TW)</small></span></td><td class="center " data-stat="pos" csk="4.25">F-C</td><td class="right " data-stat="height" csk="85.0">7-1</td><td class="right " data-stat="weight">240</td><td class="left " data-stat="birth_date" csk="19980825">August 25, 1998</td><td class="right " data-stat="birth_country"><span class="f-i f-us" style="">us</span></td><td class="right " data-stat="years_experience" csk="0.5">R</td><td class="left " data-stat="college"><a href="/friv/colleges.fcgi?college=virginia">Virginia</a></td></tr>

</tbody></table>


</div>



</div>
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
package com.app.downtown.infra.httpclient

import org.jsoup.Jsoup
import org.jsoup.nodes.Document

class JsoupHttpClient: JsoupClient {
    override fun get(url: String): Document = Jsoup.connect(url).get()
}
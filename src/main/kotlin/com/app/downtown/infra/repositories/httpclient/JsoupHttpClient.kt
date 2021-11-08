package com.app.downtown.infra.repositories.httpclient

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.springframework.stereotype.Repository

@Repository
class JsoupHttpClient: JsoupClient {
    override fun get(url: String): Document = Jsoup.connect(url).get()
}
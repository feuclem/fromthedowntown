package com.app.downtown.infra.httpclient

import org.jsoup.nodes.Document

interface JsoupClient {
    fun get(url: String): Document
}
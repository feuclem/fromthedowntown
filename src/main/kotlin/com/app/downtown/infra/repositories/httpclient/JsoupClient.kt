package com.app.downtown.infra.repositories.httpclient

import org.jsoup.nodes.Document

interface JsoupClient {
    fun get(url: String): Document
}
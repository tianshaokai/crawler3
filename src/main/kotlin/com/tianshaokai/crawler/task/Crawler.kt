package com.tianshaokai.crawler.task

import com.tianshaokai.crawler.entity.HomePage
import com.tianshaokai.crawler.utils.NumberUtils
import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.slf4j.LoggerFactory

class Crawler {

    private val logger = LoggerFactory.getLogger(Crawler::class.java);

    private fun getDocument(url : String?): Document? {
        val userAgent = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.59 Safari/537.36"
        var doc: Document? = null
        try {
            doc = Jsoup.connect(url).userAgent(userAgent).timeout(60000).get()
        } catch (e: Exception) {
            logger.error("解析网页 {} 失败: {}", url, e.toString())
        }
        return doc
    }

    fun getMeituImageHomePageTotalList(homePage: HomePage) : ArrayList<HomePage> {
        val homePageList = arrayListOf<HomePage>()
        val document: Document? = getDocument(homePage.url) ?: return homePageList;
        val linkPage = document!!.select(homePage.totalPageRole)
        val element =  linkPage.get(0)
        val max = NumberUtils.getNumber(element.text())
        for (i in 1..max) {
            val page = HomePage();
            page.url = homePage.url
            page.siteName = homePage.siteName
            page.role = homePage.role
            homePageList.add(page)
        }
        return homePageList
    }



}
package com.tianshaokai.crawler.task

import com.tianshaokai.crawler.config.SiteConfig
import com.tianshaokai.crawler.entity.HomePage

class HomePageTask {

    lateinit var config :SiteConfig

    lateinit var crawler :Crawler

    /**
     * 爬虫开始方法
     */
    fun execute() {

        val homePage = config.getHomePage()

        crawlerImage(homePage)
    }

    fun crawlerImage(homePage: HomePage) {
        val homePageList = crawler.getMeituImageHomePageTotalList(homePage)



        print("获取总页码： " + homePageList.size)
    }
}
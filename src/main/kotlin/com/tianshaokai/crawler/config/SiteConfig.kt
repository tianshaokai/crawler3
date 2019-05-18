package com.tianshaokai.crawler.config

import com.tianshaokai.crawler.entity.HomePage

class SiteConfig {


    fun getHomePage(): HomePage {

        val homePage = HomePage();

        homePage.id = 1;
        homePage.siteName = "白皙气质女神carry写真 私房黑色内衣妩媚撩人"
        homePage.url = "http://www.girlsky.cn/article/29314/"
        homePage.role = "div.ImageBody > p > a"
        homePage.totalPageRole = "div.NewPages > ul > li"

        return homePage;
    }
}
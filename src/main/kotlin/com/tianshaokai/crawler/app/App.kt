package com.tianshaokai.crawler.app

import org.springframework.context.ApplicationContext
import org.springframework.context.support.ClassPathXmlApplicationContext

object App {

    private var context: ApplicationContext

    init {
        val springConfXml = arrayOf("/app-conf.xml")
        context = ClassPathXmlApplicationContext(springConfXml, App.javaClass)
    }

    fun getContext(): ApplicationContext {
        return context;
    }
}
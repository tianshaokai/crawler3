package com.tianshaokai.crawler.utils

import java.util.regex.Pattern

object NumberUtils {
    /**
     * 过滤字符串中的数字
     */
    fun getNumber(str: String): Int {
        val regEx = "[^0-9]"
        val p = Pattern.compile(regEx)
        val m = p.matcher(str)
        val total = m.replaceAll("").trim()
        return Integer.parseInt(total)
    }
}
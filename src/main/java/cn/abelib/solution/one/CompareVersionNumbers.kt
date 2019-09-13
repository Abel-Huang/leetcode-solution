package cn.abelib.solution.one

import org.junit.Test
import kotlin.math.max
import kotlin.math.min

/**
 * @Author: abel.huang
 * @Date: 2019-09-12 22:33
 */
class CompareVersionNumbers {
    fun compareVersion(version1: String, version2: String): Int {

        val versions1 =  version1.split(".")
        val versions2 =  version2.split(".")

        val maxLen = max(versions1.size, versions2.size)
        val minLen = min(versions1.size, versions2.size)
        for (i in 0 until minLen) {
            if (versions1[i].toInt() > versions2[i].toInt()) {
                return 1
            }
            if (versions1[i].toInt() < versions2[i].toInt()) {
                return -1
            }
        }
        if (maxLen == minLen) {
            return 0
        }
        if (versions1.size > minLen) {
            for (i in minLen until maxLen) {
                if (versions1[i].toInt() > 0) {
                    return 1
                }
            }
            return 0
        }
        if (versions2.size > minLen) {
            for (i in minLen until maxLen) {
                if (versions2[i].toInt() > 0) {
                    return -1
                }
            }
            return 0
        }
        return 0
    }

    @Test
    fun compareVersionTest() {
        val version1 = "0.1"
        val version2 = "1.1"
        println(compareVersion(version1, version2))

        val version3 = "7.5.2.4"
        val version4 = "7.5.3"
        println(compareVersion(version3, version4))

        val version5 = "1.01"
        val version6 = "1.001"
        println(compareVersion(version5, version6))
    }
}
package cn.abelib.solution.ten

import org.junit.Test

/**
 * @Author: abel.huang
 * @Date: 2019-09-13 11:38
 */
class HeightChecker1051 {
    fun heightChecker(heights: IntArray): Int {
        if (heights.size < 2) {
            return 0
        }
        val intArray = heights.copyOf()
        heights.sort()
        var count = 0
        for (i in heights.indices) {
            if (heights[i] != intArray[i]) {
                count ++
            }
        }
        return count
    }

    @Test
    fun heightCheckerTest() {
        val intArray = intArrayOf(1,2,6,3,7,9,4)
        println(heightChecker(intArray))
        val intArray1 = intArrayOf(1,1,4,2,1,3)
        println(heightChecker(intArray1))
    }

}
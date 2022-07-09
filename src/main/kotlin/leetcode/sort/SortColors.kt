package leetcode.sort

import java.util.*


class SortColors {
    fun sortColors(nums: IntArray): IntArray {
        val map = TreeMap<Int, Int>()
        for (i in nums.indices) {
            map.compute(nums[i]) { key, value ->
                if (value == null) 1 else value + 1
            }
        }
        var k = 0
        map.forEach { (key, value) ->
            for (i in 0 until value) {
                nums[k] = key
                k++
            }
        }
        return nums
    }
}

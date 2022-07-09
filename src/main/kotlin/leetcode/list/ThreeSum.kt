package leetcode.list

import java.util.*


class ThreeSum {
    fun threeSum(nums: IntArray): List<List<Int>> {
        Arrays.sort(nums)
        val result: MutableSet<List<Int>> = HashSet()

        for (i in 0 until nums.size - 1) {
            var front = 0
            var last = nums.size - 1
            if (i == front) front++
            if (i == last) last--
            while (front < last) {
                val sum = (nums[front] + nums[last] + nums[i]).toLong()
                if (sum == 0L) {
                    val newArray = arrayOf(nums[front], nums[i], nums[last])
                    Arrays.sort(newArray)
                    result.add(java.util.List.of(*newArray))
                    front++
                    last--
                }
                if (sum < 0) front++
                if (sum > 0) last--
                if (i == front) front++
                if (i == last) last--
            }
        }
        return ArrayList(result)
    }
}

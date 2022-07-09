package leetcode.sort

import java.util.*
import kotlin.collections.HashMap


class TopFrequent {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        if (k == nums.size) {
            return nums
        }
        val map = HashMap<Int, Int?>()
        for (i in nums.indices) {
            map.compute(nums[i]) { _, value ->
                if (value == null) 1 else value + 1
            }
        }
        val queue: Queue<Int> = PriorityQueue { n1: Int, n2: Int -> map[n1]!! - map[n2]!! }
        for (n in map.keys) {
            queue.add(n)
            if (queue.size > k) {
                queue.poll()
            }
        }
        val top = IntArray(k)
        for (i in k - 1 downTo 0) {
            top[i] = queue.poll()
        }
        return top
    }
}

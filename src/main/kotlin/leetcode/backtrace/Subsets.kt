package leetcode.backtrace


class Subsets {
    fun subsets(nums: IntArray): List<List<Int?>>? {
        if (nums.size == 0) {
            return emptyList()
        }

        // Input: nums = [1,2,3]
        // Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
        val result: MutableList<List<Int?>> = ArrayList()
        subsets(result, ArrayList(), 0, nums)
        return result
    }

    private fun subsets(result: MutableList<List<Int?>>, list: MutableList<Int?>, pos: Int, nums: IntArray) {
        result.add(ArrayList(list))
        for (i in pos until nums.size) {
            list.add(nums[i])
            subsets(result, list, i + 1, nums)
            list.removeAt(list.size - 1)
        }
    }
}

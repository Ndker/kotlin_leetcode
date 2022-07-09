package leetcode.backtrace


class PermuteSolution {
    fun permute(nums: IntArray): List<List<Int?>> {
        if (nums.isEmpty()) {
            return emptyList()
        }
        val result: MutableList<List<Int?>> = ArrayList()
        permute(result, ArrayList(), 0, nums)
        return result
    }

    private fun permute(result: MutableList<List<Int?>>, list: MutableList<Int?>, pos: Int, nums: IntArray) {
        if (pos == nums.size) {
            result.add(ArrayList(list))
            // list.clear();
        } else {
            for (i in nums.indices) {
                if (!list.contains(nums[i])) {
                    list.add(nums[i])
                    permute(result, ArrayList(list), pos + 1, nums)
                    list.removeAt(list.size - 1)
                }
            }
        }
    }
}

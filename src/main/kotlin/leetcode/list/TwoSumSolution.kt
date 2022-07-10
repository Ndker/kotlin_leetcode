package leetcode.list

class TwoSumSolution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        /*
        Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
         */
        // You may assume that each input would have exactly one solution, and you may not use the same element twice.
        // [3,2,4]
        // [0,1,2]
        //  ==>
        // [2,3,4]
        // [1,0,2]

        val indices = IntArray(nums.size)
        var index = 0
        for (idx in nums.indices)
            indices[index++] = idx

        var isMoved = true
        while (isMoved) {
            isMoved = false
            for (i in 0 until nums.size - 1) {

                if (nums[i] > nums[i + 1]) {
                    var temp = nums[i]
                    nums[i] = nums[i + 1]
                    nums[i + 1] = temp

                    temp = indices[i]
                    indices[i] = indices[i + 1]
                    indices[i + 1] = temp

                    isMoved = true
                }
            }
        }

        for (i in 0..nums.size - 2) {
            for (j in i + 1 until nums.size) {

                val sum = nums[i] + nums[j]
                if (sum == target) {
                    val result = IntArray(2)
                    result[0] = indices[i]
                    result[1] = indices[j]
                    return result
                }

                if (sum > target) {
                    break
                }
            }
        }
        return IntArray(0)
    }
}

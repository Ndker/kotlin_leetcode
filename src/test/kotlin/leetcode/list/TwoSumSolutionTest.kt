package leetcode.list

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class TwoSumSolutionTest {

    @Test
    fun `when pass input array _ then return indices with target sum`() {
        /*
        Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
         */

        val test = TwoSumSolution()
        val input = intArrayOf(2, 7, 11, 15)

        test.twoSum(input, 9).also {
            assertEquals(2, it.size)

            assertEquals(0, it[0])
            assertEquals(1, it[1])

        }
    }

    @Test
    fun `when pass input array without order _ then return indices with target sum`() {
        val test = TwoSumSolution()
        val input = intArrayOf(3, 2, 4)

        test.twoSum(input, 6).also {
            assertEquals(2, it.size)

            assertEquals(1, it[0])
            assertEquals(2, it[1])

        }
    }


    @Test
    fun `when pass input array with same elements _ then return indices with target sum`() {
        val test = TwoSumSolution()
        val input = intArrayOf(3, 3)

        test.twoSum(input, 6).also {
            assertEquals(2, it.size)

            assertEquals(0, it[0])
            assertEquals(1, it[1])

        }
    }

    @Test
    fun `when pass input array and no matches with target _ then return empty result`() {
        val test = TwoSumSolution()
        val input = intArrayOf(2, 8, 11, 15)

        test.twoSum(input, 9).also {
            assertTrue(it.isEmpty())
        }
    }
}

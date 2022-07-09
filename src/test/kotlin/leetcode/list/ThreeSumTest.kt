package leetcode.list

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class ThreeSumTest {

    @Test
    fun `when call threeSum with no zero triplet _ then return empty list`() {
        val test = ThreeSum()
        val input = intArrayOf(0, 1, 1)

        test.threeSum(input).also {
            assertTrue(it.isEmpty())
        }
    }

    @Test
    fun `when call threeSum with one zero triplet _ then return single result in list`() {
        val test = ThreeSum()
        val input = intArrayOf(0, 0, 0)

        test.threeSum(input).also {
            assertEquals(1, it.size)
            assertEquals(3, it[0].size)
            assertTrue(it[0].all { v -> v == 0 })
        }
    }

    @Test
    fun `when call threeSum with multiple triplets _ then return them result in list`() {
        val test = ThreeSum()
        val input = intArrayOf(-1, 0, 1, 2, -1, -4)

        test.threeSum(input).also {
            assertEquals(2, it.size)
            assertEquals(-1, it[0][0])
            assertEquals(-1, it[0][1])
            assertEquals(2, it[0][2])

            assertEquals(-1, it[1][0])
            assertEquals(0, it[1][1])
            assertEquals(1, it[1][2])
        }
    }

}

package leetcode.backtrace

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class StringInterleavingTest {

    @Test
    fun `when pass two strings and third is interleaving of  then _ then return true `() {
        val test = StringInterleaving()
        val s1 = "aabcc"
        val s2 = "dbbca"
        val s3 = "aadbbcbcac"

        assertTrue(test.isInterleave(s1, s2, s3))
    }

}

package leetcode.backtrace

class StringInterleaving {

    private fun isInterleave(s1: String, i: Int, s2: String, j: Int, s3: String, k: Int, array: Array<IntArray>): Boolean {
        if (i == s1.length) {
            return s2.substring(j) == s3.substring(k)
        }
        if (j == s2.length) {
            return s1.substring(i) == s3.substring(k)
        }
        if (array[i][j] >= 0) {
            return if (array[i][j] == 1) true else false
        }
        var result = false
        if (s3[k] == s1[i] && isInterleave(s1, i + 1, s2, j, s3, k + 1, array)
            || s3[k] == s2[j] && isInterleave(s1, i, s2, j + 1, s3, k + 1, array)
        ) {
            result = true
        }
        array[i][j] = if (result) 1 else 0
        return result
    }

    fun isInterleave(s1: String, s2: String, s3: String): Boolean {
        if (s1.length + s2.length != s3.length) {
            return false
        }
        val array = Array(s1.length) {
            IntArray(s2.length)
        }
        for (i in 0 until s1.length) {
            for (j in 0 until s2.length) {
                array[i][j] = -1
            }
        }
        return isInterleave(s1, 0, s2, 0, s3, 0, array)
    }
}

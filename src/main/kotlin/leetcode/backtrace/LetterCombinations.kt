package leetcode.backtrace


class LetterCombinations {
    private val map = HashMap<Char, String>()

    fun letterCombinations(digits: String): List<String> {
        map['2'] = "abc"
        map['3'] = "def"
        map['4'] = "ghi"
        map['5'] = "jkl"
        map['6'] = "mno"
        map['7'] = "pqrs"
        map['8'] = "tuv"
        map['9'] = "wxyz"
        if ("" == digits) {
            return ArrayList()
        }
        val result: MutableList<String> = ArrayList()
        rec(0, digits.length, StringBuilder(), result, digits)
        return result
    }

    private fun rec(pos: Int, length: Int, builder: StringBuilder, result: MutableList<String>, digits: String) {
        if (pos == length) {
            result.add(builder.toString())
        } else {
            val str = map[digits[pos]]
            for (i in 0 until str!!.length) {
                rec(pos + 1, length, StringBuilder(builder).append(str[i]), result, digits)
            }
        }
    }
}

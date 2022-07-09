package leetcode.backtrace


class GenBraces {
    fun generateParenthesis(n: Int): List<String?> {
        // n = 3
        // l1 = "("; l2 = ")";
        // "( ( (", ") ) )"
        // ["((()))","(()())","(())()","()(())","()()()"]
        if (n == 0) {
            return ArrayList()
        }
        val result: MutableList<String?> = ArrayList()
        braces(result, StringBuilder(), 0, 0, n)
        return result
    }

    private fun braces(result: MutableList<String?>, builder: StringBuilder, opening: Int, closing: Int, total: Int) {
        if (opening == closing && opening == total) {
            result.add(builder.toString())
            return
        }
        if (opening < total) {
            braces(result, StringBuilder(builder).append("("), opening + 1, closing, total)
        }
        if (closing < opening) {
            braces(result, StringBuilder(builder).append(")"), opening, closing + 1, total)
        }
    }
}

package leetcode.backtrace

class WordSearch {

    fun exist(board: Array<CharArray>, word: String): Boolean {
        if (board.size == 0) {
            return false
        }
        val m = board[0].size - 1
        val n = board.size - 1
        val chars = word.toCharArray()
        for (i in 0..n) {
            for (j in 0..m) {
                if (board[i][j] == chars[0]) {
                    if (chars.size == 1 || exist(board, chars, 0, i, j)) {
                        return true
                    }
                }
            }
        }
        return false
    }


    private fun exist(board: Array<CharArray>, chars: CharArray, pos: Int, i: Int, j: Int): Boolean {
        if (pos == chars.size) {
            return true
        }
        if (board[i][j] != chars[pos]) {
            return false
        }
        val tmp = board[i][j]
        board[i][j] = '0'
        var result = false
        if (i < board.size - 1) {
            result = exist(board, chars, pos + 1, i + 1, j)
        }
        if (!result && i > 0) {
            result = exist(board, chars, pos + 1, i - 1, j)
        }
        if (!result && j < board[0].size - 1) {
            result = exist(board, chars, pos + 1, i, j + 1)
        }
        if (!result && j > 0) {
            result = exist(board, chars, pos + 1, i, j - 1)
        }
        board[i][j] = tmp
        return result
    }
}

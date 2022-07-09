import leetcode.backtrace.*
import leetcode.list.*
import leetcode.sort.*
import leetcode.tree.*
import java.util.*

fun main(args: Array<String>) {
    // println(LetterCombinations().letterCombinations("23"))
    // println(GenBraces().generateParenthesis(5))
    // println(PermuteSolution().permute(nums = intArrayOf(1,2,3)))
    // println(Subsets().subsets(intArrayOf(1, 2, 3, 4, 5)))
    /*
    println(WordSearch().exist(
        arrayOf(
            charArrayOf('A','B','C','E'),
            charArrayOf('S','F','C','S'),
            charArrayOf('A','D','E','E')
        ),
        "DEE"
    )) */
    // println(ThreeSum().threeSum(intArrayOf(-1, 0, 1, 2, -1, -4)))

    println(SortColors().sortColors(intArrayOf(2, 0, 2, 1, 1, 0)).contentToString())
    println(TopFrequent().topKFrequent(intArrayOf(1, 1, 1, 2, 2, 3), 2).contentToString())
}


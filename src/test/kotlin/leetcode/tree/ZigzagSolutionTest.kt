package leetcode.tree

import leetcode.tree.model.TreeNode
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ZigzagSolutionTest {

    @Test
    fun `when pass tree _ then return zigZag path as list`() {
        val input = TreeNode(
            3,
            TreeNode(9),
            TreeNode(
                20,
                TreeNode(15),
                TreeNode(7)
            )
        )
        val test = ZigzagSolution()

        test.zigzagLevelOrder(input).also {
            assertEquals(3, it.size)

            assertEquals(1, it[0].size)
            assertEquals(3, it[0][0])

            assertEquals(2, it[1].size)
            assertEquals(20, it[1][0])
            assertEquals(9, it[1][1])

            assertEquals(2, it[2].size)
            assertEquals(15, it[2][0])
            assertEquals(7, it[2][1])
        }
    }

}

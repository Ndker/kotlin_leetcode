package leetcode.tree

import leetcode.tree.model.TreeNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class InorderSolutionTest {

    @Test
    fun `when pass tree _ then return list with opposite order of root nodes`() {
        // Input: root = [1,null,2,3]
        //Output: [1,3,2]

        val input = TreeNode(
            1,
            null,
            TreeNode(
                2,
                TreeNode(3),
                null
            )
        )
        val test = InorderSolution()

        test.inorderTraversal(input).also {
            assertEquals(3, it.size)

            assertEquals(1, it[0])
            assertEquals(3, it[1])
            assertEquals(2, it[2])
        }
    }

}

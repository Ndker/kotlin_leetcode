package leetcode.tree

import leetcode.tree.model.TreeNode


class InorderSolution {

    private val result: MutableList<Int> = ArrayList()

    private fun inorder(root: TreeNode?) {
        if (root == null) {
            return
        }
        inorder(root.left)
        result.add(root.value)
        inorder(root.right)
    }

    fun inorderTraversal(root: TreeNode?): List<Int> {
        if (root == null) {
            return result
        }
        inorder(root)
        return result
    }
}

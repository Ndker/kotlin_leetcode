package leetcode.tree

import leetcode.tree.model.TreeNode
import java.util.*


class ZigzagSolution {

    fun zigzagLevelOrder(root: TreeNode?): List<MutableList<Int?>?> {
        if (root == null) {
            return emptyList()
        }
        var currentLevel = Stack<TreeNode>().apply {
            push(root)
        }
        var nextLevel = Stack<TreeNode>()

        var leftToRight = true
        val result: MutableList<MutableList<Int?>?> = ArrayList()
        var current: MutableList<Int?>? = null
        // result.add(current);

        var levelChanged = true
        while (!currentLevel.isEmpty()) {

            val node = currentLevel.pop()
            if (levelChanged) {
                result.add(ArrayList())
                current = result[result.size - 1]
                levelChanged = false
            }
            current!!.add(node.value)
            if (leftToRight) {
                if (node.left != null) {
                    nextLevel.push(node.left)
                }
                if (node.right != null) {
                    nextLevel.push(node.right)
                }
            } else {
                if (node.right != null) {
                    nextLevel.push(node.right)
                }
                if (node.left != null) {
                    nextLevel.push(node.left)
                }
            }
            if (currentLevel.isEmpty()) {
                leftToRight = !leftToRight
                val temp = currentLevel
                currentLevel = nextLevel
                nextLevel = temp
                levelChanged = true
            }
        }
        return result
    }
}

package leetcode.list

import leetcode.list.model.ListNode
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class TwoNumbersSolutionTest {

    @Test
    fun `when combine numbers in list _ then return result as linked list`() {
        // Input: l1 = [2,4,3], l2 = [5,6,4]
        // Output: [7,0,8]
        // Explanation: 342 + 465 = 807.
        val test = TwoNumbersSolution()
        val first = ListNode(2, ListNode(4, ListNode(3)))
        val second = ListNode(5, ListNode(6, ListNode(4)))

        test.addTwoNumbers(first, second).also {
            assertNotNull(it)

            assertEquals(7,it!!.value)
            assertEquals(0,it.next!!.value)
            assertEquals(8,it.next!!.next!!.value)
        }
    }

}

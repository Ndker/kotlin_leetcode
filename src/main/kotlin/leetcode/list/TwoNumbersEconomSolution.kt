package leetcode.list

import leetcode.list.model.ListNode

class TwoNumbersEconomSolution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var list1 = l1
        var list2 = l2
        val result = ListNode(0)
        var current: ListNode? = result
        var add = 0

        while (list1 != null || list2 != null || add != 0) {
            var sum = add
            if (list1 != null) {
                sum += list1.value
                list1 = list1.next
            }
            if (list2 != null) {
                sum += list2.value
                list2 = list2.next
            }
            add = sum / 10
            current!!.next = ListNode(sum % 10)
            current = current.next
        }

        return result.next
    }
}

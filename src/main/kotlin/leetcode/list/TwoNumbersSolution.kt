package leetcode.list

import leetcode.list.model.ListNode

class TwoNumbersSolution {

    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        // Input: l1 = [2,4,3], l2 = [5,6,4]
        // Output: [7,0,8]
        // Explanation: 342 + 465 = 807.
        val (array1, count1) = getNumber(l1)
        val (array2, count2) = getNumber(l2)
        val result = IntArray(101) /// !!!
        var dif = 0
        val resultCount = Math.max(count2, count1) + 1
        var i1 = 0
        var i2 = 0
        while (i1 <= count1 || i2 <= count2) { // one more step for dif write.
            val n1 = if (i1 > count1 - 1) 0 else array1[i1]
            val n2 = if (i2 > count2 - 1) 0 else array2[i2]
            val number = n1 + n2 + dif
            if (number >= 10) {
                result[i1] = number - 10
                dif = 1
            } else {
                result[i1] = number
                dif = 0
            }
            i1++
            i2++
        }
        var current: ListNode? = null
        for (i in resultCount - 1 downTo 0) {
            if (i == resultCount - 1 && result[i] == 0) {
                continue
            }
            val newNode = ListNode(result[i])
            newNode.next = current
            current = newNode
        }
        return current
    }

    private fun getNumber(listNode: ListNode?): Pair<IntArray, Int> {
        if (listNode == null) {
            return Pair(IntArray(0), 0)
        }

        // [5,6,4]
        var count = 0
        val array = IntArray(100)
        var current = listNode // 5
        while (current != null) {
            array[count] = current.value // 5
            current = current.next // 6
            count++
        }
        return Pair(array, count)


        // {5,6,4}, count == 3
//        double result = 0
//        int pow = count - 1
//        for (int i = count - 1; i >= 0; i--) {
//            result = result + (long) array[i] * pow(10, pow)
//            pow--
//        }
//        return Math.round(result)
    }
}

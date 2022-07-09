package leetcode.list.model

class ListNode {
    var value: Int
    var next: ListNode? = null

    constructor(value: Int) {
        this.value = value
    }

    constructor(value: Int, next: ListNode) {
        this.value = value
        this.next = next
    }
}

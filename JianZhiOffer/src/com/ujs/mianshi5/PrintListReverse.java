package com.ujs.mianshi5;

import java.util.Stack;

/**
 * 从尾到头打印链表
 * @author SUN
 * 非递归方式
 */
public class PrintListReverse {
	public static void main(String[] args) {
		ListNode<Integer> node1 = new ListNode<Integer>(1);
		ListNode<Integer> node2 = new ListNode<Integer>(2);
		ListNode<Integer> node3 = new ListNode<Integer>(3);
		node1.next = node2;
		node2.next = node3;
		printListReverse(node1);
	}
	//从表头打印到表尾
	private static void printListReverse(ListNode<Integer> headNode) {
		Stack<ListNode<Integer>> stack = new Stack<ListNode<Integer>>();
		while(headNode != null) {
			stack.push(headNode);
			headNode = headNode.next;
		}
		while(!stack.isEmpty()) {
			System.out.println(stack.pop().val);
		}
	}
}

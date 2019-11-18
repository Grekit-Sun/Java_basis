package com.ujs.mianshi5;
/**
 * ��β��ͷ��ӡ����
 * @author SUN
 * �ݹ�ķ�ʽ
 */
public class PrintListReverse2 {
	public static void main(String[] args) {
		ListNode<Integer> node1 = new ListNode<Integer>(1);
		ListNode<Integer> node2 = new ListNode<Integer>(2);
		ListNode<Integer> node3 = new ListNode<Integer>(3);
		node1.next = node2;
		node2.next = node3;
		printListReverse(node1);
	}
	
	//�ݹ鷽ʽ
	private static void printListReverse(ListNode<Integer> headNode) {
		if (headNode != null) {
			if (headNode.next != null) {
				printListReverse(headNode.next);
			}
		}
		System.out.println(headNode.val);
	}
}

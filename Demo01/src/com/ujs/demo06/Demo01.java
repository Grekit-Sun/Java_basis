package com.ujs.demo06;

/**
 * 判断单项链表是否有环
 * @author SUN
 *
 */
public class Demo01 {
	
	
	
	public static <T> void main(String[] args) {
		
		int[] input = new int[]{1,2,3,4,5};
        ListNode head = buildListNode(input);
        Demo01 main = new Demo01();
		ListNode reverseKGroup = main.reverseKGroup(head,3);
		System.out.println(reverseKGroup.val);
		System.out.println(reverseKGroup.next.val);
		System.out.println(reverseKGroup.next.next.next.val);
		System.out.println(reverseKGroup.next.next.next.next.val);
		System.out.println(reverseKGroup.next.next.next.next.next.val);
	}
	
	/**
	 * 判断单项链表是否有环
	 * @param head
	 * @return true有环，flase无环
	 */
	private static <T> boolean isLoopList(ListNode<T> head) {
		ListNode<T> slowPointer, fastpointer;
		
		//使用快慢指针，慢指针每次向前一步，快指针每次两步
		slowPointer = fastpointer = head;
		while(fastpointer != null && fastpointer.next != null) {
			slowPointer = slowPointer.next;
			fastpointer = fastpointer.next.next;
			
			//两个指针相遇则有环
			if(slowPointer == fastpointer) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * K个一组翻转链表
	 * @param head
	 * @param k
	 * @return head头指针
	 */
	public ListNode reverseKGroup(ListNode head, int k) {
		ListNode current_node = head;
		int count =0;
		while (current_node != null && count != k) {
			current_node = current_node.next;
			count++;
		}
		if (count == k) {
			//利用递归解决子问题
			current_node = reverseKGroup(current_node , k);
			while (count-- > 0) {
				ListNode temp = head.next;
				head.next = current_node;
				current_node = head;
				head = temp;
			}	
			//最终，该段的所有节点将会截空，head应该指向current_node
			head = current_node;
		}
		return head;
	}
	
	private static ListNode buildListNode(int[] input) {
		ListNode first = null, last = null, newNode;
		int num;
		if(input.length > 0) {
			for(int i = 0;i < input.length; i++) {
				newNode = new ListNode(input[i]);
				newNode.next = null;
				if(first == null) {
					first = newNode;
					last = newNode;
				}else {
					last.next = newNode;
				}
			}
		}
		return first;
	}
	
}


class ListNode<T>
{
	int val;
	ListNode<T> next;
	
	public ListNode(int x) {
		val = x;
	}
}

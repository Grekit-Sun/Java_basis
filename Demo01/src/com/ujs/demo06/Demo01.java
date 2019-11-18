package com.ujs.demo06;

/**
 * �жϵ��������Ƿ��л�
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
	 * �жϵ��������Ƿ��л�
	 * @param head
	 * @return true�л���flase�޻�
	 */
	private static <T> boolean isLoopList(ListNode<T> head) {
		ListNode<T> slowPointer, fastpointer;
		
		//ʹ�ÿ���ָ�룬��ָ��ÿ����ǰһ������ָ��ÿ������
		slowPointer = fastpointer = head;
		while(fastpointer != null && fastpointer.next != null) {
			slowPointer = slowPointer.next;
			fastpointer = fastpointer.next.next;
			
			//����ָ���������л�
			if(slowPointer == fastpointer) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * K��һ�鷭ת����
	 * @param head
	 * @param k
	 * @return headͷָ��
	 */
	public ListNode reverseKGroup(ListNode head, int k) {
		ListNode current_node = head;
		int count =0;
		while (current_node != null && count != k) {
			current_node = current_node.next;
			count++;
		}
		if (count == k) {
			//���õݹ���������
			current_node = reverseKGroup(current_node , k);
			while (count-- > 0) {
				ListNode temp = head.next;
				head.next = current_node;
				current_node = head;
				head = temp;
			}	
			//���գ��öε����нڵ㽫��ؿգ�headӦ��ָ��current_node
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

package com.ujs.mianshi7;

import java.util.Stack;

/**
 * implement queue with two Stack
 * @author SUN
 * ������ջʵ��һ�����У�ʵ����������appendTail��deleteHead���ֱ�����ڶ��ж�β����ڵ�
 * ���ڶ���ͷ��ɾ�����Ĺ���
 */
public class ImpQueueWithTwoStack<T> {
	
	public static void main(String[] args) {
		ImpQueueWithTwoStack<String> impQueue = new ImpQueueWithTwoStack<String>();
		impQueue.appendTail("1");
		impQueue.appendTail("2");
		impQueue.appendTail("3");
		try {
			String head1 = impQueue.deleteHead();
			String head2 = impQueue.deleteHead();
			String head3 = impQueue.deleteHead();
			System.out.println(head1+"\n"+head2+"\n"+head3+"\n");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private Stack<T> mStack1 = new Stack<T>();
	private Stack<T> mStack2 = new Stack<T>();
	
	public void appendTail(T t) {
		mStack1.push(t);
	}
	public T deleteHead() throws Exception {
		if(mStack2.isEmpty()) {
			while(!mStack1.isEmpty()) {
				mStack2.push(mStack1.pop());
			}
		}
			if(mStack2.isEmpty()) {
				throw new Exception("���в���Ϊ�գ�");
			}
			return mStack2.pop();
		
	}
}

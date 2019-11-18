package com.ujs.sort;

public class BubbleSort {
	
	public static void main(String[] args) {
		int[] data = new int[10];
		initData(data);
		print(data);
//		bubbleSort(data);
		testSort(data);
		print(data);
	}
	
	/**
	 * ð������
	 *
	 * ��. �Ƚ����ڵ�Ԫ�ء������һ���ȵڶ����󣬾ͽ�������������
	 * ��. ��ÿһ������Ԫ����ͬ���Ĺ������ӿ�ʼ��һ�Ե���β�����һ�ԡ��ⲽ���������Ԫ�ػ�����������
	 * ��. ������е�Ԫ���ظ����ϵĲ��裬�������һ����
	 * ��. ����ÿ�ζ�Խ��Խ�ٵ�Ԫ���ظ�����Ĳ����~�ۣ�ֱ��û���κ�һ��������Ҫ�Ƚϡ�
	 * @param arr  ����������
	 */
	public static void bubbleSort(int[] arr) {
		int temp;
		for(int i = arr.length-1; i>0;i--) {
			for(int j = 0;j<i;j++) {
				if(arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	//���������
	public static void initData(int[] data) {
		for(int i = 0;i<data.length;i++) {
			data[i] = (int) Math.ceil(Math.random()*100);
		}
	}
	
	//��ӡ����
	public static void print(int[] data) {
		for(int i = 0 ;i<data.length;i++) {
			if(i == data.length-1) {
				System.out.print(data[i]);
			}else {
			System.out.print(data[i]+",");
			}
		}
		System.out.println("");
	}
	//�Լ�����
	public static void testSort(int[] arr) {
		for(int i=arr.length-1;i>0;i--) {
			for(int j=0;j<i;j++) {
				if(arr[j+1]<arr[j]) {
					int temp;
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}

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
	 * 冒泡排序
	 *
	 * ①. 比较相邻的元素。如果第一个比第二个大，就交换他们两个。
	 * ②. 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。这步做完后，最后的元素会是最大的数。
	 * ③. 针对所有的元素重复以上的步骤，除了最后一个。
	 * ④. 持续每次对越来越少的元素重复上面的步骤①~③，直到没有任何一对数字需要比较。
	 * @param arr  待排序数组
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
	
	//随机生成数
	public static void initData(int[] data) {
		for(int i = 0;i<data.length;i++) {
			data[i] = (int) Math.ceil(Math.random()*100);
		}
	}
	
	//打印数组
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
	//自己测试
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

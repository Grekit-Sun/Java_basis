package com.ujs.mianshi8;
/**
 * 旋转数组中最小数字(二分查找)
 * @author SUN
 * 题目：
 * 把一个数组最开始的几个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。例如{3，4，5，1，2}为{1，2，3，4，5}
 * 的一个旋转，该数组的最小值为1
 */
public class RotateArraryTheMinNum {

	public static void main(String[] args) {
		RotateArraryTheMinNum mRotate = new RotateArraryTheMinNum();
		int[] array = {1,0,1,1,1};
		
		System.out.println(mRotate.findMinNum(array));
	}
	
	private Integer findMinNum(int[] array) {
		if(array == null) {return null;}
		int leftIndex = 0;
		int rightIndex = array.length-1;
		int mid = 0;
		//左边的数字大于右边的数字
		while(array[leftIndex] >= array[rightIndex]) {
			if(rightIndex - leftIndex <= 1) {
				mid = rightIndex;
				break;
			}
			mid = (rightIndex+leftIndex)/2;
			if(array[rightIndex] == array[leftIndex] && 
					array[leftIndex] == array[mid]) {
				if(array[leftIndex+1] != array[rightIndex-1]) {
					mid = array[leftIndex+1]<array[rightIndex-1]?(leftIndex+1):(rightIndex-1);
					break;
				}else {
					leftIndex++;
					rightIndex--;
				}
			}else {
					if(array[mid] >= array[leftIndex]) {
						leftIndex = mid;
					}else {
						if(array[mid] <= array[rightIndex]) {
							rightIndex = mid;
						}
					}
				}
			}
			return array[mid];
		}
		
	}

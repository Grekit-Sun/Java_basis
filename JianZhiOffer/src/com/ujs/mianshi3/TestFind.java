package com.ujs.mianshi3;
/**
 * 二维数组中查找
 * @author SUN
 *
 */

/*题目描述：
 * 一个二维数组，每一行从左到右递增，每一列从上到下递增。
 * 输入一个二维数组和一个整数，判断数组中是否含有整数。
 * */
public class TestFind {
	static boolean find(int array[][], int num) {
		if(array == null) {
			return false;
		}
		int column = array[0].length - 1;
		int row = 0;
		//行小于数据的行的数据长度，列大于0
		while(row < array.length && column >= 0) {
			if(array[row][column] == num) {
				return true;
			}
			if(array[row][column] > num) {
				column--;
			}else {
				row++;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int[][] mArray = new int[4][4];
		int num = 100;
		int row = 0;
		int column = 4;
		for(int i = 0;i < mArray.length;i++) {
			for(int j = 0;j < mArray[i].length; j++) {
				mArray[i][j] = num++;
			}
		}
		
		for(int i = 0 ;i < 4; i++) {
			for(int j = 0 ; j < 4; j++) {
				System.out.println(mArray[i][j]);
			}
		}
		
		System.out.println(find(mArray,100));
	}
}

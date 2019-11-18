package com.ujs.mianshi3;
/**
 * ��ά�����в���
 * @author SUN
 *
 */

/*��Ŀ������
 * һ����ά���飬ÿһ�д����ҵ�����ÿһ�д��ϵ��µ�����
 * ����һ����ά�����һ���������ж��������Ƿ���������
 * */
public class TestFind {
	static boolean find(int array[][], int num) {
		if(array == null) {
			return false;
		}
		int column = array[0].length - 1;
		int row = 0;
		//��С�����ݵ��е����ݳ��ȣ��д���0
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

package com.ujs.demo06;

import java.util.Scanner;

public class Demo03 {



	/*�ڱ�֤��ʼ����ṹ���������£�����ͨ�����桰arraySort��һ������ʵ����Ŀ��Ҫ��Ҳ����ͨ���������ʵ��*/
	    
	/*=============��������������Ҫ��д����ĵط�����������Ĵ��붼����ɾ��==================*/

	/*��ں���������ɾ������Ϊ���·��е���*/
	    static int[] arraySort(int[] arr) {
			for (int i = 0; i < arr.length - 1 ; i++) {
	                if (arr[i] > arr[i + 1]) {
	                    int temp;
	                    // change
	                    temp = arr[i];
	                    arr[i] = arr[i+ 1];
	                    arr[i+ 1] = temp;
	                }
	            }
	        return arr;
	    }
	/*�����������Դ�����д��*/

	/*=============��������������Ҫ��д����ĵط�����������Ĵ��붼����ɾ��==================*/


	    public static void main(String[] args){
	        Scanner in = new Scanner(System.in);
	        int[] res;
	            
	        int _arr_size = 0;
	        _arr_size = Integer.parseInt(in.nextLine().trim());
	        int[] _arr = new int[_arr_size];
	        int _arr_item;
	        for(int _arr_i = 0; _arr_i < _arr_size; _arr_i++) {
	            _arr_item = Integer.parseInt(in.nextLine().trim());
	            _arr[_arr_i] = _arr_item;
	        }
	  
	        res = arraySort(_arr);
	        for(int res_i=0; res_i < res.length; res_i++) {
	            System.out.println(String.valueOf(res[res_i]));
	        }

	    }
	}


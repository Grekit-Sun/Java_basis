package com.ujs.demo06;

import java.util.Scanner;

public class Demo03 {



	/*在保证初始代码结构不变的情况下，可以通过下面“arraySort”一个函数实现题目的要求，也可以通过多个函数实现*/
	    
	/*=============这里往下是你主要编写代码的地方，此区域外的代码都不能删除==================*/

	/*入口函数，不能删除，因为在下方有调用*/
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
	/*其他函数可以从这里写起*/

	/*=============这里往上是你主要编写代码的地方，此区域外的代码都不能删除==================*/


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


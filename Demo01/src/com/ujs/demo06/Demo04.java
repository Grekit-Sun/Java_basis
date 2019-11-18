package com.ujs.demo06;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo04 {

    /*在保证初始代码结构不变的情况下，可以通过下面“char_count”一个函数实现题目的要求，也可以通过多个函数实现*/
    
    /*=============这里往下是你主要编写代码的地方，此区域外的代码都不能删除==================*/

    /*入口函数，不能删除，因为在下方“main”函数中有调用*/
    static String char_count(String str) {
    	LinkedHashMap<Character,Integer> hm = new LinkedHashMap();
     for(int i=0;i<str.length();i++){
         Character one = str.charAt(i);
         if(!hm.containsKey(one)){
             hm.put(one,1);
         }else{
             hm.put(one,hm.get(one) +1);
         }
     }
        String str1 = "";
     for(Map.Entry entry: hm.entrySet()){
         str1 =str1 +entry.getValue()+entry.getKey();
     }
        return str1;
    }
    /*其他函数可以从这里写起*/

    /*=============这里往上是你主要编写代码的地方，此区域外的代码都不能删除==================*/

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String res;
            
        String _str;
        try {
            _str = in.nextLine();
        } catch (Exception e) {
            _str = null;
        }
 
        /*以下代码根据需要，可以适当修改*/
        res = char_count(_str);    //
        System.out.println(res);
    }
}

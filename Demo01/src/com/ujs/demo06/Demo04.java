package com.ujs.demo06;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo04 {

    /*�ڱ�֤��ʼ����ṹ���������£�����ͨ�����桰char_count��һ������ʵ����Ŀ��Ҫ��Ҳ����ͨ���������ʵ��*/
    
    /*=============��������������Ҫ��д����ĵط�����������Ĵ��붼����ɾ��==================*/

    /*��ں���������ɾ������Ϊ���·���main���������е���*/
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
    /*�����������Դ�����д��*/

    /*=============��������������Ҫ��д����ĵط�����������Ĵ��붼����ɾ��==================*/

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String res;
            
        String _str;
        try {
            _str = in.nextLine();
        } catch (Exception e) {
            _str = null;
        }
 
        /*���´��������Ҫ�������ʵ��޸�*/
        res = char_count(_str);    //
        System.out.println(res);
    }
}

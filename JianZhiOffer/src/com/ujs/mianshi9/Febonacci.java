package com.ujs.mianshi9;
/**
 * 쳲��������У��������У�
 * @author SUN
 * �õݹ�ķ���
 * ͨ�ʽ��f(n+2) = f(n) + f(n+1)  f(1)=f(2)=1  n�ǵڼ�����
 */
public class Febonacci {
	public static void main(String[] args) {
		//��һ��ѭ����ӡ1~100������
		for(int i = 1; i<=10; i++) {
			System.out.println(feb(i));
		}
	}
	
	private static int feb(int n) {
		if(n == 1 || n ==2) {
			return 1;
		}else {
			//�ݹ�
			return feb(n-1)+feb(n-2); 
		}
	}
}

package com.ujs.string;

public class StringMethod {
	public static void main(String[] args) {
		String str = "abcdefghijk";
		//ʹ��StringBuffer����StringBuilder�����ַ���ת
		StringBuffer strBuff = new StringBuffer(str);
		System.out.println("�ַ���ת��"+strBuff.reverse());
//		indexOf():����ָ���ַ���������
		System.out.println("ָ���ַ�������:"+str.indexOf("d"));
//		charAt():����ָ�����������ַ���
		System.out.println("ָ�����������ַ���"+str.charAt(3));
//		replace():�ַ����滻��
		System.out.println("�ַ����滻:"+str.replace('a', 'c'));
//		trim():ȥ���ַ������˿հף�
		String strTrim = "      "+str+"           ";
		System.out.println("���˿հף�"+strTrim);
		System.out.println("ȥ�����˿հף�"+strTrim.trim());
//		split():�ָ��ַ���������һ���ָ����ַ������顣
		String[] strs = str.split("b");
		for(String str1 : strs) {
			System.out.println(str1);
		}
//		getBytes():�����ַ�����byte�������顣
		byte[] bytes = str.getBytes();
		System.out.print("�ַ�����byte��������:");
		for(byte b:bytes) {
			System.out.print(b+",");
		}
//		length():�����ַ������ȣ�
		System.out.println("�ַ�������:"+str.length());
//		toLowerCase():���ַ���ת��Сд��ĸ��
		String str2 = "KSKAjaskdjKJASFJAcakj";
		System.out.println("�ַ���ת��Сд��ĸ:"+str2.toLowerCase());
//		toUpperCase():���ַ���ת�ɴ�д��ĸ��
		System.out.println("���ַ���ת�ɴ�д��ĸ:"+str.toUpperCase());
//		substring():��ȡ�ַ���,������ȡ�ַ����н�������ָ���±�֮����ַ���
		System.out.println("��ȡ�ַ���1:"+str.substring(3,4));
		System.out.println("��ȡ�ַ���2:"+str.substring(3));
//		equals():�ַ����Ƚϣ�
	}
}

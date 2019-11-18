package com.ujs.flow;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/**
 * �ַ���
 * @author SUN
 * �ڳ����У�һ���ַ����������ֽڣ�����ַ������������ַ������Writer���ַ�������Reader
 * 
 * ʹ���ֽ���ʱ����ʹ��û�йرգ�����Ҳ����������ļ���
 * ʹ���ַ���ʱ�����е����ݱ����ڻ����������ر�ʱ ��ǿ���ԵĽ�����������д���ļ��У�
 * ���û�йر������ļ��оͲ��������������
 */
public class CharacterFlow {
	public static File file = new File(ByteFlow.FILEDIR+ByteFlow.FILE);
	public static void main(String[] args) {
		//�����ļ�
		ByteFlow.createFile(ByteFlow.FILEDIR,ByteFlow.FILE);
		//д����
		wirteDate();
		//������
		readDate();
	}
	
	private static void wirteDate() {
		//ʵ�������������
		try {
			Writer out = new FileWriter(file,true);
			//д����
			String str = "\r\n�ַ�������";
			out.write(str);
			out.flush();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void readDate() {
		//ʵ����������
		try {
			Reader in = new FileReader(file);
			//������
			char[] c = new char[(int)file.length()];
//			int len = in.read(c);
			int temp = 0;
			int len = 0;//����ÿһ����ȡ����������
			while((temp = in.read()) != -1){
			//����ļ���������
			c[len] = (char) temp;
			len++;
			}
			//�ر���
			in.close();
			System.out.println("�ļ����ݣ�"+new String(c));
//			System.out.println("�ļ����ݣ�"+new String(c,0,len));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

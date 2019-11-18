package com.ujs.flow;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * �ֽ���
 * @author SUN
 * �ֽ������������Ҫ��ʹ��OutputStream��ɣ�����ʹ��InputStream��ɣ�
 * �ַ������������Ҫ��ʹ��Writer����ɣ��������ʹ��Reader����ɡ�
 */
public class ByteFlow {
	//Ϊ���������ϵͳ�ָ�����File.separator 
	//�ļ�Ŀ¼
	public static final String FILEDIR = "C:"+File.separator+"Users"+File.separator+"SUN"+File.separator+"Desktop"+File.separator+"test";
	//�ļ�
	public static final String FILE = File.separator+"test.txt";
	//�ļ�
	public static File file ;
	//���䳣������Ϊ��д���Ҷ���Ϊpublic static final
	public static void main(String[] args) {
		//�����ļ�Ŀ¼�Լ��ļ�
		createFile(FILEDIR,FILE);
		//д������ �����
		writeDate();
		//��ȡ����������
		readDate();
	}
	
	public static void createFile(String filePath,String f) {
		File fileDir = new File(filePath);
		if(!fileDir.exists()) {
//			mkdir()  �����˳���·����ָ����Ŀ¼�������Ŀ¼�������򴴽����ɹ���
//			mkdirs() �����˳���·����ָ����Ŀ¼���������б��赫�����ڵĸ�Ŀ¼��
			fileDir.mkdirs();
		}
		file = new File(filePath+f);
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	private static void writeDate() {
		try {
			//ʵ�������������  true�ǲ����ǣ�false�Ǹ���
			OutputStream out = new FileOutputStream(file,true);
			//д����
			//���ļ��У�д�뻻�У����Ż��� \r\n   ����д����һ�е�ĩβ������һ�еĿ�ͷ
			String str = "\r\nHello world!";
			//ת��Ϊ�ֽ�����
			byte[] b = str.getBytes();
			out.write(b);
			out.flush(); //��ʱ����
			//flush()��������������������еĻ������ˢ�£�ʹ�������е�Ԫ�ؼ�ʱ�����������������صȻ�������
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	private static void readDate() {
		try {
			//ʵ����������
			InputStream in = new FileInputStream(file);
			//������
//			byte[] b = new byte[1024];	//ֱ��ָ���ռ��˷ѿռ�
			byte[] b = new byte[(int)file.length()];
//			int length = in.read(b);  //�������ݶ����ֽ������� 
			//����֪���ļ���Сʱ���Զ�ȡ�������Ƿ�Ϊ-1��Ϊ����ı�־��
			int temp = 0;
			int len = 0;//����ÿһ����ȡ����������
			while((temp = in.read()) != -1){
				//����ļ���������
				b[len] = (byte) temp;
				len++;
				}
			
			in.close();
			System.out.println("�ļ�����:"+new String(b)); 
//			System.out.println("�ļ�����:"+new String(b,0,length)); //��ʡ�ռ�
//			System.out.println("�ļ�����:"+new String(b));    //�˷ѿռ�
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

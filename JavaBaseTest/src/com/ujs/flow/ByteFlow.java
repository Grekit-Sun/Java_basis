package com.ujs.flow;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 字节流
 * @author SUN
 * 字节流输出数据主要是使用OutputStream完成，输入使用InputStream完成；
 * 字符流输出数据主要是使用Writer类完成，输出数据使用Reader类完成。
 */
public class ByteFlow {
	//为了适配各个系统分隔符用File.separator 
	//文件目录
	public static final String FILEDIR = "C:"+File.separator+"Users"+File.separator+"SUN"+File.separator+"Desktop"+File.separator+"test";
	//文件
	public static final String FILE = File.separator+"test.txt";
	//文件
	public static File file ;
	//不变常量名称为大写，且定义为public static final
	public static void main(String[] args) {
		//创建文件目录以及文件
		createFile(FILEDIR,FILE);
		//写入数据 输出流
		writeDate();
		//读取数据输入流
		readDate();
	}
	
	public static void createFile(String filePath,String f) {
		File fileDir = new File(filePath);
		if(!fileDir.exists()) {
//			mkdir()  创建此抽象路径名指定的目录。如果父目录不存在则创建不成功。
//			mkdirs() 创建此抽象路径名指定的目录，包括所有必需但不存在的父目录。
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
			//实例化输出流对象  true是不覆盖，false是覆盖
			OutputStream out = new FileOutputStream(file,true);
			//写操作
			//在文件中，写入换行，符号换行 \r\n   可以写在上一行的末尾或者下一行的开头
			String str = "\r\nHello world!";
			//转化为字节数组
			byte[] b = str.getBytes();
			out.write(b);
			out.flush(); //即时操作
			//flush()方法将输入流和输出流中的缓冲进行刷新，使缓冲区中的元素即时做输入和输出，而不必等缓冲区满
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	private static void readDate() {
		try {
			//实例化输入流
			InputStream in = new FileInputStream(file);
			//读操作
//			byte[] b = new byte[1024];	//直接指定空间浪费空间
			byte[] b = new byte[(int)file.length()];
//			int length = in.read(b);  //所有内容读到字节数组中 
			//当不知道文件大小时，以读取的数据是否为-1作为读完的标志。
			int temp = 0;
			int len = 0;//接收每一个读取进来的数据
			while((temp = in.read()) != -1){
				//如果文件还有内容
				b[len] = (byte) temp;
				len++;
				}
			
			in.close();
			System.out.println("文件内容:"+new String(b)); 
//			System.out.println("文件内容:"+new String(b,0,length)); //节省空间
//			System.out.println("文件内容:"+new String(b));    //浪费空间
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

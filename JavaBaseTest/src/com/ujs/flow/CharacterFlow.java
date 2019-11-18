package com.ujs.flow;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/**
 * 字符流
 * @author SUN
 * 在程序中，一个字符等于两个字节，针对字符操作的类是字符输出流Writer和字符输入流Reader
 * 
 * 使用字节流时，即使流没有关闭，最终也可以输出到文件；
 * 使用字符流时，所有的内容保存在缓冲区，流关闭时 会强制性的将缓冲区内容写到文件中，
 * 如果没有关闭流，文件中就不会有内容输出。
 */
public class CharacterFlow {
	public static File file = new File(ByteFlow.FILEDIR+ByteFlow.FILE);
	public static void main(String[] args) {
		//创建文件
		ByteFlow.createFile(ByteFlow.FILEDIR,ByteFlow.FILE);
		//写数据
		wirteDate();
		//读数据
		readDate();
	}
	
	private static void wirteDate() {
		//实例化输出流对象
		try {
			Writer out = new FileWriter(file,true);
			//写操作
			String str = "\r\n字符流输入";
			out.write(str);
			out.flush();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void readDate() {
		//实例化输入流
		try {
			Reader in = new FileReader(file);
			//读操作
			char[] c = new char[(int)file.length()];
//			int len = in.read(c);
			int temp = 0;
			int len = 0;//接收每一个读取进来的数据
			while((temp = in.read()) != -1){
			//如果文件还有内容
			c[len] = (char) temp;
			len++;
			}
			//关闭流
			in.close();
			System.out.println("文件内容："+new String(c));
//			System.out.println("文件内容："+new String(c,0,len));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

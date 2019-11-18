package com.ujs.flow;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFile {
	public static File file = new File(ByteFlow.FILEDIR+ByteFlow.FILE);
	public static File cpFile = new File(ByteFlow.FILEDIR+File.separator+"cptest.txt");
	public static void main(String[] args) {
		ByteFlow.createFile(ByteFlow.FILEDIR, ByteFlow.FILE);
		ByteFlow.createFile(ByteFlow.FILEDIR, File.separator+"cptest.txt");
		copyFile();
	} 
	
	private static void copyFile() {
		//实例化输入流(读)，输出流（写）
		try {
			InputStream in = new FileInputStream(file);
			OutputStream out = new FileOutputStream(cpFile);
			if( in!=null && out != null) {
			int temp = 0;
			while ((temp = in.read())!=-1) {
				out.write(temp);
			}
			}
			System.out.println("copy完成！");
			in.close();
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

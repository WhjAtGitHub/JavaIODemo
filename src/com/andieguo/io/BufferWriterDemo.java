package com.andieguo.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BufferWriterDemo {

	public static void main(String[] args){
		addNumber();
	}
	
	/**
	 * ��ÿһ��ǰ���Number+��.��
	 */
	private static void addNumber(){
		File file1 = new File("D:\\Test.java");
		File file2 = new File("D:\\Test2.java");
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(file1),"GBK"));
			BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file2),"GBK"));
			String line = null;
			int count = 0;
			while((line = in.readLine()) != null){
				System.out.println(line);
				count ++;
				out.write(count+"."+line);
				out.newLine();
			}
			out.close();
			in.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	/**
	 * ɾ��ÿһ��ǰ��Number+��.��
	 */
	@SuppressWarnings("unused")
	private static void delNumber(){
		File file1 = new File("D:\\Test.java");
		File file2 = new File("D:\\Test5.java");
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(file1),"UTF-8"));
			BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file2),"UTF-8"));
			String line = null;
			int count = 0;
			while((line = in.readLine()) != null){
				count ++ ;
				if(line.indexOf(".") != -1){
					line = line.replace(count+".", "");//��count+"."�滻Ϊ�ո�
					out.write(line);
					out.newLine();
				}
			}
			out.close();
			in.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}

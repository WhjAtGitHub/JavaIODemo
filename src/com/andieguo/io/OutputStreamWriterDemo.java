package com.andieguo.io;

import java.io.*;
/**
 * 
 * @author Administrator
 *
 */
public class OutputStreamWriterDemo {

	public static void main(String[] args){
		File file = new File("D:\\Test.java");
		try {
			// д�ַ���ת���ֽ�����ʹ��GBK�������д��
			FileOutputStream outputStream = new FileOutputStream(file);
			OutputStreamWriter writer = new OutputStreamWriter(outputStream,"GBk");
			writer.write("�����й���");
			writer.close();
			
			// ��ȡ�ֽ�ת�����ַ���ʹ��GBK������ж���
			FileInputStream inputStream = new FileInputStream(file);
			InputStreamReader reader = new InputStreamReader(inputStream,"GBk");
			StringBuffer buffer = new StringBuffer();
			char[] cbuf = new char[64];
			int count = 0;
			while((count = reader.read(cbuf))!=-1){
				buffer.append(cbuf,0,count);
				System.out.println(buffer);
			}
			reader.close();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
		
	}
}

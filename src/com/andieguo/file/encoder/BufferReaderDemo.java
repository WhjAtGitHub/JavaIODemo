package com.andieguo.file.encoder;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

public class BufferReaderDemo {

	public static void main(String[] args){
		read2();
	}
	/**
	 * ʹ��BufferedReader���ַ�����ȡ�ļ����ļ��������ȡ���벻һ��ʱ���������
	 */
	@SuppressWarnings("unused")
	private static void read1() {
		File file = new File("D:\\Test.java");//��Test.javaʹ��UTF-8���룬��ʹ��GBK������ж�ȡ��ʱ���������룻
		try {
			BufferedReader in = new BufferedReader(new FileReader(file));//ʹ�ñ��ػ����е�Ĭ���ַ��������������Ļ����н�ʹ�� GBK����
			String line = null;
			while((line = in.readLine()) != null){
				System.out.println(line);
			}
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * InputStreamReader���ֽں��ַ�����ת��,ָ��ʹ�á�GBK�����뷽ʽ��ȡ�ļ���
	 */
	private static void read2() {
		File file = new File("D:\\Test.java");//��Test.javaʹ��UTF-8���룬��ʹ��GBK������ж�ȡ��ʱ���������룻
		try { 
			//ΪʲôҪ��FileInputStream������һ�η�װ��Ϊ��ʹ��InputStreamReader���ֽں��ַ�����ת����
			//ΪʲôҪ��InputStreamReader������һ�η�װ��Ϊ��ʹ��BufferedReader��readline������
			BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(file),"GBK"));//ʹ�ñ��ػ����е�Ĭ���ַ��������������Ļ����н�ʹ�� GBK����
			String line = null;
			while((line = in.readLine()) != null){
				System.out.println(line);
			}
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

package com.andieguo.io;

import java.io.*;

public class FileInputStreamDemo {

	public static void main(String[] args){
//		rename();
		read();
	}
	/**
	 * ʹ��FileInputStream��ȡ�ı��ļ�����
	 */
	private static void read() {
		File src = new File("README.md");
		try {
			InputStream in = new FileInputStream(src);
			int len = 0;
			byte[] b = new byte[1024];
			StringBuffer buffer = new StringBuffer();
			while((len = in.read(b)) != -1){//������in.read();in.read(b)�÷����ǽ���ȡ�����ֽ���䵽�ֽ�����b�С�
				//���ֽ�����ת��Ϊ�ַ���;
				String str = new String(b,0,len,"UTF-8");//���ֽ�����ת��Ϊ�ַ���Ĭ��ʹ��GBK���룻�������ȡ���ļ�ʹ�õ��Ƿ�GBK���룬����Ĭ�ϵ�GBK����ת�������������롣
				buffer.append(str);
				System.out.println(buffer.toString());
			}
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * ʹ��FileInputStream��FileOutputStream�������ݵĶ�ȡ��д�룻
	 */
	private static void rename() {
		File src = new File("IO.jpg");
		File dst = new File("IO_2.jpg");
		try {
			InputStream in = new FileInputStream(src);
			OutputStream out = new FileOutputStream(dst);
			int len = 0;
			byte[] b = new byte[1024];
			while((len = in.read(b)) != -1){//������in.read();in.read(b)�÷����ǽ���ȡ�����ֽ���䵽�ֽ�����b�С�
				out.write(b,0,len);//������out.write(b);out.write(b,0,len)�÷����ǽ��ֽ�����b��0-len���ȵ��ֽ�д�뵽�������
			}
			out.close();
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * �Ƿ�����淶��ֱ�ӹر�������finally�йر�����ʲô��ͬ��
	 */
	private static void rename2() {
		File src = new File("IO.jpg");
		File dst = new File("IO_2.jpg");
		InputStream in = null;
		OutputStream out = null;
		try {
			in = new FileInputStream(src);
			out = new FileOutputStream(dst);
			int len = 0;
			byte[] b = new byte[1024];
			while((len = in.read(b)) != -1){//������in.read();in.read(b)�÷����ǽ���ȡ�����ֽ���䵽�ֽ�����b�С�
				out.write(b,0,len);//������out.write(b);out.write(b,0,len)�÷����ǽ��ֽ�����b��0-len���ȵ��ֽ�д�뵽�������
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(out != null){
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(in != null){
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

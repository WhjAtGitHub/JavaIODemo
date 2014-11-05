package com.andieguo.io;
import java.io.*;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
public class GZIPInputStreamDemo {

	public static void main(String[] args) {
		readZipFile();
//		writeZipFile();
	}
	/**
	 * ͨ��InputStream��������ȡREADME.md�ļ������ݣ�ͨ��GZIPOutputStream����ȡ�����ֽ�д�뵽README.zip
	 */
	private static void writeZipFile(){
		File src = new File("README.md");
		File dst = new File("README.zip");
		try{
			InputStream in = new FileInputStream(src);
			GZIPOutputStream gzipOut = new GZIPOutputStream(new FileOutputStream(dst));
			int len = 0;
			byte[] b = new byte[1024];
			while((len = in.read(b)) != -1){
				gzipOut.write(b, 0, len);
			}
			gzipOut.close();
			in.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	/**
	 * ͨ��GZIPInputStream��������ȡREADME.zipѹ���ļ��ڵ����ݡ�
	 */
	private static void readZipFile() {
		File src = new File("README.zip");
		try{
			GZIPInputStream gzipIn = new GZIPInputStream(new FileInputStream(src));
			int len = 0;
			byte[] b = new byte[1024];
			StringBuffer buffer = new StringBuffer("");
			while((len = gzipIn.read(b)) != -1){
				String str = new String(b,0,len,"UTF-8");
				buffer.append(str);
			}
			System.out.println(buffer.toString());
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}

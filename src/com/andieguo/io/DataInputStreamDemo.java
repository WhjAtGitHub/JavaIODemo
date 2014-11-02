package com.andieguo.io;

import java.io.*;
public class DataInputStreamDemo {
	
	public static void main(String[] args){
		File src = new File("DATA.txt");
		try{
			DataInputStream in = new DataInputStream(new FileInputStream(src));
			DataOutputStream out = new DataOutputStream(new FileOutputStream(src));
			out.writeInt(100);//int��
			out.writeDouble(999.9999);//double��
			out.writeBoolean(true);//boolean��
			out.writeUTF("HELLO,WORLD��");//UTF-8������ַ���
			System.out.println(in.readInt());
			System.out.println(in.readDouble());
			System.out.println(in.readBoolean());
			System.out.println(in.readUTF());
			out.flush();
			out.close();
			in.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}

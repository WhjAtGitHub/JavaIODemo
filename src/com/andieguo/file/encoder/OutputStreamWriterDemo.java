package com.andieguo.file.encoder;

import java.io.*;
/**
 * 
1.IO���Ǹ�ʲô�ģ�

     IO��ָ ������������������������豸�ϵ����ݡ�������豸ָӲ�̣��ڴ棬����¼�룬���紫��ȡ�
     
2.IO���ķ��ࣿ

     �����������������֣��ֽ������ַ���

     �����ķ������֣�����������������

     PS:��ѧ����ʱ�����ֺ����׸㲻��ʲôʱ������������ʲôʱ���������������˵������Ҫ�����ݵ�ʱ����Ҫʹ��������������Ҫд���ݵ�ʱ����Ҫʹ�������������ǰ����ô�����:������д������Ҫ���Ļ�������������Ҫд�Ļ������������������������4���֣������ͼ��������ˡ�

3.ʲôʱ��ʹ���ֽ�����ʲôʱ��ʹ���ַ�����

    ������Ҫ֪�����ǣ��κ����ݴ���Ӳ����ʱ�������Զ����Ƶ���ʽ�洢�ġ���ͨ��ʹ���ֽ��������Զ�ȡ�����ļ����ֽ���һ�ζ�ȡһ���ֽڣ����ַ���ʹ�����ֽ�������һ�����߶���ֽ�ʱ��ȥ����ָ���ı�������ض�Ӧ�ı��롣�����ַ���ֻ�ܴ����ı��ַ����ݣ����ֽ������Դ���������͵����ݣ�����ͼƬ����Ƶ����Ƶ�ļ��ȡ���ˣ�ֻҪ�Ǵ��ı����ݴ������ȿ���ʹ���ַ��������������ʹ���ֽ�����

4.IO����Ĺ�ϵ(�о�������һ����)

http://www.ibm.com/developerworks/cn/java/j-lo-chinesecoding/
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

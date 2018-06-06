package com.wpx.demo15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

/**
 *  Properties�������ļ��ࣩ: ��Ҫ�������������ļ����ȡ�����ļ�����Ϣ��
	PropertiesҪע���ϸ�ڣ�
	1. ��������ļ�����Ϣһ��ʹ�������ģ���ô��ʹ��store�������������ļ���ʱ��ֻ��ʹ���ַ�����������ʹ���ֽ������������ļ��Ļ���
	Ĭ��ʹ�õ���iso8859-1�����б���洢����ʱ���������롣
	2. ���Properties�е����ݷ����˱仯��һ��Ҫ����ʹ��Properties���������ļ������������ļ���Ϣ���ᷢ���仯��
	
	
 * @author wangpx
 */
public class Demo05 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		readProperties();
	}
	//�½������ļ�
	public static void writeProperties() throws FileNotFoundException, IOException {
		//����Properties����
		Properties p=new Properties();
		p.setProperty("key1", "value1");
		p.setProperty("key2", "value2");
		p.setProperty("key3", "value3");
		
		p.store(new FileOutputStream(new File("D:/demo05")), "about properties");
	}
	//��ȡ�����ļ���Ϣ 
	public static void readProperties() throws FileNotFoundException, IOException {
		//����Properties����
		Properties properties = new Properties();
		//���������ļ���Ϣ��Properties��
		properties.load(new FileReader("D:/demo05.properties"));
		//����
		Set<Entry<Object, Object>> entrys = properties.entrySet();
		for(Entry<Object, Object> entry  :entrys){
			System.out.println("����"+ entry.getKey() +" ֵ��"+ entry.getValue());
		}
		//�޸�wpx
		//���޸ĺ��Properties������һ�������ļ�
		properties.setProperty("key1", "value123");
		properties.store(new FileWriter("D:/demo05.properties"), "");
	}
	
}

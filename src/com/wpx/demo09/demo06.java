package com.wpx.demo09;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * ������ Date 
 
	
	Calendar
	 
	 
	���ڸ�ʽ����    SimpleDateFormat
 * @author wangpx
 */
public class demo06 {

	public static void main(String[] args) throws ParseException {
		/*Date date = new Date(); // ��ȡ��ǰ��ϵͳʱ��		
		Calendar calendar = Calendar.getInstance(); //��ȡ��ǰ��ϵͳʱ�䡣
		System.out.println("�꣺"+ calendar.get(Calendar.YEAR));
		System.out.println("�£�"+ (calendar.get(Calendar.MONTH)+1));
		System.out.println("�գ�"+ calendar.get(Calendar.DATE));
		System.out.println("ʱ��"+ calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println("�֣�"+ calendar.get(Calendar.MINUTE));
		System.out.println("�룺"+ calendar.get(Calendar.SECOND));
		*/
		/**
		 * 
		 *  ���ڸ�ʽ����    SimpleDateFormat 
		 *  		����1�� ���԰�����ת��תָ����ʽ���ַ���     format()
		 *  		����2�� ���԰�һ�� �ַ�ת���ɶ�Ӧ�����ڡ�    parse()   ����
		 */
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM��dd��    HHʱmm��ss��");
		String format = sdf.format(d);
		System.out.println(format);
		
		Date parse = sdf.parse(format);
		System.out.println(parse);
	}
}

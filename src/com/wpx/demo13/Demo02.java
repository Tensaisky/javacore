package com.wpx.demo13;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 	������
		keySet() 
		values() 
		entrySet() 

 * @author wangpx
 */
public class demo02 {

	public static void main(String[] args) {
	
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(1, "map1");
		hashMap.put(2, "map2");
		hashMap.put(3, "map3");
		
		//map�����б�����ʽһ�� ʹ��keySet�������б���       ȱ�㣺 keySet����ֻ�Ƿ��������еļ���û��ֵ��
		Set<Integer> keySet = hashMap.keySet();
		Iterator<Integer> iterator = keySet.iterator();
		while(iterator.hasNext()) {
			//System.out.println(iterator.next());
			System.out.println(hashMap.get(iterator.next()));
		}	
		
		//map���ϵı�����ʽ���� ʹ��values�������� ������    ȱ�㣺 values����ֻ�ܷ������� ��ֵ��û�м���
		Collection<String> values = hashMap.values();
		Iterator<String> iterator2 = values.iterator();
			while(iterator2.hasNext()) {
				System.out.println(iterator2.next());
			}
		//map���ϵı�����ʽ���� entrySet����������
			Set<Entry<Integer, String>> entrySet = hashMap.entrySet();
			Iterator<Entry<Integer, String>> iterator3 = entrySet.iterator();
			while(iterator3.hasNext()) {
				System.out.println(iterator3.next());
			}
	}
	
	
}

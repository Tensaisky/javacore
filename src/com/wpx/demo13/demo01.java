package com.wpx.demo13;

import java.util.HashMap;

/**
 *  ˫�м��ϣ�
-------------| Map  �����ʵ����Map�ӿڵļ����࣬�߱����ص㣺 �洢�����ݶ����Լ�ֵ�Ե���ʽ���ڵģ��������ظ���ֵ�����ظ���
----------------| HashMap 
----------------| TreeMap
----------------| Hashtable 
 
 Map�ӿڵķ�����
 	
 	��ӣ�
 		put(K key, V value) 
 		putAll(Map<? extends K,? extends V> m) 
 	
 	ɾ��
 		remove(Object key) 
 		clear() 

 	��ȡ��
 		get(Object key) 
 		size() 
 	
 	�жϣ�
 		containsKey(Object key) 
 		containsValue(Object value) 
 		isEmpty() 


 * @author wangpx
 */
public class demo01 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(1, "map1");
		hashMap.put(2, "map2");
		hashMap.put(3, "map3");
		//���֮ǰû�д��ڸü�����ô���ص���null�����֮ǰ���Ѿ����ڸü��ˣ���ô�ͷ��ظü�֮ǰ��Ӧ ��ֵ��
		System.out.println(hashMap.put(1, "map11"));
	
		HashMap<Integer, String> map = new HashMap<>();
		map.put(11, "map11");
		hashMap.putAll(map);
		
		System.out.println("remove ..."+hashMap.remove(1));
		System.out.println("map size is  "+hashMap.size());
		System.out.println("exist key 1" +hashMap.containsKey(1));
		System.out.println("exist value map3 "+hashMap.containsValue("map3"));
		System.out.println("is empty  "+hashMap.isEmpty());
		
	}
}

package com.wpx.demo18;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * ��������
 * 
 * @author wangpx
 */
public class ProxyWangpo implements InvocationHandler{

	private PanjinlianDao panjinlianDao;
	
	public ProxyWangpo(PanjinlianDao panjinlianDao) {
		this.panjinlianDao = panjinlianDao;
	}

	public PanjinlianDao createProxy() {
		PanjinlianDao Instance = (PanjinlianDao) Proxy.newProxyInstance(panjinlianDao.getClass().getClassLoader(), panjinlianDao.getClass().getInterfaces(), this);
		return Instance;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		//����ִ��ǰ
		System.out.println("���˽������ͻ�show���...");
		Object object = method.invoke(panjinlianDao, args);
		//����ִ�к�
		System.out.println("������Ǯ....");
		return object;
	}

}

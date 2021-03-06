/**
 * 原型模式用于创建重复的对象
 * 
 * 这种模式是实现了一个原型接口,该接口用于创建当前对象的克隆,
 * 当直接创建对象的代价比较大时,则采用这种模式
 * 
 * 1.实现克隆操作,在Java继承Cloneable,重写clone()
 * 2.原型模式同样用于隔离对象的使用者和具体类型之间的耦合关系,他同样要求这些"易变类"拥有稳定的接口
 * @author wangpx    
 */
package com.wpx.demo25;
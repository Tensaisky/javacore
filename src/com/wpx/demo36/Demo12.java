package com.wpx.demo36;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.Test;

/**
 * Optional�����෽��
 * @author wangpx
 */
public class Demo12 {

	/**
	 * Optional.empty ����һ���յ�Optionalʵ��
	 * Optional.of(value) ����һ��Optionalʵ��
	 * Optional.ofNullable(value) ����һ����Ϊnull��ʵ������Ϊ��ʵ��
	 */
	@Test
	public void test01() {
		Optional<Object> empty = Optional.empty();
		System.out.println(empty);
		Optional<String> of = Optional.of("���");
		System.out.println(of);
		Optional<Optional<String>> ofNullable = Optional.ofNullable(of);
		of=null;
		Optional<Optional<String>> ofNullable2 = Optional.ofNullable(of);
		System.out.println(ofNullable);
		System.out.println(ofNullable2);
	}
	/**
	 * isPresent�Ƿ��������  return value != null;
	 * orElse   return value != null ? value : other;
	 * orElseGet   return value != null ? value : other.get();
	 */			 
	@Test
	public void test02() {
		Optional<List<String>> of = Optional.of(Arrays.asList("1","2","3","4"));
		boolean present = of.isPresent();
		System.out.println(present);
		List<String> orElse = of.orElse(Arrays.asList("2","6"));
		System.out.println(orElse);
		Optional<List<String>> empty = Optional.empty();
		List<String> orElse2 = empty.orElse(Arrays.asList("2","6"));
		System.out.println(orElse2);
		List<String> orElseGet = empty.orElseGet( () -> Arrays.asList("1","2","3") ); 
		System.out.println(orElseGet);
	}
	
	/**
	 * 
	 *  public<U> Optional<U> map(Function<? super T, ? extends U> mapper) {
        Objects.requireNonNull(mapper);
        if (!isPresent())
            return empty();
        else {
        	//Optional��ofNullable������Ϊnull�᷵��һ���յ�Optionalʵ��
        	//return value == null ? empty() : of(value);
            return Optional.ofNullable(mapper.apply(value));
        }
    }
    
      public<U> Optional<U> flatMap(Function<? super T, Optional<U>> mapper) {
        Objects.requireNonNull(mapper);
        if (!isPresent())
            return empty();
        else {
            return Objects.requireNonNull(mapper.apply(value));// ��requireNonNull����Ϊnull,���׳��쳣
        }
    }
	 * 
	 * 
	 * 
	 */
	@Test
	public void test03() {
		Optional<List<Integer>> of = Optional.of(Arrays.asList(1,2,3,4));
		Optional<Integer> map = of.map( (x) -> x.size());
		System.out.println(map);
	}
}

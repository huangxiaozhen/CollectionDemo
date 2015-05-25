package zhen.huang.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import zhen.huang.object.Person;

// 讲解 Set 的一些知识
// 无序性  无序性指的是在内存中存储位置的无序性，并不是随机性，每一次输出的顺序还是一样

// set 中的元素是如何存储的

//当向 set 添加元素时，首先调用此对象所在类的 hashcode 方法， 计算此对象的 hashcode
// 此hashcode 值决定此对象在 set 中的存储位置，若此位置之前没有对象，则此对象直接存储
//在当前的位置 。 若此位置已有对象存储，再比较这两个对象的 equals，如果相同，后一个对象
//不能再添加进去。 如果返回fals，则同时存储

// 我们要求： hashcode 方法 要与 equals 一致，

// 一定要重写 hashCode 与 equals ,并且两个方法的返回值一致

// 关于 hashcode 与 equals 的分析
// What issues should be considered when overriding equals and hashCode in Java?
//http://stackoverflow.com/questions/27581/what-issues-should-be-considered-when-overriding-equals-and-hashcode-in-java

public class SetDemo1
{
	public static void main(String[] args)
	{
		Set set = new HashSet();
		set.add(123);
		set.add(456);
		set.add("AA");
		set.add("BB");
		set.add(null);
		set.add("AA");
		
		//1. set 中不能添加相同的 AA
		System.out.println(set);
		
		Person p1 = new Person("huangzhen", 25);
		System.out.println("p1 hashcode:" + p1.hashCode());
		
		Person p2 = new Person("huangzhen", 25);
		System.out.println("p1 hashcode:" + p2.hashCode());
		
		//2. 如何判断自己写的类的对象能否添加进去 
		//这里面需要重写 equals与hashcode方法
		set.add(p1);
		set.add(p2);
		
		System.out.println(set);
		
		
		//3. linkedhashset 
		
		Set set2 =  new LinkedHashSet();
		
		Iterator iterator = set2.iterator();
		while( iterator.hasNext() )
		{
			System.out.println("^^" + iterator.next());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

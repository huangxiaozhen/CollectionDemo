package zhen.huang.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// 关于 ArrayList 与 LinkedList 的详解可以看下面的英文文章
//http://stackoverflow.com/questions/322715/when-to-use-linkedlist-over-arraylist

// 这里面讲解 List 和 Collection 不同的方法
// 增 add 删 remove 改 set 查 get 插 add(index) 长度size()

public class ListDemo1
{
	public static void main(String[] args)
	{
		List list = new ArrayList();
		list.add(123);
		list.add(456);
		list.add("AA");
		list.add("BB");
		
		//1. add(index,object) 在指定位置增加元素
		list.add(0, 555);
		System.out.println(list);
		
		//2. 在指定位置增加一个集合的元素
		List list2 = new ArrayList();
		list2.add("CC");
		list2.add("DD");
		list.addAll(1, list2);
		System.out.println(list);
		
		//3. 获取某一个位置的元素
		list.get(0);
		System.out.println(list.get(1));
		
		// 4. 移除某一个位置的元素
		Object object = list.remove(0);
		System.out.println(object);
		System.out.println(list);
		
		// 5. set 修改某一个位置的元素
		list.set(0, "EE");
		System.out.println(list);
		
		//6.  indexof 返回某个obejct在list中首次出现的位置
		list.add("DD");
		System.out.println(list);
		System.out.println( list.indexOf( "DD" ) );
		
		//7.  lastindxof 返回某个object在list中最后一次出现的位置
		System.out.println( list.lastIndexOf( "DD" ) );
		
		System.out.println( list.lastIndexOf("QQ") );
		
		//8. sublist 左闭右开的一个集合
		List list3  = list.subList(2, 4);
		System.out.println(list3);
		
		//9. linkedList
		list3 = new LinkedList();
		list3.add(0, "FF");
		System.out.println(list3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

package zhen.huang.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

import zhen.huang.object.Person;

// 存储数据或者对象可以使用数组或者是集合
// 如何使用数组进行存储 Student[] stu = new Student[20]; stu[0] = new Student()
// 使用数组进行存储的弊端 1. 创建的时候长度必须固定  2. 真实的数组里面有多少数据是不可知的

public class CollectionDemo1
{
	public static void main(String[] args)
	{
		Collection collection = new ArrayList();

		// 1. 判断集合中的有多少元素
		System.out.println(collection.size());

		// 2. 向集合中添加元素 add(Object object)
		collection.add(123);
		collection.add("AA");
		collection.add(new Date());
		collection.add("BB");
		System.out.println(collection.size());

		// 3. 向集合中添加另一个集合中的所有的元素
		Collection collection2 = Arrays.asList(1, 2, 3);
		collection.addAll(collection2);
		System.out.println(collection.size());

		// 4. 查看集合元素
		System.out.println(collection);

		// 5. isempty 查看集合元素是否为空
		System.out.println(collection.isEmpty());

		// 6. clear 清空集合中的元素
		collection.clear();
		System.out.println(collection.size());
		System.out.println(collection.isEmpty());

		// 7. contain 判断集合中是否存在某一个对象
		// 注意在判断的时候判断的标准是什么？如果是String Date 等数据类型，已经这些数据类型都已经重写了
		// equals方法，所以在判断的时候是判断某个对象的 值 是否相等
		// 对于自己写的一个 POJO 类，如果需要使用 contain 方法，最好加上 equals 方法
		collection.add(123);
		collection.add("AA");
		collection.add(new Date());
		collection.add(new String("BB"));
		collection.add(new Person("huangzhen", 25));
		System.out.println(collection);

		System.out.println(collection.contains("AA"));
		System.out.println(collection.contains(new String("BB")));
		System.out.println("^^"
				+ collection.contains(new Person("huangzhen", 25)));

		// 8. containAll(Collection coll) 判断一个集合中是否包含另一个集合中所有的元素
		Collection collection3 = new ArrayList();
		collection3.add(123);
		collection3.add("AA");
		System.out.println(collection.containsAll(collection3));

		// 9. retainAll 保留两个集合中相同的元素
		System.out.println(collection.retainAll(collection3));

		// 10. remove 移除某个元素，如果移除成功，返回true，移除失败，返回false
		System.out.println(collection.remove(123));
		System.out.println(collection);
		System.out.println("^^" + collection.remove("CC"));

		// 11. removeAll
		collection.add(123);
		collection.add(new Date());
		collection.add(new String("BB"));
		collection.add(new Person("huangzhen", 25));
		System.out.println(collection.removeAll(collection3));
		System.out.println(collection);

		// 12. equals 判断两个集合中的元素是否完全相等
		Collection collection4 = new ArrayList();
		collection4.add(123);
		collection4.add("AA");
		System.out.println("--" + collection3.equals(collection4));

		// 13. hashcode 求出某个集合的 hashCode值，HashCode的值决定着集合
		// 的存放的位置
		System.out.println(collection3.hashCode());

		// 14. toArray 将集合转换成数组
		Object[] objects = collection.toArray();
		for (int i = 0; i < objects.length; i++)
		{
			System.out.println(objects[i]);
		}

		// 15 iterator 遍历集合中的对象
		// 方法一 不推荐使用
		Iterator iterator = collection4.iterator();
		System.out.println("1" + iterator.next());
		System.out.println("1" + iterator.next());

		// 方法二 不推荐使用
		iterator = collection4.iterator();
		for (int i = 0; i < collection4.size(); i++)
		{
			System.out.println(iterator.next());

		}
		
		//方法三： iterator 有自己的方法判断
		iterator = collection4.iterator();
		while( iterator.hasNext() )
		{
			System.out.println("++" + iterator.next());
		}
		
		//方法四 使用增强 FOR 循环
		for( Object object : collection4 )
		{
			System.out.println("%%" + object);
		}
		
		//15. 数组中使用增加 for 循环
		String[] strings = new String[]{"AA","BB","CC"};
		for(String string : strings)
		{
			System.out.println(string);
		}
		
		

	}
}

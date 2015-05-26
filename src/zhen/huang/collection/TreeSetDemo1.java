package zhen.huang.collection;

import static org.junit.Assert.*;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

import zhen.huang.object.Customer;
import zhen.huang.object.Person;

//TreeSet 1. 向 TreeSet 中添加必须是同一个类的
//2. 相同的元素不能重复添加
//3. 添加进的是有顺序的。 对于 String 包装类 默认是从小到大

// 当向 TreeSet 中添加对象时，要确保这个对象是可以比较的。 对于可以比较，是要执行 java  的 comparable接口
//实现接口的方法。 如果返回 0 ，代表的是当前对象一样，不可以添加进去。

//当向treesset 中添加自定义类型的对象时，有两种排序方法
//1. 自然排序 要求自定义类实现java.lang.comparable,并重写其中的compareTo抽象方法
//   在此方法中，指明按照自定义的类的哪个属性进行排序

//   向 treeset 中添加对象时，根据 compareto 进行属性比较，如果返回 0  ，虽然代表这两个对象的仅仅属性值相同
//   但是程序认为 这两个对象相同，后一个对象不能加入

// compareTo hashcode equals 三者最好保持一致

//2. 定制排序

public class TreeSetDemo1
{
	
	
	// 测试定制排序
	
	@Test
	public void test2()
	{
		//1. 创建一个comparator接口的对象  //这里是一个匿名类，需要补充一下匿名类的知识
		Comparator<Customer> comparator = new Comparator<Customer>()
		{
			// 需要保证 compare 方法 与 hashcode 和 equals 方法保持一致
			@Override
			public int compare(Customer o1, Customer o2)
			{
				int i = o1.getId().compareTo(o2.getId());
				
				if (i == 0)
				{
					return o1.getName().compareTo(o2.getName());
				}
				
				return i;
			}
		};
		
		//2 将此对象做为参数传递到 TreeSet 的构造器中
		TreeSet set = new TreeSet(comparator);
		
		//3. 向 set 中添加在 comparator中涉及的类的对象
		set.add( new Customer("DD", 1002) );
		set.add( new Customer("AA", 1002) );
		set.add( new Customer("CC", 1005) );
		set.add( new Customer("EE", 1007) );
		set.add( new Customer("BB", 1004) );

		
		for( Object object : set )
		{
			System.out.println(object);
		}
		
	}

	@Test
	public void test()
	{
		
		Set set = new TreeSet();
		set.add( new Person("CC", 23)  );
		set.add( new Person("DD", 21)  );
		set.add( new Person("AA", 24)  );
		set.add( new Person("EE", 25)  );
		set.add( new Person("BB", 23)  );
		set.add( new Person("AA", 23)  );
		
		for( Object object : set )
		{
			System.out.println(object);
		}
		
		
	}

}

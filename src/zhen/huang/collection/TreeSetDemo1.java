package zhen.huang.collection;

import static org.junit.Assert.*;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

import zhen.huang.object.Customer;
import zhen.huang.object.Person;

//TreeSet 1. �� TreeSet ����ӱ�����ͬһ�����
//2. ��ͬ��Ԫ�ز����ظ����
//3. ��ӽ�������˳��ġ� ���� String ��װ�� Ĭ���Ǵ�С����

// ���� TreeSet ����Ӷ���ʱ��Ҫȷ����������ǿ��ԱȽϵġ� ���ڿ��ԱȽϣ���Ҫִ�� java  �� comparable�ӿ�
//ʵ�ֽӿڵķ����� ������� 0 ��������ǵ�ǰ����һ������������ӽ�ȥ��

//����treesset ������Զ������͵Ķ���ʱ�����������򷽷�
//1. ��Ȼ���� Ҫ���Զ�����ʵ��java.lang.comparable,����д���е�compareTo���󷽷�
//   �ڴ˷����У�ָ�������Զ��������ĸ����Խ�������

//   �� treeset ����Ӷ���ʱ������ compareto �������ԱȽϣ�������� 0  ����Ȼ��������������Ľ�������ֵ��ͬ
//   ���ǳ�����Ϊ ������������ͬ����һ�������ܼ���

// compareTo hashcode equals ������ñ���һ��

//2. ��������

public class TreeSetDemo1
{
	
	
	// ���Զ�������
	
	@Test
	public void test2()
	{
		//1. ����һ��comparator�ӿڵĶ���  //������һ�������࣬��Ҫ����һ���������֪ʶ
		Comparator<Customer> comparator = new Comparator<Customer>()
		{
			// ��Ҫ��֤ compare ���� �� hashcode �� equals ��������һ��
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
		
		//2 ���˶�����Ϊ�������ݵ� TreeSet �Ĺ�������
		TreeSet set = new TreeSet(comparator);
		
		//3. �� set ������� comparator���漰����Ķ���
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

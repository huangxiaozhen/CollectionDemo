package zhen.huang.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import zhen.huang.object.Person;

// ���� Set ��һЩ֪ʶ
// ������  ������ָ�������ڴ��д洢λ�õ������ԣ�����������ԣ�ÿһ�������˳����һ��

// set �е�Ԫ������δ洢��

//���� set ���Ԫ��ʱ�����ȵ��ô˶���������� hashcode ������ ����˶���� hashcode
// ��hashcode ֵ�����˶����� set �еĴ洢λ�ã�����λ��֮ǰû�ж�����˶���ֱ�Ӵ洢
//�ڵ�ǰ��λ�� �� ����λ�����ж���洢���ٱȽ������������ equals�������ͬ����һ������
//��������ӽ�ȥ�� �������fals����ͬʱ�洢

// ����Ҫ�� hashcode ���� Ҫ�� equals һ�£�

// һ��Ҫ��д hashCode �� equals ,�������������ķ���ֵһ��

// ���� hashcode �� equals �ķ���
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
		
		//1. set �в��������ͬ�� AA
		System.out.println(set);
		
		Person p1 = new Person("huangzhen", 25);
		System.out.println("p1 hashcode:" + p1.hashCode());
		
		Person p2 = new Person("huangzhen", 25);
		System.out.println("p1 hashcode:" + p2.hashCode());
		
		//2. ����ж��Լ�д����Ķ����ܷ���ӽ�ȥ 
		//��������Ҫ��д equals��hashcode����
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

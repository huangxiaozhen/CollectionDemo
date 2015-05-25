package zhen.huang.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// ���� ArrayList �� LinkedList �������Կ������Ӣ������
//http://stackoverflow.com/questions/322715/when-to-use-linkedlist-over-arraylist

// �����潲�� List �� Collection ��ͬ�ķ���
// �� add ɾ remove �� set �� get �� add(index) ����size()

public class ListDemo1
{
	public static void main(String[] args)
	{
		List list = new ArrayList();
		list.add(123);
		list.add(456);
		list.add("AA");
		list.add("BB");
		
		//1. add(index,object) ��ָ��λ������Ԫ��
		list.add(0, 555);
		System.out.println(list);
		
		//2. ��ָ��λ������һ�����ϵ�Ԫ��
		List list2 = new ArrayList();
		list2.add("CC");
		list2.add("DD");
		list.addAll(1, list2);
		System.out.println(list);
		
		//3. ��ȡĳһ��λ�õ�Ԫ��
		list.get(0);
		System.out.println(list.get(1));
		
		// 4. �Ƴ�ĳһ��λ�õ�Ԫ��
		Object object = list.remove(0);
		System.out.println(object);
		System.out.println(list);
		
		// 5. set �޸�ĳһ��λ�õ�Ԫ��
		list.set(0, "EE");
		System.out.println(list);
		
		//6.  indexof ����ĳ��obejct��list���״γ��ֵ�λ��
		list.add("DD");
		System.out.println(list);
		System.out.println( list.indexOf( "DD" ) );
		
		//7.  lastindxof ����ĳ��object��list�����һ�γ��ֵ�λ��
		System.out.println( list.lastIndexOf( "DD" ) );
		
		System.out.println( list.lastIndexOf("QQ") );
		
		//8. sublist ����ҿ���һ������
		List list3  = list.subList(2, 4);
		System.out.println(list3);
		
		//9. linkedList
		list3 = new LinkedList();
		list3.add(0, "FF");
		System.out.println(list3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

package zhen.huang.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

import zhen.huang.object.Person;

// �洢���ݻ��߶������ʹ����������Ǽ���
// ���ʹ��������д洢 Student[] stu = new Student[20]; stu[0] = new Student()
// ʹ��������д洢�ı׶� 1. ������ʱ�򳤶ȱ���̶�  2. ��ʵ�����������ж��������ǲ���֪��

public class CollectionDemo1
{
	public static void main(String[] args)
	{
		Collection collection = new ArrayList();

		// 1. �жϼ����е��ж���Ԫ��
		System.out.println(collection.size());

		// 2. �򼯺������Ԫ�� add(Object object)
		collection.add(123);
		collection.add("AA");
		collection.add(new Date());
		collection.add("BB");
		System.out.println(collection.size());

		// 3. �򼯺��������һ�������е����е�Ԫ��
		Collection collection2 = Arrays.asList(1, 2, 3);
		collection.addAll(collection2);
		System.out.println(collection.size());

		// 4. �鿴����Ԫ��
		System.out.println(collection);

		// 5. isempty �鿴����Ԫ���Ƿ�Ϊ��
		System.out.println(collection.isEmpty());

		// 6. clear ��ռ����е�Ԫ��
		collection.clear();
		System.out.println(collection.size());
		System.out.println(collection.isEmpty());

		// 7. contain �жϼ������Ƿ����ĳһ������
		// ע�����жϵ�ʱ���жϵı�׼��ʲô�������String Date ���������ͣ��Ѿ���Щ�������Ͷ��Ѿ���д��
		// equals�������������жϵ�ʱ�����ж�ĳ������� ֵ �Ƿ����
		// �����Լ�д��һ�� POJO �࣬�����Ҫʹ�� contain ��������ü��� equals ����
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

		// 8. containAll(Collection coll) �ж�һ���������Ƿ������һ�����������е�Ԫ��
		Collection collection3 = new ArrayList();
		collection3.add(123);
		collection3.add("AA");
		System.out.println(collection.containsAll(collection3));

		// 9. retainAll ����������������ͬ��Ԫ��
		System.out.println(collection.retainAll(collection3));

		// 10. remove �Ƴ�ĳ��Ԫ�أ�����Ƴ��ɹ�������true���Ƴ�ʧ�ܣ�����false
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

		// 12. equals �ж����������е�Ԫ���Ƿ���ȫ���
		Collection collection4 = new ArrayList();
		collection4.add(123);
		collection4.add("AA");
		System.out.println("--" + collection3.equals(collection4));

		// 13. hashcode ���ĳ�����ϵ� hashCodeֵ��HashCode��ֵ�����ż���
		// �Ĵ�ŵ�λ��
		System.out.println(collection3.hashCode());

		// 14. toArray ������ת��������
		Object[] objects = collection.toArray();
		for (int i = 0; i < objects.length; i++)
		{
			System.out.println(objects[i]);
		}

		// 15 iterator ���������еĶ���
		// ����һ ���Ƽ�ʹ��
		Iterator iterator = collection4.iterator();
		System.out.println("1" + iterator.next());
		System.out.println("1" + iterator.next());

		// ������ ���Ƽ�ʹ��
		iterator = collection4.iterator();
		for (int i = 0; i < collection4.size(); i++)
		{
			System.out.println(iterator.next());

		}
		
		//�������� iterator ���Լ��ķ����ж�
		iterator = collection4.iterator();
		while( iterator.hasNext() )
		{
			System.out.println("++" + iterator.next());
		}
		

	}
}

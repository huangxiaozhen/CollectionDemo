package zhen.huang.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayToList
{
	public static void main(String[] args)
	{
		String[] strArray = new String[]
		{ "aa", "bb" };

		// ����ת���� List
		List<String> list = new ArrayList<String>(Arrays.asList(strArray));
		Iterator<String> iterator = list.iterator();
		int num = 0;
		while (iterator.hasNext())
		{
			System.out.println("��" + num++ + "����ֵ:" + iterator.next());
		}

		// List ת��������
		list.add("cc");
		String[] strArray2;

		// ��һ���ر�ע��
		/**
		 * strArray2 = list.toArray(new String[0]) ����������д��������һ��
		 *  strArray2 = new String[list.size()]; strArray2 = list.toArray(strArray2);
		 * 
		 */
		
		
		/**
		 * ������ArrayList������toArray()������Դ���룺
		 * 
		 * 
		 */
		
		/*
		public Object[] toArray() 
		{   
			   Object[] result = new Object[size];     
			   System.arraycopy(elementData, 0, result, 0, size);     
			   return result;   
		}   
		
		public Object[] toArray(Object a[]) 
		{     
		if (a.length < size)         
		a = (Object[])java.lang.reflect.Array.newInstance(a.getClass().getComponentType(), size);       System.arraycopy(elementData, 0, a, 0, size);     
		if (a.length > size)         
		a[size] = null;     
		return a;   
		}  */ 
		strArray2 = list.toArray(new String[0]);
		for (String string : strArray2)
		{
			System.out.println("��" + num + "����ֵ:" + string);
		}

	}
}

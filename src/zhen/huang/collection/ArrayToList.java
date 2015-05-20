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

		// 数组转换成 List
		List<String> list = new ArrayList<String>(Arrays.asList(strArray));
		Iterator<String> iterator = list.iterator();
		int num = 0;
		while (iterator.hasNext())
		{
			System.out.println("第" + num++ + "个的值:" + iterator.next());
		}

		// List 转换成数组
		list.add("cc");
		String[] strArray2;

		// 这一行特别注意
		/**
		 * strArray2 = list.toArray(new String[0]) 和下面的两行代码的作用一样
		 *  strArray2 = new String[list.size()]; strArray2 = list.toArray(strArray2);
		 * 
		 */
		
		
		/**
		 * 下面是ArrayList的两个toArray()方法的源代码：
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
			System.out.println("第" + num + "个的值:" + string);
		}

	}
}

package zhen.huang.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// ����Ŀ��Բο���ҳ���� http://www.2cto.com/kf/201204/125820.html

public class ListToArray2
{
	public static void main(String[] args)
	{
		ArrayList<String> list = new ArrayList<String>();

		// list.toArray() �� object ���鲻��ǿ��ת���� String
		// String strings[]=(String [])list.toArray();

		String strings[] = new String[list.size()];
		for (int i = 0, j = list.size(); i < j; i++)
		{
			strings[i] = list.get(i);
		}

		/**
		 * ��������Ľ��ͣ����ǿ��԰����������ɵ��������ģ�ͣ� 
		 * Object objs[]=new Object[10]; String
		 * strs[]=(String[])objs;
		 * 
		 * �����Ӻ͸ղ�������������һ���ġ�
		 * ��������޸�һ��������룬���£� String strs[]=new String[10];
		 * Object objs[]=strs;
		 */

	}
}

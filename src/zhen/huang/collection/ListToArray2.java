package zhen.huang.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// 具体的可以参考网页资料 http://www.2cto.com/kf/201204/125820.html

public class ListToArray2
{
	public static void main(String[] args)
	{
		ArrayList<String> list = new ArrayList<String>();

		// list.toArray() 是 object 数组不能强制转换成 String
		// String strings[]=(String [])list.toArray();

		String strings[] = new String[list.size()];
		for (int i = 0, j = list.size(); i < j; i++)
		{
			strings[i] = list.get(i);
		}

		/**
		 * 根据上面的解释，我们可以把这个问题归纳到下面这个模型： 
		 * Object objs[]=new Object[10]; String
		 * strs[]=(String[])objs;
		 * 
		 * 这样子和刚才上面编译错误是一样的。
		 * 如果我们修改一下这个代码，如下： String strs[]=new String[10];
		 * Object objs[]=strs;
		 */

	}
}

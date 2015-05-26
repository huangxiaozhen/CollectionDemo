package zhen.huang.collection;


//A compound assignment expression of the form E1 op= E2 is equivalent to E1 = (T)((E1) op (E2)),
//where T is the type of E1, except that E1 is evaluated only once.

public class AddOperationDemo
{
	public static void main(String[] args)
	{
		int i =9 ;
		Long l = 8L;
		i += l;
		// i= i+j;
		
		System.out.println(i);
		System.out.println( AddOperationDemo.class.getDeclaredFields().toString() );
	}

}

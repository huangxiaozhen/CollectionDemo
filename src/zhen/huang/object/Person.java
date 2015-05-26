package zhen.huang.object;

public class Person implements Comparable<Person>
{
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age == null)
		{
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (name == null)
		{
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	private String name;

	private Integer age;

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Integer getAge()
	{
		return age;
	}

	public void setAge(Integer age)
	{
		this.age = age;
	}

	public Person(String name, Integer age)
	{
		super();
		this.name = name;
		this.age = age;
	}

	public Person()
	{
		super();
	}

	@Override
	public String toString()
	{
		return "Person [name=" + name + ", age=" + age + "]";
	}

	// 进行同一个对象之间的比较 为什么需要进行同一对象间的比较，因为在 TreeSet 中
	// 加入的时候是要判断元素的位置，元素的位置就是和之前已经存在的元素进行比较，判断
	// 谁大谁小，然后放在准备的位置。 如何进行判断，是要自己定义
	
	// 向 treeset 中添加对象时，根据 compareto 进行属性比较，如果返回 0 ，虽然代表这两个对象的仅仅属性值相同
	// 但是程序认为 这两个对象相同，后一个对象不能加入

	// compareTo hashcode equals 三者最好保持一致
	@Override
	public int compareTo(Person person)
	{
		int temp = this.age.compareTo(person.age);
		if (temp == 0)
		{
			return this.name.compareTo(person.name);
		}
		
		return temp;
		
	}

}

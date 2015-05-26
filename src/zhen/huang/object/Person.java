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

	// ����ͬһ������֮��ıȽ� Ϊʲô��Ҫ����ͬһ�����ıȽϣ���Ϊ�� TreeSet ��
	// �����ʱ����Ҫ�ж�Ԫ�ص�λ�ã�Ԫ�ص�λ�þ��Ǻ�֮ǰ�Ѿ����ڵ�Ԫ�ؽ��бȽϣ��ж�
	// ˭��˭С��Ȼ�����׼����λ�á� ��ν����жϣ���Ҫ�Լ�����
	
	// �� treeset ����Ӷ���ʱ������ compareto �������ԱȽϣ�������� 0 ����Ȼ��������������Ľ�������ֵ��ͬ
	// ���ǳ�����Ϊ ������������ͬ����һ�������ܼ���

	// compareTo hashcode equals ������ñ���һ��
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

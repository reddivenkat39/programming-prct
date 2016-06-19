class generic_book<T>
{

	private T name;
	
	
	public void setname(T newname)
	{
		name = newname;
	}
	
	public T getname()
	{
		return name;
	}
}

class generic_booknumber<T,E> extends generic_book<T>
{
	private E number;
	public void setnumber(E newnumber)
	{
		number = newnumber;
	}
	public E getnumber()
	{
		return number;
	}
}

public class extending_a_generic_class {

	public static void main(String[] args)
	{
		generic_book<String> gb = new generic_book<String>();
		generic_book<String> gb1 = new generic_booknumber<String,Integer>();
		((generic_booknumber<String, Integer>) gb1).setnumber(20);
		gb.setname("JAVA BOOK");
		System.out.println(((generic_booknumber<String,Integer>)gb1).getnumber());
		System.out.println(gb.getname());
	}
}

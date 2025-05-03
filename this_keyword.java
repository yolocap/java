public class this_keyword {
	String myname;
	this_keyword()
	{
		System.out.println("Hello");
	}
	void setname(String myname)
	{
		this.myname = myname;
	}

	public static void main(String[] args) {
		this_keyword ob1 = new this_keyword();
		ob1.setname("Dhanesh");
		System.out.println(ob1.myname);

	}

}
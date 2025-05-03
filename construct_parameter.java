public class construct_parameter {
	int marks;
	String name;
	construct_parameter(int a, String b)
	{
		marks=a;
		name=b;
	}

	public static void main(String[] args) {
		construct_parameter obj1 = new construct_parameter(32, "Dhanesh");
		construct_parameter obj2 = new construct_parameter(42, "Aravind");
		System.out.println(obj2.name);		

	}

}

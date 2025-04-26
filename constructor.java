public class constructor {
	
	int a;
	String names;
	
	constructor(){
		System.out.println("Dhanesh");
	}


	public static void main(String[] args) {
		constructor obj1 = new constructor();
		constructor obj2 = new constructor();
		System.out.println(obj2.a);
		System.out.println(obj1.names);
	}

}

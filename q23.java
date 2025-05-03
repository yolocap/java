class zoo{
	String name;
	int age;
	void makesound() {
		System.out.println("Animals makes sound");
	}
} 
class dog extends zoo{
	String breed;
	void makesound() {
		System.out.println("Dog barks");
	}
	void fetch() {
		System.out.println("Dog is fetching");
	}
} class cat extends zoo {
	String color;
	void makesound() {
		System.out.println("Cat meows");
	}
	void climb() {
		System.out.println("Cat is climbing");
	}
}

public class q23 {
	public static void main(String[] args) {
		dog d = new dog ();
		d.name = "SIMBA";
		d.age = 3;
		d.breed = "Bullmastif";
		d.makesound();
		d.fetch();
		
		cat c1 = new cat();
		c1.name = "TIMMY";
		c1.age = 2;
		c1.color = "Brown";
		c1.makesound();
		c1.climb();
		
		
		
	}

}

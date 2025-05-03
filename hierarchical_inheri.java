
// hierarchical_inheri
class animal{
	void eat() {
		System.out.println("animals can eat");
	}
} class cat extends animal{
	void meow() {
		System.out.println("cat can meow");
	}
} class dog extends animal {
	void bark() {
		System.out.println("dog can bark");
	}
}

public class hierarchical_inheri {
	public static void main (String [] args) {	
		cat c = new cat();
		c.eat();
		c.meow();
		
	}

}

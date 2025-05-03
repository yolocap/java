
// HYBRID_INHERITANCE
class animal{
	void eat() {
		System.out.println("animals can eat");
	}
	// The  class dog and cat extends animal  is used to show hierarchical inheritance
} class dog extends animal {
	void bark() {
		System.out.println("dog can bark");
	}
} class cat extends animal{
	void meow() {
		System.out.println("cat can meow");
	}
	// this class is used to show hybrid inheritance
}class puppy extends dog {
	void weep() {
		System.out.println("puppy can weep");
	}
} 

public class hybrid_inheri {
	public static void main (String [] args) {	
		cat c = new cat();
		puppy p = new puppy();
		c.eat();
		c.meow();
		p.weep();
		
	}

}

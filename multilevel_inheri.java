
// Multilevel inheritance
class animal{
	void eat() {
		System.out.println("animals can eat");
	}
} class dog extends animal {
	void bark() {
		System.out.println("dog can bark");
	}
} class puppy extends dog{
	void weep() {
		System.out.println("puppy can weep");
	}
}

public class multilevel_inheri {
	public static void main (String [] args) {
		puppy p = new puppy();
		p.eat();
		p.bark();
		p.weep();
		
	}

}

package java4;

class Animal{
	
	void sound() {
		
	}
	
}

class Dog extends Animal{
	
	//¹«È¿È­½ÃÅ°´Ù.
	void sound() {
		System.out.println("¸Û¸Û");
	}
}

class Cat extends Animal{
	//¹«È¿È­½ÃÅ°´Ù.
	void sound() {
		System.out.println("¾ß¿Ë");
	}
}

class Bird extends Animal {
	//¹«È¿È­½ÃÅ°´Ù.
	void sound() {
		System.out.println("Â±Â±");
	}
}

 class Tiger extends Animal{
	 void sound() {
		 System.out.println("¾îÈï");
	 }
 }
 
 class Cow extends Animal{
	 void sound() {
		 System.out.println("À½¸Þ");
	 }
 }
 
public class AnimalEx01 {
	
	//Animal b = new Bird();
	static void play(Animal b) {
		b.sound();
	}
	public static void main(String[] args) {
		Bird b1= new Bird();
		play(b1);
		
		Cat c1= new Cat();
		play(c1);
		
		play(new Dog());
		
		play(new Tiger());
	}

}

package java4;

class Animal{
	
	void sound() {
		
	}
	
}

class Dog extends Animal{
	
	//��ȿȭ��Ű��.
	void sound() {
		System.out.println("�۸�");
	}
}

class Cat extends Animal{
	//��ȿȭ��Ű��.
	void sound() {
		System.out.println("�߿�");
	}
}

class Bird extends Animal {
	//��ȿȭ��Ű��.
	void sound() {
		System.out.println("±±");
	}
}

 class Tiger extends Animal{
	 void sound() {
		 System.out.println("����");
	 }
 }
 
 class Cow extends Animal{
	 void sound() {
		 System.out.println("����");
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

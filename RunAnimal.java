import java.util.Scanner;
public class RunAnimal {
	
	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);

	
	System.out.println("Choose an Animal, Press B for Bird, C for Cat, or D for Dog");
	String press = SC.nextLine();
	
	if(press.equalsIgnoreCase("B")) {
		Bird bd = new Bird();
		bd.eat();
		bd.sleep();
		bd.makeSound();
	}
	else if(press.equalsIgnoreCase("C")) {
		Cat cat = new Cat();
		cat.eat();
		cat.sleep();
		cat.makeSound();
	}
	else if(press.equalsIgnoreCase("D")) {
		Dog dg = new Dog();
		dg.eat();
		dg.sleep();
		dg.makeSound();
	}
	else{
		System.out.print("Try again");
	}
	
	}
    
}
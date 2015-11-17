package observer;

public class Main {
	public static void main(String[] args) {
		Observer person = new Person();
		Observer mouse = new Mouse();
		Cat cat = new Cat();
		cat.registerObserver(person);
		cat.registerObserver(mouse);
		cat.call();
		System.out.println("~~");
		cat.sleep();
	}
}
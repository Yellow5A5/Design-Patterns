package abstractFactory;

public class MathAStudent extends Student {

	@Override
	public void myClass() {
		System.out.println("From Class B.");
	}

	@Override
	public void myMajor() {
		System.out.println("Math.");
	}

}

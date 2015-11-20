package abstractFactory;

public class CollegeMath extends College{

	@Override
	public Student createAStudent() {
		return new MathAStudent();
	}

	@Override
	public Student createBStudent() {
		return new MathBStudent();
	}
	
}

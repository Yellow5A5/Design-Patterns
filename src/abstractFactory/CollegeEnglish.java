package abstractFactory;

public class CollegeEnglish extends College{

	@Override
	public Student createAStudent() {
		return new EnglishAStudent();
	}

	@Override
	public Student createBStudent() {
		return new EnglishBStudent();
	}
	
}

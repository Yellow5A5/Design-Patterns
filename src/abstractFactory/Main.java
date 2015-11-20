package abstractFactory;

public class Main {

	public static void main(String[] args) {
		College collegeEngl = new CollegeEnglish();
		College collegeMath = new CollegeMath();
		Student englA = collegeEngl.createAStudent();
		Student englB = collegeEngl.createAStudent();
		Student mathA = collegeMath.createAStudent();
		Student mathB = collegeMath.createAStudent();
		englA.myClass();
		englA.myMajor();
		englB.myClass();
		englB.myMajor();
		mathA.myClass();
		mathA.myMajor();
		mathB.myClass();
		mathB.myMajor();
	}

}

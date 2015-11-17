package factoryMethod;

public class Main {
	public static void main(String[] args) {
		//工厂方法
		College mCollege = new ScnuCollege();
		Student physicsStudent = mCollege.teachingStudent(PhysicsStudent.class);
		Student englishStudent = mCollege.teachingStudent(EnglishStudent.class);
		Student softwareStudent = mCollege.teachingStudent(SoftwareStudent.class);
		physicsStudent.myMajor();
		englishStudent.myMajor();
		softwareStudent.myMajor();
		
		//拓展：简单（静态）工厂方法
		Student physicsStudent2 = StaticCollege.teachingStudent(PhysicsStudent.class);
		Student englishStudent2 = StaticCollege.teachingStudent(EnglishStudent.class);
		Student softwareStudent2 = StaticCollege.teachingStudent(SoftwareStudent.class);
		physicsStudent2.myMajor();
		englishStudent2.myMajor();
		softwareStudent2.myMajor();
	}
}

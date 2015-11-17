package factoryMethod;

public class Main {
	public static void main(String[] args) {
		//��������
		College mCollege = new ScnuCollege();
		Student physicsStudent = mCollege.teachingStudent(PhysicsStudent.class);
		Student englishStudent = mCollege.teachingStudent(EnglishStudent.class);
		Student softwareStudent = mCollege.teachingStudent(SoftwareStudent.class);
		physicsStudent.myMajor();
		englishStudent.myMajor();
		softwareStudent.myMajor();
		
		//��չ���򵥣���̬����������
		Student physicsStudent2 = StaticCollege.teachingStudent(PhysicsStudent.class);
		Student englishStudent2 = StaticCollege.teachingStudent(EnglishStudent.class);
		Student softwareStudent2 = StaticCollege.teachingStudent(SoftwareStudent.class);
		physicsStudent2.myMajor();
		englishStudent2.myMajor();
		softwareStudent2.myMajor();
	}
}

package factoryMethod;

public abstract class Student {
	
	//学生都是同一个学校的。
	public void mySchool(){
		System.out.println("From SCNU");
	}
	
	//专业不同，由子类去实现。
	public abstract void myMajor(); 
	
}

package abstractFactory;

public abstract class College {
	//生产A班和B班的学生
	public abstract Student createAStudent();
	public abstract Student createBStudent();
}

package factoryMethod;

public class ScnuCollege extends College{

	@Override
	public <T extends Student> T teachingStudent(Class<T> c) {
		Student student = null;
		try {
			student = (Student) Class.forName(c.getName()).newInstance();
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException e) {
			e.printStackTrace();
		}
		return (T)student;
	}
	
}

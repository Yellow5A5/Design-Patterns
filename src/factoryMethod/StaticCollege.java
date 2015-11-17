package factoryMethod;

public class StaticCollege {
	//通过一个静态方法来创建实例化产品。
	public static <T extends Student> T teachingStudent(Class<T> c) {
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

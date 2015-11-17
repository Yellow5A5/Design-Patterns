package factoryMethod;

public abstract class College {
	public abstract <T extends Student> T teachingStudent(Class<T> c);
}

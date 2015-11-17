package chainOfResponsibility;

//辅导员处理器
public class InstructorHandler extends Handler{

	public InstructorHandler() {
		super(INSTRUCTOR_REQUEST);
	}

	@Override
	protected void response(ISomethingReq request) {
		System.out.println(request.getRequest() + "\n辅导员表示同意。");
	}

}

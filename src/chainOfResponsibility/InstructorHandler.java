package chainOfResponsibility;

//����Ա������
public class InstructorHandler extends Handler{

	public InstructorHandler() {
		super(INSTRUCTOR_REQUEST);
	}

	@Override
	protected void response(ISomethingReq request) {
		System.out.println(request.getRequest() + "\n����Ա��ʾͬ�⡣");
	}

}

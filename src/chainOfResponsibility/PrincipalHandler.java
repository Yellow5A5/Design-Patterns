package chainOfResponsibility;

//У��������
public class PrincipalHandler extends Handler{

	public PrincipalHandler() {
		super(PRINCIPAL_REQUEST);
	}

	@Override
	protected void response(ISomethingReq request) {
		System.out.println(request.getRequest() + "\nУ����ʾͬ�⡣");
	}

}

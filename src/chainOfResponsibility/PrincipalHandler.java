package chainOfResponsibility;

//校长处理器
public class PrincipalHandler extends Handler{

	public PrincipalHandler() {
		super(PRINCIPAL_REQUEST);
	}

	@Override
	protected void response(ISomethingReq request) {
		System.out.println(request.getRequest() + "\n校长表示同意。");
	}

}

package chainOfResponsibility;

//�೤������
public class MonitorHandler extends Handler {

	public MonitorHandler() {
		super(MONITOR_REQUEST);
	}

	@Override
	protected void response(ISomethingReq request) {
		System.out.println(request.getRequest() + "\n�೤��ʾͬ�⡣");
	}

}

package chainOfResponsibility;

//班长处理器
public class MonitorHandler extends Handler {

	public MonitorHandler() {
		super(MONITOR_REQUEST);
	}

	@Override
	protected void response(ISomethingReq request) {
		System.out.println(request.getRequest() + "\n班长表示同意。");
	}

}

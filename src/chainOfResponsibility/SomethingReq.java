package chainOfResponsibility;

//具体事件请求类
public class SomethingReq implements ISomethingReq{
	//定义请求的等级
	private int level = 0;

	private String request = "";
	
	public SomethingReq(int level, String request) {
		this.level = level;
		this.request = request;
	}
	
	@Override
	public int getRequestLevel() {
		return level;
	}

	@Override
	public String getRequest() {
		return this.request;
	}

}

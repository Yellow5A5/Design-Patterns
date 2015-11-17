package chainOfResponsibility;

//抽象处理器类
public abstract class Handler {
	public final static int MONITOR_REQUEST = 1;
	public final static int INSTRUCTOR_REQUEST = 2;
	public final static int PRINCIPAL_REQUEST = 3;
	
	private int level = 0;//等级
	private Handler parentHandler;//比自己高一级的Handler
	
	public Handler(int level) {
		this.level = level;
	}
	
	public final void HandleMessage(ISomethingReq request){
		if(request.getRequestLevel() == this.level){
			this.response(request);
		}else {
			if(null != parentHandler){
				System.out.println("决定不了，上报给我的上级");
				parentHandler.HandleMessage(request);
			}else {
				System.out.println("已到顶级，无人能处理。");
			}
		}
	}
	//设置父处理器
	public void setParentHandler(Handler parentHandler){
		this.parentHandler = parentHandler;
	}
	protected abstract void response(ISomethingReq request);
}

package chainOfResponsibility;

//事件请求接口
public interface ISomethingReq {
	int getRequestLevel();
	String getRequest();
}

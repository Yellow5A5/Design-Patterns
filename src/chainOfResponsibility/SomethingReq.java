package chainOfResponsibility;

//�����¼�������
public class SomethingReq implements ISomethingReq{
	//��������ĵȼ�
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

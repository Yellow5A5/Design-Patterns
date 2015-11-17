package chainOfResponsibility;

//����������
public abstract class Handler {
	public final static int MONITOR_REQUEST = 1;
	public final static int INSTRUCTOR_REQUEST = 2;
	public final static int PRINCIPAL_REQUEST = 3;
	
	private int level = 0;//�ȼ�
	private Handler parentHandler;//���Լ���һ����Handler
	
	public Handler(int level) {
		this.level = level;
	}
	
	public final void HandleMessage(ISomethingReq request){
		if(request.getRequestLevel() == this.level){
			this.response(request);
		}else {
			if(null != parentHandler){
				System.out.println("�������ˣ��ϱ����ҵ��ϼ�");
				parentHandler.HandleMessage(request);
			}else {
				System.out.println("�ѵ������������ܴ���");
			}
		}
	}
	//���ø�������
	public void setParentHandler(Handler parentHandler){
		this.parentHandler = parentHandler;
	}
	protected abstract void response(ISomethingReq request);
}

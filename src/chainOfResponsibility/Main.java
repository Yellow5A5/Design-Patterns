package chainOfResponsibility;

public class Main {
	public static void main(String[] args) {
		MonitorHandler mHandler = new MonitorHandler();//�೤
		InstructorHandler iHandler = new InstructorHandler();//����Ա
		PrincipalHandler pHandler = new PrincipalHandler();//У��
		//����������ϵ
		mHandler.setParentHandler(iHandler);
		iHandler.setParentHandler(pHandler);
		//ʵ�����¼�
		SomethingReq CYReq = new SomethingReq(1, "����μӰ༶���Ρ�");
		SomethingReq QJReq = new SomethingReq(2, "��Ҫ���һ�첻�ϿΡ�");
		SomethingReq JXJReq = new SomethingReq(3, "��Ҫ���������־��ѧ��");
		//���¼��ύ���೤���д���
		mHandler.HandleMessage(CYReq);
		System.out.println("---------------------");
		mHandler.HandleMessage(QJReq);
		System.out.println("---------------------");
		mHandler.HandleMessage(JXJReq);
	}
}

package chainOfResponsibility;

public class Main {
	public static void main(String[] args) {
		MonitorHandler mHandler = new MonitorHandler();//班长
		InstructorHandler iHandler = new InstructorHandler();//辅导员
		PrincipalHandler pHandler = new PrincipalHandler();//校长
		//建立父级关系
		mHandler.setParentHandler(iHandler);
		iHandler.setParentHandler(pHandler);
		//实例化事件
		SomethingReq CYReq = new SomethingReq(1, "我想参加班级春游。");
		SomethingReq QJReq = new SomethingReq(2, "我要请假一天不上课。");
		SomethingReq JXJReq = new SomethingReq(3, "我要申请国家励志奖学金。");
		//将事件提交给班长进行处理
		mHandler.HandleMessage(CYReq);
		System.out.println("---------------------");
		mHandler.HandleMessage(QJReq);
		System.out.println("---------------------");
		mHandler.HandleMessage(JXJReq);
	}
}

package strategy;

public class Main {
	public static void main(String[] args) {
		Student hww = new Student();
		hww.setProfession(new CommunicationsPro());
		hww.setClub(new InformationClub());
		hww.makeIntroduction();
		
		System.out.println("\n____把每个专业或社团当做一种策略算法，面向接口来设置对应的策略____\n");
		
		hww.setProfession(new PhysicsPro());
		hww.setClub(new StudentUnioClub());
		hww.makeIntroduction();
	}
}


class CommunicationsPro implements Profession{
	@Override
	public void learning() {
		System.out.println("通信专业什么都搞。。");
	}
}
class PhysicsPro implements Profession{
	@Override
	public void learning() {
		System.out.println("专心学物理。");
	}
}
class ChemistryPro implements Profession{
	@Override
	public void learning() {
		System.out.println("专心学化学。");
	}
}
class InformationClub implements Club{//信息中心社团
	@Override
	public void playing() {
		System.out.println("玩视频编辑，做海报，组织各种活动。");
	}
}
class DebateClub implements Club{//辩论社团
	@Override
	public void playing() {
		System.out.println("打辩论赛。");
	}
}
class StudentUnioClub implements Club{//校学生会
	@Override
	public void playing() {
		System.out.println("开会。再开会。继续开会。");
	}
}
package strategy;

public class Main {
	public static void main(String[] args) {
		Student hww = new Student();
		hww.setProfession(new CommunicationsPro());
		hww.setClub(new InformationClub());
		hww.makeIntroduction();
		
		System.out.println("\n____��ÿ��רҵ�����ŵ���һ�ֲ����㷨������ӿ������ö�Ӧ�Ĳ���____\n");
		
		hww.setProfession(new PhysicsPro());
		hww.setClub(new StudentUnioClub());
		hww.makeIntroduction();
	}
}


class CommunicationsPro implements Profession{
	@Override
	public void learning() {
		System.out.println("ͨ��רҵʲô���㡣��");
	}
}
class PhysicsPro implements Profession{
	@Override
	public void learning() {
		System.out.println("ר��ѧ����");
	}
}
class ChemistryPro implements Profession{
	@Override
	public void learning() {
		System.out.println("ר��ѧ��ѧ��");
	}
}
class InformationClub implements Club{//��Ϣ��������
	@Override
	public void playing() {
		System.out.println("����Ƶ�༭������������֯���ֻ��");
	}
}
class DebateClub implements Club{//��������
	@Override
	public void playing() {
		System.out.println("���������");
	}
}
class StudentUnioClub implements Club{//Уѧ����
	@Override
	public void playing() {
		System.out.println("���ᡣ�ٿ��ᡣ�������ᡣ");
	}
}
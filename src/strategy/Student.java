package strategy;

public class Student {
	private Profession mProfession;
	private Club mClub;
	
	public void setProfession(Profession mProfession){
		this.mProfession = mProfession;
	}
	public void setClub(Club mClub){
		this.mClub = mClub;
	}
	
	public void makeIntroduction(){
		mProfession.learning();
		mClub.playing();
	}
}
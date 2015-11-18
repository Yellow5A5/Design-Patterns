package bridge;

public abstract class TvBoss {
	Advertisement mAdvertisement;
	
	public void setAdvertisement(Advertisement _advertisement){
		this.mAdvertisement = _advertisement;
	}
	
	public void reportAd(){
		mAdvertisement.AdWords();
		mAdvertisement.AdPerson();;
	}
	
}

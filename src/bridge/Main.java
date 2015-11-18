package bridge;

public class Main {

	public static void main(String[] args) {
		TvBoss boss = new YyTvBoss();
		boss.setAdvertisement(new ColaAd());
		boss.reportAd();
		
		System.out.println("--------------------");
		
		boss.setAdvertisement(new MusicAd());
		boss.reportAd();
	}

}

package bridge;

public class MusicAd implements Advertisement{

	@Override
	public void AdWords() {
		System.out.println("播放音乐广告词。");
	}

	@Override
	public void AdPerson() {
		System.out.println("周杰伦代言");
	}
	
}

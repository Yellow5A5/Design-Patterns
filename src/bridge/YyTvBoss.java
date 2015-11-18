package bridge;

public class YyTvBoss extends TvBoss{

	@Override
	public void reportAd() {
		super.reportAd();
		System.out.println("YY公司，这里增添或修改对象的行为。");
	}
}

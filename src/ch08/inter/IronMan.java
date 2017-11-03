package ch08.inter;

public class IronMan implements Heroable {
	int weaponDamage = 100;

	@Override
	public int fire() {
		System.out.printf("빔 발사: %d만큼의 데미지를 가함%n");
		return this.weaponDamage;
	}

	@Override
	public void changeShape(boolean isHeroMode) {
		if (isHeroMode) {
			System.out.println("장갑 장착");
		} else {
			System.out.println("장갑 제거");
		}
		String status = isHeroMode?"장착":"제거";
		System.out.printf("장갑 %s%n", status);
	}

	@Override
	public void upgrade() {
		int before = weaponDamage;
		weaponDamage+=weaponDamage*0.1;
		System.out.printf("무기 성능 개선: %d --> %d%n",before, weaponDamage);
	}

}
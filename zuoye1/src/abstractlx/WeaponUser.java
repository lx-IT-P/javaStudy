package abstractlx;

/**
 * @className WeaponUser.java
 * @funciton
 * @author liuxiang2
 * @CreatedTime: 2019年8月13日 上午9:30:37
 * @version V1.0
 * @copyright SNBC 2019
 */
public class WeaponUser extends Weapon {
	/* (non-Javadoc)
	 * 使用武器
	 */
	@Override
	public String[] useWeapon() {
		for (int i = 0; i < wuqi.length; i++) {
			System.out.println("您可以使用的武器有:"+super.wuqi[i].toString());
		}
		return super.wuqi;
	}

	/* (non-Javadoc)
	 * 武器的增减
	 */
	@Override
	public int update() {
		a.add(1);//添加武器
		a.add(1);
		a.remove(0);//删除第一个武器
		System.out.println("武器的个数为:"+a.size());
		return a.size();
	}
}

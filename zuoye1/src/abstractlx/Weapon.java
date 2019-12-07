package abstractlx;

import java.util.ArrayList;

/**
 * @className Weapon.java
 * @funciton
 * @author liuxiang2
 * @CreatedTime: 2019年8月13日 上午9:29:43
 * @version V1.0
 * @copyright SNBC 2019
 */
abstract class Weapon {
	String[] wuqi = {"刀","枪","棒"};
	ArrayList<Integer> a = new ArrayList<Integer>();//声明可使用武器的数量
	/* (non-Javadoc)
	 * 武器的增减
	 */
	public abstract int update();
	/* (non-Javadoc)
	 * 使用武器
	 */
	public abstract String[] useWeapon();
	
}

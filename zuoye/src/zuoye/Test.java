package zuoye;

/**
 * @className Test.java
 * @funciton
 * @author liuxiang2
 * @CreatedTime: 2019年8月8日 下午6:37:48
 * @version V1.0
 * @copyright SNBC 2011
 */
public class Test {
	@org.junit.Test
	public void test() {
	Pet pet = new Pet();
	Penguin penguin = new Penguin();
	Dog dog = new Dog();
		pet.print();
		penguin.getName();
		dog.getName();
	}
}

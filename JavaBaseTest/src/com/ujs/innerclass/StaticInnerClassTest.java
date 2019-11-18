package com.ujs.innerclass;
/**
 * 静态内部类
 * @author SUN
 * 我们知道，一个类的静态成员独立于这个类的任何一个对象存在，只要在具有访问权限的地方，
 * 我们就可以通过 类名.静态成员名 的形式来访问这个静态成员，同样的，静态内部类也是作为一个外部类的
 * 静态成员而存在，创建一个类的静态内部类对象不需要依赖其外部类对象。
 */
public class StaticInnerClassTest {
	
	public int outFiled1 = 1;
	protected int outFiled2 = 2;
	int outFiled3 = 3;
	private int outFiled4 = 4;
	static int outFiled5 = 5;
	
	StaticInnerClassTest() {
		
		System.out.println("创建"+this.getClass().getName()+"对象！");
		System.out.println("访问内部类静态成员，不需要new："+ JingTai.innerFiled5);
		//外部类访问内部类，直接new出内部类即可
		JingTai mJingTai = new JingTai();
		System.out.println("其内部类public值为："+mJingTai.innerFiled1);
		System.out.println("其内部类protected值为："+mJingTai.innerFiled2);
		System.out.println("其内部类defalult值为："+mJingTai.innerFiled3);
		System.out.println("其内部类private值为："+mJingTai.innerFiled4);
		
		//在Java中，static可以被类或者对象实例访问，但是建议的是只用类来访问，因为static表示的意义就是说这个成员属于类而不是实例。 
		System.out.println("其内部类静态成员也可以用内部类的引用取出："+JingTai.innerFiled5);
	}
	
	//静态内部类
	public static class JingTai{
		
		public int innerFiled1 = 6;
		protected int innerFiled2 = 7;
		int innerFiled3 = 8;
		private int innerFiled4 = 9;
		static int innerFiled5 = 10;	//静态内部类中可以定义static属性
		
		JingTai() {
			//静态内部类就像外部类的一个静态成员一样，创建其对象无需依赖外部类对象;
			//静态内部类中也无法访问外部类的非静态成员;
			System.out.println("创建"+this.getClass().getName()+"对象！");
			System.out.println("其外部类static值为："+outFiled5);
		}
		
	} 
}

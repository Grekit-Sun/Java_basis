package com.ujs.innerclass;

/**
 * 匿名内部类(在方法中实现)
 * @author SUN
 *	同样的，在匿名内部类中可以使用外部类的属性，但是外部类却不能使用匿名内部类中定义的属性，
 *因为是匿名内部类，因此在外部类中无法获取这个类的类名，也就无法得到属性信息。
 */
public class AnonymousInnerClass {
	
	public int outFiled1 = 1;
	protected int outFiled2 = 2;
	int outFiled3 = 3;
	private int outFiled4 = 4;
	static int outFiled5 = 5;
	
	AnonymousInnerClass() {
		System.out.println("创建 " + this.getClass().getSimpleName() + " 对象");
	}

	public static void main(String[] args) {
		AnonymousInnerClass mAnonymousInnerClass = new AnonymousInnerClass();
		mAnonymousInnerClass.anonymousInnerClassTest();
	}
	
	//自定义接口
	interface OnClickListener {
		void onClick(Object obj);
	}
	
	//在方法中测试使用
	private void anonymousInnerClassTest() {
		OnClickListener onClickListener = new OnClickListener() {
			// 可以在内部类中定义属性，但是只能在当前内部类中使用，
	        // 无法在外部类中使用，因为外部类无法获取当前匿名内部类的类名，
	        // 也就无法创建匿名内部类的对象
			///在JDK8中如果我们在匿名内部类中需要访问局部变量，那么这个局部变量不需要用final修饰符修饰。
			//jdk8之后系统自动加了final；
			/**局部变量的生命周期是当该方法被调用时，该方法中的局部变量在栈中被创建，当方法调用结束时（执行完毕），
			退栈，这些局部变量就会死亡。但是内部类对象是创建在堆中的，其生命周期跟其它类一样，只有当jvm用可达性分析
			法发现这个对象通过GCRoots节点已经不可达，然后进行gc才会死亡。
			**/
			final int innerField = 1;
			
			@Override
			public void onClick(Object obj) {
				
				 //内部类可以直接访问外部类的所有外部类对象中所有访问权限的字段
				 System.out.println("创建"+this.getClass().getName()+"对象！");
				 System.out.println("其外部类public值为："+outFiled1);
				 System.out.println("其外部类protected值为："+outFiled2);
				 System.out.println("其外部类default值为："+outFiled3);
				 System.out.println("其外部类private值为："+outFiled4);
				 System.out.println("其外部类static值为："+outFiled5);
				 
				 System.out.println("其内部类值为："+innerField);
			}
		};
		
		// new Object() 过程会新建一个匿名内部类，继承于 Object 类，
        // 并重写了 toString() 方法
		onClickListener.onClick(new Object() {
			@Override
			public String toString() {
				 return "obj1";
			}
		});
		
	}
	
}

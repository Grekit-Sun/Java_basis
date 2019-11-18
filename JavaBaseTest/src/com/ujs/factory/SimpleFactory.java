package com.ujs.factory;
/**
 * 简单(静态)的工厂类
 * @author SUN
 *
 */
public class SimpleFactory {
	
	public static final int TYPE_LZ = 1;
	public static final int TYPE_PM = 2;
	public static final int TYPE_KR = 3;
	
	// create()方法通常是静态的，所以也称之为静态工厂。
	public static Restaurant creatRes(int type) {
		Restaurant res;
		switch (type) {
			case TYPE_LZ:
				res = new Lanzhou();
				break;
			case TYPE_PM:
				res = new PaoMian();
				break;
			case TYPE_KR:
				res = new KouRou();
				break;
			default:
                throw new RuntimeException("Wrong Restaurant Type: " + type); 
		}
		return res;
	}

}

/**
 * 特点

1 它是一个具体的类，非接口 抽象类。有一个重要的create()方法，利用if或者 switch创建产品并返回。

2 create()方法通常是静态的，所以也称之为静态工厂。
缺点

1 扩展性差（我想增加一种面条，除了新增一个面条产品类，还需要修改工厂类方法）

2 不同的产品需要不同额外参数的时候 不支持。
 */

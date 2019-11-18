package com.ujs.simplefactory;
/**
 * 简单的工厂类
 * @author SUN
 *
 */
public class SimpleFactory {
	
	public static final int TYPE_LZ = 1;
	public static final int TYPE_PM = 2;
	public static final int TYPE_GQ = 3;
	
	public static Restaurant createRes(int type) {
		Restaurant res;
		switch (type) {
			case TYPE_LZ:
				res = new Lanzhou();
				break;
			case TYPE_PM:
				res = new Paomian();
				break;
			case TYPE_GQ:
				res = new Guoqiao();
				break;
			default:
				throw new RuntimeException("wrong restaurant type:"+type);
		} 
		return res;
	}
}

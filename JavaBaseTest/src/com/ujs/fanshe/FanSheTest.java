package com.ujs.fanshe;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.ujs.io.Car;

public class FanSheTest {
	public static void main(String[] args) {
		Car car = fanshe();
		car.introduce();
	}
	
	private static Car fanshe() {
		//①.通过类装载器获取Car对象
				ClassLoader loader = Thread.currentThread().getContextClassLoader();
				Car car = null;
				try {
					Class<?> clazz = loader.loadClass("com.ujs.io.Car");
					//②.获取类的默认构造器对象并通过它实例化Car
					Constructor<?> constructor = clazz.getDeclaredConstructor();
					 car = (Car) constructor.newInstance();
					
					//通过反射方法设置属性
					Method setBrand = clazz.getMethod("setBrand", String.class);
					setBrand.invoke(car, "红旗CA72");
					Method setColor = clazz.getMethod("setColor", String.class);
					setColor.invoke(car, "黑色");
					Method setMaxSpeed = clazz.getMethod("setMaxSpeed", int.class);
					setMaxSpeed.invoke(car, 120);
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch (SecurityException e) {
					e.printStackTrace();
				} catch (NoSuchMethodException e) {
					e.printStackTrace();
				} catch (InstantiationException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				} 
				return car;
	}
}

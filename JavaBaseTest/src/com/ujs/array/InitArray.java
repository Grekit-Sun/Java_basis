package com.ujs.array;
/**
 * 数组的初始化
 * @author SUN
 *
 */
/*注意：数组完成初始化后，内存空间中针对该数组的各个元素就有个一个默认值：

            基本数据类型的整数类型（byte、short、int、long）默认值是0；

            基本数据类型的浮点类型（float、double）默认值是0.0；

            基本数据类型的字符类型（char）默认值是'\u0000'；

            基本数据类型的布尔类型（boolean）默认值是false；

            类型的引用类型（类、数组、接口、String）默认值是null.
*/
public class InitArray {
	public static void main(String[] args) {
		//①.静态初始化：初始化时由程序员显式指定每个数组元素的初始值，有系统决定数组的长度；
		int[] intArr1;
		intArr1 = new int[] {1,2,3,4,5};
		//②.简化的静态初始化
		int[] intArr2 = {1,2,3,4,5};
		//③.动态初始化：初始化时由程序员指定数组的长度，由系统初始化每个数组元素的默认值。
		int[] intArr3 = new int[4];
	}
}

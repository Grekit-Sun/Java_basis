package com.ujs.collectionandmap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * collection:list\Set
 * @author SUN
 *
 */
public class Collection {
	public static void main(String[] args) {
		List<Object> list = new ArrayList<>();
		list.add(1);
		list.add("111");
		Iterator<Object> iterator = list.iterator();
		System.out.println(iterator.hasNext());
		while(iterator.hasNext()) {
		System.out.println(iterator.next());
		}
	}
}

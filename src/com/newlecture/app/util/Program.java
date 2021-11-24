package com.newlecture.app.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(); // 가변
		list.add(3);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(7);
		list.add(7);
		System.out.println(list.get(5));
		System.out.println(list.size());
		System.out.println("─────────────────");
		
		Set<Integer> set = new HashSet<>(); // 중복 제거
		set.add(3);
		set.add(5);
		set.add(6);
		set.add(7);
		set.add(7);
		set.add(7);
		System.out.println(set.add(8));
		System.out.println(set.size());
		System.out.println("─────────────────");
		
		Map<String, Object> map = new HashMap<>(); // 키, 값
		map.put("id", 3);
		map.put("title", "Hello");
		map.put("hit", 12);
		System.out.println(map.get("title"));

	}
}

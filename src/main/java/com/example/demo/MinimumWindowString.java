package com.example.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MinimumWindowString {

	public static String minWindow(String s, String t) {
		Map<Character, Long> tMap = t.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		// No of unique characters
		int required = tMap.size();

		Map<Character, Long> windowMap = new HashMap<>();
		int l = 0;
		int formed = 0;
		// Initialising maximum size
		int mimimumWindowSize = Integer.MAX_VALUE;
		String minWindowSubString = "";
		int r = 0;
		while (r < s.length()) {
			long count = windowMap.getOrDefault(Character.valueOf(s.charAt(r)), 0l);
			windowMap.put(Character.valueOf(s.charAt(r)), count + 1);
			if (windowMap.get(Character.valueOf(s.charAt(r))).equals(tMap.get(Character.valueOf(s.charAt(r))))) {
				formed = formed + 1;
			}
			while (formed == required && l<=r) {
//				System.out.println(s.substring(l, r + 1));
				if(s.substring(l, r + 1).length()<  mimimumWindowSize  ) {
					minWindowSubString = s.substring(l, r + 1);
					mimimumWindowSize = minWindowSubString.length();
				}
				windowMap.put(Character.valueOf(s.charAt(l)),windowMap.get(Character.valueOf(s.charAt(l)))-1);
				if (windowMap.containsKey(Character.valueOf(s.charAt(l))) &&
						tMap.get(Character.valueOf(s.charAt(l)))>windowMap.get(Character.valueOf(s.charAt(l)))) {
					formed = formed - 1;
				}
				l++;
			}
			r++;

		}
		return minWindowSubString;
	}

	public static void main(String[] args) {
		String s = MinimumWindowString.minWindow("a", "a");
		System.out.println(s);
	}

}

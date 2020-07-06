package _02_More_Algorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			if(eggs.get(i).equals("cracked")) {
				return i;
			}
		}
		return -1;
	}
	public static int countPearls(List<Boolean> l) {
		int oysters = 0;
		for (int i = 0; i < l.size(); i++) {
			if(l.get(i)) {
				oysters++;
			}
		}
		return oysters;
	}
	public static double findTallest(List<Double> peeps) {
		double tallest = 0.0;
		for (int i = 0; i < peeps.size(); i++) {
			if(peeps.get(i)>tallest) {
				tallest = peeps.get(i);
			}
		}
		return tallest;
	}
	public static String findLongestWord(List<String> words) {
		String longestWord = "";
		for (int i = 0; i < words.size(); i++) {
			if()
		}
		return longestWord;
	}
}

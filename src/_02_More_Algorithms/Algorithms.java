package _02_More_Algorithms;

import java.util.Arrays;
import java.util.List;

import _00_Sorting_Algorithms.SortingVisualizer;

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
			if(longestWord.length()<words.get(i).length()) {
				longestWord = words.get(i);
			}
		}
		return longestWord;
	}
	public static boolean containsSOS(List<String> message) {
		if(message.contains("... --- ...")) {
			return true;
		}else {
			return false;
		}
	}
	public static List<Double> sortScores(List<Double> list) {
		Double[] array = (Double[]) list.toArray();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length-1; j++) {
				if(array[j+1]<array[j]) {
					double w = array[j+1];
					array[j+1] = array[j];
					array[j] = w;
				}
			}
		}
		list = (List<Double>) Arrays.asList(array);
		return list;
	}
	public static List<String> sortDNA(List<String> list) {
		String[] array = (String[]) list.toArray();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length-1; j++) {
				if(array[j+1].length()<array[j].length()) {
					String w = array[j+1];
					array[j+1] = array[j];
					array[j] = w;
				}
			}
		}
		list = (List<String>) Arrays.asList(array);
		return list;
	}
	public static List<String> sortWords(List<String> list){
		String[] array = (String[]) list.toArray();
		for(int j = 0; j<array.length; j++) {
			for (int i = 0; i < array.length-1; i++) {
				if(array[i].compareTo(array[i+1])>0) {
					String w = array[i+1];
					array[i+1] = array[i];
					array[i] = w;
				}
			}
		}
		list = (List<String>) Arrays.asList(array);
		return list;
	}
}

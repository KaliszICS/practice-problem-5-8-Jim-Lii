/*
Lesson: HashMaps
Author: Jim Li
Date Created: May 7, 2026
Date Last Modified: May 7, 2026
 */

import java.util.HashMap;
public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static HashMap<String, Integer> combineParallelArrays(String[] names, int[] ages){
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < names.length; i++){
			map.put(names[i], ages[i]);
		}
		return map;
	}

	public static void increaseAge(HashMap<String, Integer> map, String name){
		int age = map.get(name);
		map.put(name, age + 1);
	}

	public static void replaceName(HashMap<String, Integer> map, String oldName, String newName){
		int num = map.get(oldName);
		map.remove(oldName);
		map.put(newName, num);
	}

}

package leetcode.java.solution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindAllDuplicates {
	public List<Integer> findDuplicates(int[] nums) {
		List<Integer> res = new ArrayList<>();
		Map<Integer, Integer> dup = new HashMap<>();
		for (int i : nums) {
			if(dup.get(i) != null) {
				res.add(i);
			} else {
				dup.put(i, i);
			}
		}
		return res.stream().distinct().collect(Collectors.toList());
	}
}

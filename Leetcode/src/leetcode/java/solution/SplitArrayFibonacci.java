package leetcode.java.solution;

import java.util.ArrayList;
import java.util.List;

public class SplitArrayFibonacci {
	public List<Integer> splitIntoFibonacci(String S) {
		List<Integer> result = new ArrayList<>();
		hasValidFibonacci(result, 0, S);
		return result;
	}

	private boolean hasValidFibonacci(List<Integer> result, int startIndx, String S) {
		if (startIndx >= S.length() && result.size() >= 3)
			return true;

		long currentNumber = 0;
		for (int i = startIndx; i < S.length(); i++) {
			if (S.charAt(startIndx) == '0' && i > startIndx)
				break;

			currentNumber = currentNumber * 10 + (S.charAt(i) - '0');
			int size = result.size();

			if (currentNumber > Integer.MAX_VALUE)
				break;

			if (size > 2 && result.get(size - 1) + result.get(size - 2) < currentNumber) {
				break;
			}

			if (size <= 1 || result.get(size - 1) + result.get(size - 2) == currentNumber) {
				result.add((int) currentNumber);
				if (hasValidFibonacci(result, i + 1, S))
					return true;
				result.remove(size);
			}
		}

		return false;
	}
}

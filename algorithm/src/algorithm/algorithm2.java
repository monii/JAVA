package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class algorithm2 {

	public static void main(String[] args) {
		int[] inputData = {1,2,3,4,5};
		Solution s = new Solution();
		s.solution(inputData);
	}
}

class Solution {
    public int[] solution(int[] answers) {
      List<Integer> result = new ArrayList<Integer>();
		int[] a = {};
		int[] st1 = new int[] { 1, 2, 3, 4, 5 };
		int[] st2 = new int[] { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] st3 = new int[] { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
		int score1 = 0;
		int score2 = 0;
		int score3 = 0;

		for (int i=0; i < answers.length; i++) {
			int num1 = i%st1.length;
			int num2 = i%st2.length;
			int num3 = i%st3.length;

			if (answers[i] == st1[num1]) {
				score1++;
			}
			if (answers[i] == st2[num2]) {
				score2++;
			}
			if (answers[i] == st3[num3]) {
				score3++;
			}
		}

		int[] scoreArr = {score1,score2,score3};
		Arrays.sort(scoreArr);

		if (scoreArr[2] == score1) {
			result.add(1);
		}
		if (scoreArr[2] == score2) {
			result.add(2);
		}
		if (scoreArr[2] == score3) {
			result.add(3);
		}

		a = new int[result.size()];
		for (int i=0; i <a.length; i++) {
			a[i] = result.get(i);
		}

		return a;
	}
}

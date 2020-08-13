package algorithm;

import java.util.Arrays;

public class Algorithm15 {

	public static void main(String[] args) {
		Solution15 s = new Solution15();
		System.out.println(s.solution("-1 -1"));

	}

}

class Solution15 {
	public String solution(String s) {
		String answer = "";
		String[] sArr = s.split(" ");
		int[] intArr = new int[sArr.length];
		for (int i = 0; i < sArr.length; i++) {
			intArr[i] = Integer.parseInt(sArr[i]);
		}
		Arrays.sort(intArr);

		int min = intArr[0];
		int max = intArr[intArr.length - 1];
		answer = Integer.toString(min) +" "+ Integer.toString(max);

		return answer;
	}
}

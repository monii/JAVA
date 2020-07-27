package algorithm;

import java.util.Arrays;

public class algorithm1 {

	public static void main(String[] args) {
		String[] participant = { "leo", "kiki", "eden" };
		String[] completion = { "eden", "kiki" };
		solution(participant, completion);

	}

	public static String solution(String[] participant, String[] completion) {
		String answer = "";

		Arrays.sort(participant);
		Arrays.sort(completion);

		for (int i = 0; i < completion.length; i++) {
			if (!completion[i].equals(participant[i])) {
				answer = participant[i];
				break;
			}

			if (answer.equals("") && i == completion.length) {
				answer = participant[completion.length + 1];
			}
		}

		return answer;
	}
}
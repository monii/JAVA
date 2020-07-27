package algorithm;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class algorithm7 {

	public static void main(String[] args) {
		String[] arr = {"sun", "bed", "car"};
		int n = 1;
		Solution7 s = new Solution7();
		s.solution(arr, n);
	}

}

class Solution7 {
  public String[] solution(String[] strings, int n) {
    String[] answer = {};
		String[] cArr = new String[strings.length];
		List<String> tempResult = new ArrayList<String>();

		for (int i = 0; i < strings.length; i++) {
			cArr[i] = strings[i].substring(n, n + 1);
		}

		Arrays.sort(cArr);
		Arrays.sort(strings);

		for (int k = 0; k < cArr.length; k++) {
			for (int j = 0; j < strings.length; j++) {
				String[] spell = strings[j].split("");
				if (cArr[k].equals(spell[n]) && !tempResult.contains(strings[j])) {
					tempResult.add(strings[j]);
				}
			}
		}
		answer = new String[tempResult.size()];
		for (int c = 0; c < tempResult.size(); c++) {
			answer[c] = tempResult.get(c);
		}
      return answer;
  }
}

package algorithm;

import java.util.ArrayList;

public class Algorithm14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution14 s = new Solution14();
		System.out.println(s.solution("(())()"));

	}

}

class Solution14 {
	public boolean solution(String s) {
		boolean answer = true;
		String[] sArr = s.split("");
		ArrayList<String> temp = new ArrayList<>();
		for (String string : sArr) {
			temp.add(string);
		}

		while (temp.size() > 1) {
			for (int i = 0; i < temp.size() - 1; i++) {
				if ("()".equals(temp.get(i) + temp.get(i + 1))) {
					temp.remove(i + 1);
					temp.remove(i);
					i = 0;
				}
			}
		}

		if (temp.size() != 0)
			return answer = false;
		return answer;
	}
}

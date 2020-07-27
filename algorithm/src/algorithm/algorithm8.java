package algorithm;

public class algorithm8 {

	public static void main(String[] args) {
		int n = 3;
		Solution8 s = new Solution8();
		s.solution(n);

	}

}

class Solution8 {
	  public String solution(int n) {
			String answer = "";
			String su = "¼ö";
			String bak = "¹Ú";

			for (int i = 0; i < n; i++) {
				if (i == 0 || (i % 2) == 0) {
					answer = answer.concat(su);
				} else {
					answer = answer.concat(bak);
				}
			}
			return answer;
		}
	}

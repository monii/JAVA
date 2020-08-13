package algorithm;

public class Algorithm12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution12 s = new Solution12();
		int[][] land = { { 1, 2, 3, 5 }, { 5, 6, 7, 8 }, { 4, 3, 2, 1 } };
		System.out.println(s.solution(land));
	}

}

class Solution12 {
	int solution(int[][] land) {
		int answer = 0;
		int[] tempArr = new int[land.length];
		int before = 0;

		for (int i = 0; i < land.length; i++) {
			if (i > 0) {
				land[i][before] = 0;
			}
			for (int j = 0; j < 3; j++) {
				if (j == 0) {
					if (land[i][j] > land[i][j + 1]) {
						tempArr[i] = land[i][j];
						before = j;
					} else {
						tempArr[i] = land[i][j + 1];
						before = j + 1;
					}

				} else {
					if (tempArr[i] < land[i][j + 1]) {
						tempArr[i] = land[i][j + 1];
						before = j + 1;
					}
				}
			}
		}
		for (int num : tempArr) {
			answer += num;
		}
		return answer;
	}
}

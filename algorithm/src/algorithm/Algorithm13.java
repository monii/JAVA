package algorithm;

public class Algorithm13 {

	public static void main(String[] args) {
		// AutoTODO -generated method stub
		Solution13 s = new Solution13();
		int[][] board = { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 1, 1 }, { 1, 1, 1 } };
		System.out.println(s.solution(board));

	}

}

class Solution13 {
	public int solution(int[][] board) {
		int answer = 0;
		int count = 0;

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] == 1)
					count++;
			}
		}
		if (count == 0)
			return answer = 0;
		if (count == 1)
			return answer = 1;
		if (count > 1) {
			 double doubleSqrt = Math.sqrt(count);
			 int intSqrt = (int)doubleSqrt;
			 answer = intSqrt * intSqrt;
		}
		return answer;
	}
}

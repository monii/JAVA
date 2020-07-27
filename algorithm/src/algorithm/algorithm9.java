package algorithm;

import java.util.ArrayList;

public class algorithm9 {

	public static void main(String[] args) {
//		int[][] board = { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 3 }, { 0, 2, 5, 0, 1 }, { 4, 2, 4, 4, 2 },
//				{ 3, 5, 1, 3, 1 } };
		int[][] board = { { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0 } };
		int[] moves = { 1, 5, 3, 5, 1, 2, 1, 4 };
		Solution9 s = new Solution9();
		int result = s.solution(board, moves);
		System.out.println(result);
	}
}

class Solution9 {
	public int solution(int[][] board, int[] moves) {
		int answer = 0;
		ArrayList<Integer> bucket = new ArrayList<>();
		int num = 0;
		int item = 0;

		for (int i = 0; i < moves.length; i++) {
			for (int j = 0; j < board.length; j++) {
				item = board[j][moves[i] - 1];
				if (item != 0) {
					board[j][moves[i] - 1] = 0;
					bucket.add(item);
					num++;
					if (num > 0 && bucket.size() > 1) {
						if (bucket.get(num - 1) == bucket.get(num - 2)) {
							bucket.remove(num - 1);
							bucket.remove(num - 2);
							num -= 2;
							answer += 2;
						}
					}
					break;
				}
			}

		}

		return answer;
	}
}

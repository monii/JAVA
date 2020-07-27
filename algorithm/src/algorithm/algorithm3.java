package algorithm;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class algorithm3 {

	public static void main(String[] args) {
		int[] arr = {1, 5, 2, 6, 3, 7, 4};
		int[][] comm = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		Solution3 s = new Solution3();
		s.solution( arr, comm);

	}

}

class Solution3 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
		List<Integer> result = new ArrayList<Integer>();

		for (int i = 0; i < commands.length; i++) {
			int[] comm = commands[i];
			int start = comm[0] - 1;
			int end = comm[1] - 1;
			int num = comm[2];
			int[] temp = new int[(end - start) + 1];

			for (int k = 0; k < array.length; k++) {
				if (start <= end) {
					temp[k] = array[start];
					start++;
				}
			} // inner for
			Arrays.sort(temp);
			result.add(temp[num - 1]);
		} // outer for

		answer = new int[result.size()];
		for (int j = 0; j < result.size(); j++) {
			answer[j] = result.get(j);
		}

		return answer;
    }
}

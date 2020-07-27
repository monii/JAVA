package algorithm;
import java.util.HashMap;
import java.util.Map;

public class algorithm4 {

	public static void main(String[] args) {
		int n = 3;
		int[] lost = {2,4};
		int[] re = {1,3,5};
		Solution4 s = new Solution4();
		s.solution(n, lost, re);

	}

}


class Solution4 {
    public int solution(int n, int[] lost, int[] reserve) {
		int answer = 0;
		int count = 0;
		Map<Integer, Integer> lostMap = new HashMap<Integer, Integer>();
		Map<Integer, Integer> reserveMap = new HashMap<Integer, Integer>();

		for (int i : lost) {
			lostMap.put(i, 0);
		}

		for (int r : reserve) {
			if (lostMap.containsKey(r)) {
				lostMap.remove(r);
			} else {
				reserveMap.put(r, 2);
			}
		}

		for (int i = 0; i < lost.length; i++) {
			int val = lost[i];
			if (lostMap.get(val) == 0) {
				if (reserveMap.containsKey(val)) {
					lostMap.put(val, 1);
					reserveMap.remove(val);
				} else if (reserveMap.containsKey(val - 1)) {
					lostMap.put(val, 1);
					reserveMap.remove(val - 1);
				} else if (reserveMap.containsKey(val + 1)) {
					lostMap.put(val, 1);
					reserveMap.remove(val + 1);
				} else {
					count++;
				}
			} //outer if
		}
		answer = n - count;
		return answer;
	}
}

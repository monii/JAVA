package algorithm;

public class algorithm10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution10 s = new Solution10();
		System.out.println(s.solution("abcde"));
	}

}

class Solution10 {
    public String solution(String s) {
        String answer = "";
       
        String[] arr = new String[s.length()];
        arr = s.split("");
        
		if (s.length()%2 != 0) {
			answer = arr[s.length()/2];
		} else {
			answer = arr[(s.length()/2)-1]+arr[s.length()/2];
		}
        
        return answer;
    }
}
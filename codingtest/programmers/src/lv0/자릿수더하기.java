package lv0;

class 자릿수더하기 {
    public int solution(int n) {
        String str = Integer.toString(n);
        int[]arr = new int[str.length()];
        for(int i=0; i <str.length();i++){
            arr[i]=str.charAt(i) -'0';
        }
        int answer=0;
        for(int i=0;i<arr.length;i++){
            answer=answer+arr[i];
        }
     
        return answer;
    }
}

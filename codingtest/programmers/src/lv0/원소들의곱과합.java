package lv0;

public class 원소들의곱과합 {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum=0;
        int gob=1;
        for(int i=0;i<num_list.length;i++){
                gob = gob*num_list[i];
                 sum = sum+num_list[i];           
        }
        if(gob>(sum*sum)){
            answer=0;
        }else if(gob<(sum*sum)){
        answer=1;
    }
        return answer;
    }
}

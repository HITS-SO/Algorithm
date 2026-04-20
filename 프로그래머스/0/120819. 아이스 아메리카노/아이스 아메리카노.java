class Solution {
    public int[] solution(int money) {
        int[] answer = {0,0};
        int lm=0;
        int cup=0;
        cup=money/5500;
        lm=money%5500;
        answer[0]=cup;
        answer[1]=lm;
        return answer;
    }
}
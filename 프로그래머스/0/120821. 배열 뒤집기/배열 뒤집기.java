class Solution {
    public int[] solution(int[] num_list) {
        int lenList=num_list.length;
        int[] answer = new int[lenList];
        for(int i=0; i<lenList; i++){
            answer[i]=num_list[lenList-i-1];
        }
        return answer;
    }
}
class Solution {
    boolean solution(String s) {
        //답
        boolean answer = true;
        int sLen=s.length();
        //비교를 위한 문자 배열
        char[] arr= new char[sLen];
        //괄호 짝 짖기용 카운트
        int cnt=0;
        // ) 시작 방지용 상태
        int status=0;
        //비교
        for(int i=0; i<sLen; i++){
            arr[i]=s.charAt(i);
            //홀수면 실패
            if(sLen%2!=0){
                answer=false;
                break;
            }
            //(로 시작시 cnt++ status=1
            if(arr[i]=='('){
                cnt++;
                status=1;
            }
            //)로시작시 cnt-- 
            else{
                cnt--;
                if(cnt<0){
                    answer=false;
                    break;
                }
            }
               
            
        }
        if(cnt!=0)
               answer=false;
        
        System.out.println(s);

        return answer;
    }
}
class Solution {
    public String solution(String my_string) {
        int slen=my_string.length();
        char[] arr=new char[slen];
        for(int i=0; i<slen; i++){
            arr[i]=my_string.charAt(slen-i-1);
        }
        String answer = String.valueOf(arr);
        return answer;
    }
}
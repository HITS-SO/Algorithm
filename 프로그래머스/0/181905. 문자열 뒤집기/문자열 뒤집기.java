class Solution {
    public String solution(String my_string, int s, int e) {

        // 문자열을 문자 배열로 변환
        char[] arr = my_string.toCharArray();

        // s부터 e까지 뒤집기
        while (s < e) {

            // 서로 자리 바꾸기
            char temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;

            // 안쪽으로 이동
            s++;
            e--;
        }

        // 문자 배열을 다시 문자열로 변환
        return new String(arr);
    }
}
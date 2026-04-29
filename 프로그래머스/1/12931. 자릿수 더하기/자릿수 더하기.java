import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        int currentN=n;
        int sum=0;
        while(currentN>0){
            sum=sum+currentN%10;
            currentN=currentN/10;
        }
        
        System.out.println(sum);

        return sum;
    }
}
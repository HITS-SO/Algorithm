class Solution {
    public String solution(String s) {
        String[] numS = s.split(" ");

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (String str : numS) {
            int num = Integer.parseInt(str);

            if (num < min) min = num;
            if (num > max) max = num;
        }

        return min + " " + max;
    }
}
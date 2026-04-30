class Solution {
    public int[] solution(String[] park, String[] routes) {
        //좌표 받을 배열 s 만들기
        int[] s = new int[2];
        //시작 좌표 S 찾기
        for(int i = 0; i < park.length; i++){
            for(int j = 0; j < park[i].length(); j++){
                //문자열 이름이 S인거 찾으면 x,y좌표 가져오기
                if(park[i].charAt(j) == 'S'){
                    s[0] = i;
                    s[1] = j;
                }
            }
        }

        for(int i = 0; i < routes.length; i++){
            //루트를 공백 기준으로 분할
            String[] order = routes[i].split(" ");
            //방향 선언
            String goTO = order[0];
            //거리 선언
            int far = Integer.parseInt(order[1]);
            int x = 0, y = 0;
            
            if(goTO.equals("E")) y = 1;
            else if(goTO.equals("W")) y = -1;
            else if(goTO.equals("S")) x = 1;
            else if(goTO.equals("N")) x = -1;
            
            int nx = s[0];
            int ny = s[1];
            boolean move = true;
            for(int j = 0; j < far; j++){
                nx += x;
                ny += y;

                if(nx < 0 || ny < 0 || nx >= park.length || ny >= park[0].length()){
                    move = false;
                    break;
                }
                if(park[nx].charAt(ny) == 'X'){
                    move = false;
                    break;
                }
            }
            if(move){
                s[0] = nx;
                s[1] = ny;
            }
        }
        return s;
    }
}
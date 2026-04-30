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
            //입력 받은 문자에 따라 방향결정
            if(goTO.equals("E")) y = 1;
            else if(goTO.equals("W")) y = -1;
            else if(goTO.equals("S")) x = 1;
            else if(goTO.equals("N")) x = -1;
            int nx = s[0];
            int ny = s[1];
            boolean move = true;
            //far 만큼 시작값의 좌표 변경
            for(int j = 0; j < far; j++){
                nx += x;
                ny += y;
                //이동이 PARK의 범위를 넘어가면 이동 x
                if(nx < 0 || ny < 0 || nx >= park.length || ny >= park[0].length()){
                    move = false;
                    break;
                }
                //장애물 발생시 해당 위치로 이동x
                if(park[nx].charAt(ny) == 'X'){
                    move = false;
                    break;
                }
            }
            //이동에 성공하면 그 값을 반환
            if(move){
                s[0] = nx;
                s[1] = ny;
            }
        }
        return s;
    }
}
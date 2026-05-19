def solution(my_string):
    answer = ''
    alp='a,e,i,o,u'
    for i in range(len(my_string)):
        if not my_string[i] in alp:
            #answer이 자꾸 my string에서 갱신된 값을 유지
            #answer이 기존값을 저장한채로 다음값도 
            answer=answer+my_string[i]
    return answer

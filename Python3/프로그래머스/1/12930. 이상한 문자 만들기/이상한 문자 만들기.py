def solution(s):
    answer=''
    plus=''
    word=s.split(' ')
    for j in word:
        for i in range(len(j)):
            if i%2==0:  
                answer+=j[i].upper()
            else:
                answer+=j[i].lower()
        answer+=' '
        
    return answer[0:-1]
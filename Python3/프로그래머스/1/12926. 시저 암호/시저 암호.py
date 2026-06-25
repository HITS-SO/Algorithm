def solution(s, n):
    answer=''
    asci=0
    for i in range(len(s)):
        if s[i]==' ':
            answer+=' '
        else:
            tmp = ord(s[i])
            if s[i].islower(): # 소문자
                if tmp + n > ord('z'):
                    asci = ord(s[i]) - 26 + n
                else:
                    asci = ord(s[i]) + n
            else: # 대문자
                if tmp + n > ord('Z'):
                    asci = ord(s[i]) - 26 + n
                else:
                    asci = ord(s[i]) + n
            answer += chr(asci)
#             if ord(s[i])+n>ord('z'):
#                 asci=ord(s[i])-26+n
                
#             else:
#                 asci=ord(s[i])+n
#             answer+=chr(asci)
    
    return answer
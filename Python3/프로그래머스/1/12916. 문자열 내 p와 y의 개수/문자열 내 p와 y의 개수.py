def solution(s):
    
    count=0
    comp=s.lower()
    for i in range(len(s)):
        if comp[i]=="p":
            count+=1
        if comp[i]=="y":
            count-=1
    if count != 0:
        return False   
    return True
def solution(citations):
    answer = ''
    sortv=sorted(citations,reverse=True)
    val=0
    for i in range(len(citations)):
        if sortv[i] >= val+1:
            val=val+1
            print(val)
        
            
    return val
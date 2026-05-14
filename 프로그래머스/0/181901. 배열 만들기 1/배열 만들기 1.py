def solution(n, k):
    answer = []
    i=1
    while i<=n:
        if k*i>n:
            break
        answer.append(k*i)
        i+=1
    return answer
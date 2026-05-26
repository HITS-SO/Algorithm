#입력된 수가 짝수라면 2로 나눕니다. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다. 
def solution(num):
    answer = 0
    while True:
        if num==1:
            break
        if answer>500:
            return -1
        if num%2==0:
            num=num/2
            answer=answer+1
        else:
            num=num*3+1
            answer=answer+1
    return answer
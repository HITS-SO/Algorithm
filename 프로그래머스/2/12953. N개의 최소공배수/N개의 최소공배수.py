#최소 공배수를 구하는 함수
def calculate(a,b):
    # i 의 크기가 1보다 크면서 a보단 작되, 두 수를 모두 
    # 나눌수 있는 가장 큰수=최대 공약수
    max=1
    min=0
    for i in range(a):
        if i<2:
            continue
        if a%i==0 and b%i==0:
            max=i
    # 최소 공배수 = 두수의 곱/최소 공배수     
    min=a*b//max
    return min
        
    
def solution(arr):
    answer = 0
    #최소 공배수를 저장하는 변수
    val=1
    #앞에서 부터 두 수씩 나눠서 최소 공배수 구하기
    for i in range(len(arr)):
        val=calculate(val,arr[i])
        answer=val
        
    return answer
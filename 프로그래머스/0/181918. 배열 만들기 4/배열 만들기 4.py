def solution(arr):
    stk = []
    i=0
    while i <len(arr):
        if not stk:
            stk.append(arr[i])
            i=i+1
        elif arr[i]>stk[-1]:
            stk.append(arr[i])
            i=i+1
        elif arr[i]<=stk[-1]:
            stk.pop()
    return stk
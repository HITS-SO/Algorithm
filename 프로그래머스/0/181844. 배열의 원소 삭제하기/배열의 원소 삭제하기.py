def solution(arr, delete_list):
    answer = []
    #arr에 delete리스트가 없는것만 answer로
    for i in range(len(arr)):
        if not arr[i] in delete_list:
            answer.append(arr[i])
    
    return answer
def solution(my_string):
    answer = 0
    
    arr_int = [i for i in range(10)]
    
    for i in range(len(my_string)):
        if my_string[i] in str(arr_int):
            answer=answer+int(my_string[i])
    return answer
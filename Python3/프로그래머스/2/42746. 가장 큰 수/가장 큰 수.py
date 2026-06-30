from functools import cmp_to_key

def solution(numbers):
    numbers = list(map(str, numbers))

    numbers.sort(
        key=cmp_to_key(
            lambda a, b: -1 if a + b > b + a
            else (1 if a + b < b + a else 0)
        )
    )

    return '0' if numbers[0] == '0' else ''.join(numbers)
sample1 = [1, 10, 5, 8, 7, 6, 4, 3, 2, 9]
sample2 = [-2, 45, 0, 11, -9]
sample3 = [54, 26, 93, 17, 77, 31, 44, 55, 20]

def selectionSort(array):
    for i in range(len(array)):
        min = 9999
        for j in range(i, len(array)):
            if min > array[j]:
                min = array[j]
                index = j
        temp = array[i]
        array[i] = array[index]
        array[index] = temp

    return array

    
print("sample1: ", selectionSort(sample1))
print("sample2: ", selectionSort(sample2))
print("sample3: ", selectionSort(sample3))
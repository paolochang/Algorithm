sample1 = [8, 5, 3, 1, 4, 7, 9]
sample2 = [-2, 45, 0, 11, -9]
sample3 = [54, 26, 93, 17, 77, 31, 44, 55, 20]

def insertionSort(array):
    for i in range(1, len(array)):
        selected = array[i]
        j = i - 1

        while j >= 0 and selected < array[j]:
            array[j+1] = array[j]
            j = j - 1

        array[j+1] = selected

    return array

print("sample1: ", insertionSort(sample1))
print("sample2: ", insertionSort(sample2))
print("sample3: ", insertionSort(sample3))
# The idea behind Bubble Sort is very simple, 
# we look at pairs of adjacent elements in an array, 
# one pair at a time, and swap their positions 
# if the first element is larger than the second, 
# or simply move on if it isn't. 

sample1 = [8, 5, 3, 1, 4, 7, 9]
sample2 = [-2, 45, 0, 11, -9]
sample3 = [54, 26, 93, 17, 77, 31, 44, 55, 20]

def bubbleSort(array):
    for i in range(0, len(array)-1):
        for j in range(i + 1, len(array)):
            if array[i] > array[j]:
                temp = array[i]
                array[i] = array[j]
                array[j] = temp
    return array

print("sample1: ", bubbleSort(sample1))
print("sample2: ", bubbleSort(sample2))
print("sample3: ", bubbleSort(sample3))

# The idea behind Bubble Sort is very simple, 
# we look at pairs of adjacent elements in an array, 
# one pair at a time, and swap their positions 
# if the first element is larger than the second, 
# or simply move on if it isn't. 

sample1 = [6, 8, 5, 3, 1, 4, 9, 2, 7]
sample2 = [-2, 45, 0, 11, -9]
sample3 = [54, 26, 93, 17, 77, 31, 44, 55, 20]

def bubbleSort(array):
    for i in range(len(array)):
        for j in range(0, len(array) - i - 1):
            if array[j] > array[j+1]:
                # arr[j], arr[j+1] = arr[j+1], arr[j]
                temp = array[j+1]
                array[j+1] = array[j]
                array[j] = temp
    return array

print("sample1: ", bubbleSort(sample1))
print("sample2: ", bubbleSort(sample2))
print("sample3: ", bubbleSort(sample3))

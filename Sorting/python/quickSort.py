# [40, 35, 27, 50, 75]
# Use recursive

sample1 = [8, 5, 3, 1, 4, 7, 9]
sample2 = [-2, 45, 0, 11, -9]
sample3 = [54, 26, 93, 17, 77, 31, 44, 55, 20]

def quickSort(array):
    if len(array) < 2:
        return array
    else:
        pivot = array[0]
        ls = [number for number in array[1:] if number <= pivot]
        gt = [number for number in array[1:] if number > pivot]
        return quickSort(ls) + [pivot] + quickSort(gt)

print("sample1: ", quickSort(sample1))
print("sample2: ", quickSort(sample2))
print("sample3: ", quickSort(sample3))
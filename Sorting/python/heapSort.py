sample1 = [8, 5, 3, 1, 4, 7, 9]
sample2 = [-2, 45, 0, 11, -9]
sample3 = [54, 26, 93, 17, 77, 31, 44, 55, 20]

def maxHeap(arr, size, i):
    # Find largest among root and children
    largest = i
    lc = 2 * i + 1
    rc = 2 * i + 2

    if lc < size and arr[i] < arr[lc]:
        largest = lc

    if rc < size and arr[largest] < arr[rc]:
        largest = rc

    # If root is not largest, swap with largest and continue heapifying
    if largest != i:
        arr[i], arr[largest] = arr[largest], arr[i]
        maxHeap(arr, size, largest)


def heapSort(arr):
    size = len(arr)

    # Build max heap
    for i in range(size//2, -1, -1):
        maxHeap(arr, size, i)

    for i in range(size-1, 0, -1):
        # Swap
        arr[i], arr[0] = arr[0], arr[i]

        # Heapify root element
        maxHeap(arr, i, 0)
    
    return arr

print("sample1: ", heapSort(sample1))
print("sample2: ", heapSort(sample2))
print("sample3: ", heapSort(sample3))
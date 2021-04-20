sample1 = [8, 5, 3, 1, 4, 7, 9]
sample2 = [-2, 45, 0, 11, -9]
sample3 = [54, 26, 93, 17, 77, 31, 44, 55, 20]

def merge(U, V):
    S = []
    i = j = 0
    while i < len(U) and j < len(V):
        if U[i] < V[j]:
            S.append(U[i])
            i += 1
        else:
            S.append(V[j])
            j += 1

    if i < len(U):
        S += U[i : len(U)]
    else:
        S += V[j : len(V)]
    return S


def mergeSort(S):
    n = len(S)
    if n <= 1:
        return S
    else:
        mid = n // 2
        U = mergeSort(S[0 : mid])
        V = mergeSort(S[mid : n])
        # print("U =", U, end=" ")
        # print("V =", V)
        return merge(U, V)
    


print("sample1: ", mergeSort(sample1))
print("sample2: ", mergeSort(sample2))
print("sample3: ", mergeSort(sample3))
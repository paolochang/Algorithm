from typing import List
from collections import Counter


class Solution:
    # Iteration
    # Time Complexity: BigO(N)
    # Space Complexity: BigO(N)
    def kthDistinctV1(self, arr: List[str], k: int) -> str:
        all_list = []
        dist_list = []
        for item in arr:
            if item not in dist_list and item not in all_list:
                dist_list.append(item)
                all_list.append(item)
            elif item not in dist_list and item in all_list:
                continue
            else:
                dist_list.remove(item)

        if len(dist_list) < k:
            return ""

        return dist_list[k - 1]

    # Iteration
    # Time Complexity: BigO(N)
    # Space Complexity: BigO(N)
    def kthDistinctV2(self, arr: List[str], k: int) -> str:
        dist_list = Counter(arr)

        for str in dist_list:
            if dist_list[str] == 1:
                k -= 1
            if k == 0:
                return str

        return ""

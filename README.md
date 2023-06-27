# UNIBIT-assignment-round



## Code Explanation ##

The provided code performs the following operations:

1.`firstCombinationPairs`: This method finds all pairs in the given array arr whose sum or difference is equal to the target value. It utilizes nested loops to check all possible combinations of pairs. If a pair with the desired sum or difference is found, it is added to a list (pa) and a set (paSet) to avoid duplicates. The pairs are then converted into a 2D array and returned.

2. `mergeSortedArray`: This method takes a 2D array as input and merges all subarrays into a single sorted array. It utilizes nested loops to iterate over each element in the subarrays and adds them to a list (mergedList). The elements in mergedList are then copied into a new integer array (mergedArray), which is sorted using the Arrays.sort() method. Finally, the sorted array is returned.

3. `seComPair`: This method finds all combinations of numbers from a sorted array (nums) that sum up to the target value. It first sorts the array using Arrays.sort(). Then, it calls a recursive backtrack function to generate all valid combinations. The function keeps track of the current combination, and when the target value is reached, the combination is added to a list (combinations). The resulting combinations are converted into a 2D array and returned.

4. `doubleTargetValue`: This method doubles the input target value and returns the result.

5. `backtrack`: This is a recursive backtracking function used by the seComPair method to find combinations. It iterates over the sorted array (nums) and checks for valid combinations by comparing the current element with the target value. It avoids duplicates by skipping duplicate elements. When a valid combination is found, it is added to the list of combinations (combinations). The function backtracks by removing the last added element from the current combination and continues the process until all combinations are found.

6. `main`: This is the entry point of the program. It initializes an array (nums) and a target value. It then performs the following steps:

- Finds the first combination pairs using the firstCombinationPairs method and prints the result.
- Merges the pairs into a single array and sorts it using the mergeSortedArray method, then prints the result.
- Doubles the target value using the doubleTargetValue method and prints the result.
- Finds the second combination pairs using the doubled target value and the seComPair method, then prints the result.




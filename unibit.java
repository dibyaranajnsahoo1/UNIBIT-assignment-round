import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class unibit {

    // Find all pairs in the array whose sum or difference is equal to the target value
    public static int[][] firstCombinationPairs(int[] arr, int target) {
        List<int[]> pa = new ArrayList<>();
        Set<String> paSet = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                // Check if the absolute sum or difference of two numbers is equal to the target
                if (Math.abs(arr[i] + arr[j]) == target) {
                    int[] pair = {arr[i], arr[j]};
                    if (!paSet.contains(Arrays.toString(pair))) {
                        pa.add(pair);
                        paSet.add(Arrays.toString(pair));
                    }
                }
            }
        }

        int[][] res = new int[pa.size()][2];
        for (int i = 0; i < pa.size(); i++) {
            res[i] = pa.get(i);
        }
        return res;
    }

    // Merge all subarrays into a single sorted array
    public static int[] mergeSortedArray(int[][] arr) {
        List<Integer> mergedList = new ArrayList<>();
        for (int[] subArray : arr) {
            for (int num : subArray) {
                mergedList.add(num);
            }
        }

        int[] mergedArray = new int[mergedList.size()];
        for (int i = 0; i < mergedList.size(); i++) {
            mergedArray[i] = mergedList.get(i);
        }

        Arrays.sort(mergedArray);
        return mergedArray;
    }

    

    // Find all combinations of numbers from the sorted array that sum up to the target value
    public static int[][] seComPair(int[] nums, int target) {
        List<int[]> combinations = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums, target, 0, new ArrayList<>(), combinations);

        int[][] result = new int[combinations.size()][];
        for (int i = 0; i < combinations.size(); i++) {
            result[i] = combinations.get(i);
        }
        return result;
    }

    // Double the target value
    public static int doubleTargetValue(int target) {
        return target * 2;
    }

    // Recursive backtracking function to find combinations
    public static void backtrack(int[] nums, int target, int start, List<Integer> currentCombination, List<int[]> combinations) {
        if (target == 0) {
            int[] combinationArr = new int[currentCombination.size()];
            for (int i = 0; i < currentCombination.size(); i++) {
                combinationArr[i] = currentCombination.get(i);
            }
            combinations.add(combinationArr);
            return;
        }

        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }

            int num = nums[i];
            if (num > target) {
                break;
            }

            currentCombination.add(num);
            backtrack(nums, target - num, i + 1, currentCombination, combinations);
            currentCombination.remove(currentCombination.size() - 1);
        }
    }


    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 2, -4, -6, -2, 8};
        int target = 4;


        // Find the first combination pairs
        int[][] sumPairs = firstCombinationPairs(nums, target);
        System.out.println("First Combination for " + target + ": " + Arrays.deepToString(sumPairs));


        // Merge the pairs into a single array and sort it
        int[] mergedArray = mergeSortedArray(sumPairs);
        System.out.println("Merge Into a single Array: " + Arrays.toString(mergedArray));


        // Double the target value
        int doubledTargetValue = doubleTargetValue(target);
        System.out.println(doubledTargetValue);


        // Find the second combination pairs using the doubled target value
        int[][] combinations = seComPair(nums, doubledTargetValue);
        System.out.println("Second Combination for " + doubledTargetValue + ": " + Arrays.deepToString(combinations));
    }
}



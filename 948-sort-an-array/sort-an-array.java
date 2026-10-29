class Solution {
    public int[] sortArray(int[] nums) {
        if (nums.length <= 1) {
            return nums;
        }

        int[] temp = new int[nums.length];
        mergeSort(nums, temp, 0, nums.length - 1);

        return nums;
    }

    public void mergeSort(int[] nums, int[] temp, int low, int high) {
        if (low >= high) {
            return;
        }

        int mid = low + (high - low) / 2;

        // Sort the left half
        mergeSort(nums, temp, low, mid);

        // Sort the right half
        mergeSort(nums, temp, mid + 1, high);

        // Merge both sorted halves
        merge(nums, temp, low, mid, high);
    }

    public void merge(int[] nums, int[] temp, int low, int mid, int high) {
        int i = low;
        int j = mid + 1;
        int k = low;

        // Compare elements from both halves
        while (i <= mid && j <= high) {
            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }

        // Copy remaining elements from the left half
        while (i <= mid) {
            temp[k++] = nums[i++];
        }

        // Copy remaining elements from the right half
        while (j <= high) {
            temp[k++] = nums[j++];
        }

        // Copy the merged elements back into the original array
        for (int p = low; p <= high; p++) {
            nums[p] = temp[p];
        }
    }
}
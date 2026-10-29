class Solution {
    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

    public void quickSort(int[] nums, int low, int high) {
        if (low >= high) {
            return;
        }

        int[] pivotBounds = partition(nums, low, high);

        quickSort(nums, low, pivotBounds[0] - 1);
        quickSort(nums, pivotBounds[1] + 1, high);
    }

    public int[] partition(int[] nums, int low, int high) {
        int pivot = nums[high];

        int lt = low;
        int i = low;
        int gt = high;

        while (i <= gt) {
            if (nums[i] < pivot) {
                swap(nums, lt, i);
                lt++;
                i++;
            } else if (nums[i] > pivot) {
                swap(nums, i, gt);
                gt--;
            } else {
                i++;
            }
        }

        return new int[]{lt, gt};
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
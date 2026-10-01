class SearchInsertPosition {

    public static void main(String[] args) {
        SearchInsertPosition s = new SearchInsertPosition();
        System.out.println(s.searchInsert(new int[]{1, 3, 5, 6}, 5)); // 2
        System.out.println(s.searchInsert(new int[]{1, 3, 5, 6}, 2)); // 1
        System.out.println(s.searchInsert(new int[]{1, 3, 5, 6}, 7)); // 4
    }

    public int searchInsert(int[] nums, int target) {

        int high = nums.length-1;
        int low = 0;
        while (low <= high) {
            int mid = (high + low) /2;
            System.out.print(mid);
            if (nums[mid] == target){
                return mid;
            } else if (nums[mid] > target) {
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        return low;
    }
}
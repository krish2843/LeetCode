int findFirst(int* nums, int n, int target) {
    int left = 0;
    int right = n - 1;
    int ans = -1;

    while(left <= right) {
        int mid = left + (right - left) / 2;

        if(nums[mid] == target) {
            ans = mid;
            right = mid - 1;
        }
        else if(nums[mid] < target)
            left = mid + 1;
        else
            right = mid - 1;
    }

    return ans;
}

int findLast(int* nums, int n, int target) {
    int left = 0;
    int right = n - 1;
    int ans = -1;

    while(left <= right) {
        int mid = left + (right - left) / 2;

        if(nums[mid] == target) {
            ans = mid;
            left = mid + 1;
        }
        else if(nums[mid] < target)
            left = mid + 1;
        else
            right = mid - 1;
    }

    return ans;
}

int* searchRange(int* nums, int numsSize, int target, int* returnSize) {
    int* ans = malloc(2 * sizeof(int));

    ans[0] = findFirst(nums, numsSize, target);
    ans[1] = findLast(nums, numsSize, target);

    *returnSize = 2;
    return ans;
}
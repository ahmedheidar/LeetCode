class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        low, mid, high = 0, 0, len(nums) - 1

        while mid <= high:
            if nums[mid] == 0:
                # Swap nums[low] and nums[mid], then increment both low and mid
                nums[low], nums[mid] = nums[mid], nums[low]
                low += 1
                mid += 1
            elif nums[mid] == 1:
                # No need to swap, just increment mid
                mid += 1
            else:
                # Swap nums[mid] and nums[high], then decrement high
                nums[mid], nums[high] = nums[high], nums[mid]
                high -= 1
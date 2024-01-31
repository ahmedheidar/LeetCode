class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        newPos = 0
        for i in range(len(nums)):
            if nums[i]!=val:
                nums[newPos] = nums[i]
                newPos += 1
        return newPos 
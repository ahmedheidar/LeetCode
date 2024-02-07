class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        numbers = set(nums)
        maxStreak = 0
        for n in numbers:
            if n-1 not in numbers:
                currStreak = 0
                while (n+currStreak) in numbers:
                    currStreak+=1
                maxStreak = max(maxStreak, currStreak)
        return maxStreak
class Solution:
    def carFleet(self, target: int, position: List[int], speed: List[int]) -> int:
        stack = []
        cars = []
        for i in range(len(position)):
            destination = target - position[i]
            time = destination / speed[i]
            cars.append((position[i], time))
        cars.sort(reverse=True)

        for t in cars:
            stack.append(t)
            if len(stack)>=2 and stack[-1][1] <= stack[-2][1]:
                stack.pop()
        return(len(stack))
class MinStack:
    def __init__(self):
        self.stack = []
        self.min = float('inf')  # Set initial min to positive infinity

    def push(self, val):
        if val <= self.min:
            # Store the previous minimum before updating to the new minimum
            self.stack.append(self.min)
            self.min = val
        self.stack.append(val)

    def pop(self):
        if not self.stack:
            return None
        popped = self.stack.pop()
        if popped == self.min:
            # If the popped element was the minimum, update to the previous minimum
            self.min = self.stack.pop()
        return popped

    def top(self):
        if not self.stack:
            return None
        return self.stack[-1]

    def getMin(self):
        if not self.stack:
            return None
        return self.min



# Your MinStack object will be instantiated and called as such:
# obj = MinStack()
# obj.push(val)
# obj.pop()
# param_3 = obj.top()
# param_4 = obj.getMin()
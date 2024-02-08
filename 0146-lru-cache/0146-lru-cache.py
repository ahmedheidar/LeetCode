class LRUCache:

    def __init__(self, capacity: int):
        self.values = {}
        self.used = []
        self.size = 0
        self.capacity = capacity
    def get(self, key: int) -> int:
        if key not in self.values:
            return -1
        else:
            self.used.remove(key)
            self.used.append(key)
            return self.values[key]

    def put(self, key: int, value: int) -> None:
        if key in self.values:
            self.values[key] = value
            self.used.remove(key)
            self.used.append(key)
        else:
            if self.size < self.capacity:
                self.values[key] = value
                self.used.append(key)
                self.size+=1
            else:
                oldKey = self.used.pop(0)
                del self.values[oldKey]
                self.values[key] = value
                self.used.append(key)
            

# Your LRUCache object will be instantiated and called as such:
# obj = LRUCache(capacity)
# param_1 = obj.get(key)
# obj.put(key,value)
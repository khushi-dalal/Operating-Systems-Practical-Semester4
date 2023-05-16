from queue import Queue
def pageFaults(pages, n, capacity):    
    s = set()
    indexes = Queue()
    page_faults = 0
    for i in range(n):
        if (pages[i] not in s):
            if (len(s) < capacity):
                    s.add(pages[i])
                    page_faults += 1
                    indexes.put(pages[i])
            else:        
                    val = indexes.queue[0]
                    indexes.get()
                    s.remove(val)
                    s.add(pages[i])
                    indexes.put(pages[i])
                    page_faults += 1
 
    return page_faults
 
pages = [7, 0, 1, 2, 0, 3, 0, 4, 2, 3, 0, 3, 2]
n = len(pages)
capacity = 4
print(pageFaults(pages, n, capacity))
 
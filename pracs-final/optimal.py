def pageFault(pages,capacity):
    page_faults=0
    memory=[]
    for page in pages:
        if page not in memory:
            if len(memory)<capacity:
                memory.append(page)
            else:
                index=findOptimal(page,pages[pages.index(page)+1:],memory)
                memory[index]=page
            page_faults+=1
    return page_faults
def findOptimal(page,rem_pages,memory):
    index=-1
    farthest=-1
    for i,mem_pages in enumerate(memory):
        if mem_pages not in rem_pages:
            return i
        else:
            curr_index = rem_pages.index(mem_pages)
            if curr_index > farthest:
                farthest = curr_index
                index=i
    return index
pages = [7, 0, 1, 2, 0, 3, 0, 4, 2, 3, 0, 3, 2]
capacity = 4
print(pageFault(pages, capacity))
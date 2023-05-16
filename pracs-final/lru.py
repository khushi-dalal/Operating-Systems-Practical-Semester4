def pageFaults(pages,n,capacity):
    s=set()
    index={}
    page_faults = 0
    for i in range(n):
        if(len(s)<capacity):
            if(pages[i] not in s):
                s.add(pages[i])
                page_faults+=1
            index[pages[i]]=i
        #LRU
        else:
            if(pages[i] not in s):
                lru = float('inf')
                for page in s:
                    if index[page]<lru:
                        lru=index[page]
                        val=page
                s.remove(val)
                s.add(pages[i])
                page_faults+=1
            index[pages[i]]=i

    return page_faults

pages = [0,1,2,4,0,2,4,5,6,2,2,1,4,7,0]
n = len(pages)
capacity = 4
print(pageFaults(pages,n,capacity))
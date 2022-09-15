class Solution(object):
    def findOriginalArray(self, changed):
        n=len(changed)
        if(n%2!=0) :return []
    
        if(changed.count(0)%2!=0) :return [];
        
        changed.sort()
        # print(changed)
        mp={}
        
        for x in changed:
            if x!=0:
                if x in mp:mp[x]+=1
                else :mp[x]=1
        
        ans=[]
        a=changed.count(0)
        for i in range(a/2):
            ans.append(0)
        
        for x in changed:
            if x in mp and mp[x]!=0:
                    if x*2 in mp and mp[x*2]!=0:
                        ans.append(x)
                        mp[x*2]=max(mp[x*2]-1,0)
                        mp[x]=max(mp[x]-1,0);
                        # print(mp)
                    else :return []
        return ans

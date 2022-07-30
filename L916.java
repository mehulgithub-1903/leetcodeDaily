class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
     
        int child[]=new int[26];
        for(String e:words2){
            int temp[]=new int[26];
            for(char w:e.toCharArray()){
                temp[w-'a']++;
            }

            for(char w:e.toCharArray()){
                child[w-'a']=Math.max(child[w-'a'],temp[w-'a']);
            }
        }
        List<String> ans=new ArrayList<String>();
        
        for(String e:words1){
            int temp[]=new int[26];
            for(char w:e.toCharArray()){
                temp[w-'a']++;
            }
            if(solve(temp,child)) ans.add(e);
            
        }
        return ans;
        
    }
    public boolean solve(int parent[],int child[])
    {
        for(int i=0;i<parent.length;i++){
            if(parent[i]<child[i]) return false;
        }
        
        return true;
    }
}

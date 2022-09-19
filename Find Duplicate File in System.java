class Solution {
    class Pair{
        String filename;
        String filecontent;
        
        public Pair(String filename,String filecontent){
            this.filename=filename;
            this.filecontent=filecontent;
        }
        
    }
    private Map<String,ArrayList<String>> mp;
    public List<List<String>> findDuplicate(String[] paths) {
        mp=new HashMap<>();
        for(String e:paths){
            helper(e);
        }
        
        List<List<String>> ans=new ArrayList<>();
        
        for(String e:mp.keySet()){
            if(mp.get(e).size()>1) ans.add(mp.get(e));
        }
        
        return ans;
        
    }
    public void helper(String s){
        String arr[]=s.split(" ");
        String dirName=arr[0];
//         logic
        
        for(int i=1;i<arr.length;i++){
            Pair file=nameAndContent(arr[i]);
            mp.putIfAbsent(file.filecontent,new ArrayList<String>());
            mp.get(file.filecontent).add(dirName+"/"+file.filename);
            
        }      
    }
    public Pair nameAndContent(String s){
       
        int i=0;
        String filename="";
        
        while(s.charAt(i)!='('){
            filename+=s.charAt(i);    
            i++;
        }
        i++;
        String filecontent="";
        while(s.charAt(i)!=')'){
            filecontent+=s.charAt(i);  
            i++;
        }
        
        return new Pair(filename,filecontent);
        
        
    }
}

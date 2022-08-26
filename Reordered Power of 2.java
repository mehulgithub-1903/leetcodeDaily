class Solution {
    public boolean reorderedPowerOf2(int n) {
        String s=String.valueOf(n);
        char a[]=s.toCharArray();
        if(powerOfTwo(s)) return true;
        return rec(a,0);
        
    }
    public boolean rec(char a[],int si){
        if(si==a.length){
            return a[0]!='0' && powerOfTwo(String.valueOf(a));
        }
        for(int i=si;i<a.length;i++){
            swap(a,si,i);
            if(rec(a,si+1)) return true; 
            swap(a,si,i);
        }
        
        return false;
    }
    public void swap(char a[],int i,int j){
        char t=a[i];
        a[i]=a[j];
        a[j]=t;
        return ;
    }
    public boolean powerOfTwo(String ip){
        int i=Integer.parseInt(ip);
        if(1073741824%i==0) return true;
        else return false;
    }
}

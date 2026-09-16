class Solution {
    public int countNonRepeated(int arr[]) {
        //  code here
        int max =0,count=0;
        for(int i:arr)
            if(max<i) max =i;
            
            int a[]= new int[max+1];
            
            for(int i:arr) a[i]++;
            
            for(int i:a){
                if(i==1) count++;
            }
            return count;
            
        }
    
}
class Solution {
    public void permuteAll(int index,int []arr,List<List<Integer>> ans)
    {
        if(index==arr.length)
        {
            List<Integer> list=new ArrayList<>();
            for(int i=0;i<arr.length;i++)
                list.add(arr[i]);
          ans.add(list);
            return;
        }
        for(int i=index;i<arr.length;i++)
        {
            swap(index,i,arr);
            permuteAll(index+1,arr,ans);
            swap(index,i,arr);
        }
        
    }
    public void swap(int i,int j,int[]arr)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public List<List<Integer>> permute(int[] nums) {
      List<List<Integer> > ans=new ArrayList<>();
        permuteAll(0,nums,ans);
        return ans;
    }
}
class Solution {
    public Boolean isSafe(int row,int col,String[][]board,int n)
    {
        int duprow=row;
        int dupcol=col;
        //checking upward dioganlly
        while(row>=0&&col>=0)
        {
            if(board[row][col]=="Q")
                return false;
            row--;
            col--;
        }
        
        //check horizontally backward
        
        row=duprow;
        col=dupcol;
        while(col>=0)
        {
            if(board[row][col]=="Q")
                  return false;
              col--;
        }
        
        //check downward diogonally 
        
        row=duprow;
        col=dupcol;
        
        while(row<n&&col>=0)
        {
            if(board[row][col]=="Q")
                return false;
            row++;
            col--;
        }
        
        
        return true;
    }
    public void queen(int col,String[][]board,List<List<String>> ans,int n)
    {
      if(col==n)
      {
          List<String> list=new ArrayList<>();
          for(int i=0;i<n;i++)
          {
              String x="";
              for(int j=0;j<n;j++)
              {
                 x+=board[i][j];
              }
              list.add(x);
          }
          ans.add(list);
          return;
      }
        for(int row=0;row<n;row++)
        {
            if(isSafe(row,col,board,n))
            {
                board[row][col]="Q";
                queen(col+1,board,ans,n);
                board[row][col]=".";
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans=new ArrayList<>();
        String [][]board=new String[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                board[i][j]=".";
            }
        }
        queen(0,board,ans,n);
        return ans;
    }
}
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int srow=0;
        int scol=0;
        int erow=matrix.length-1;
        int ecol=matrix[0].length-1;
        List<Integer> list=new ArrayList<>();
        while(srow<=erow&&scol<=ecol){
           for(int i=scol;i<=ecol;i++){
            list.add(matrix[srow][i]);
           }
           srow++;
           
           for(int i=srow;i<=erow;i++){
            list.add(matrix[i][ecol]);
           }
           ecol--;
           if(srow<=erow){
             for(int i=ecol;i>=scol;i--){
               list.add(matrix[erow][i]);
              }
           }
              erow--;
           if(scol<=ecol){
              for(int i=erow;i>=srow;i--){
            list.add(matrix[i][scol]);
           }
           }
           
           
           
           scol++;
        }
        return list;
    }
}

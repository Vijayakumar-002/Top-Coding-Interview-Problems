class Solution {

    public void setZeroes(int[][] m) {
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[0].length; j++){
                if(m[i][j] == 0){
                    row(m, i);
                    col(m, j);
                }
            }
        }
         for(int i=0;i<m.length;i++){
        for(int j=0;j<m[0].length;j++){
            if(m[i][j]==-1){
                m[i][j]=0;
            }
        }
    }
    }

    static void row(int[][] m, int i){
        for(int j = 0; j < m[0].length; j++){
            if(m[i][j] != 0){
                m[i][j] = -1;
            }
        }
    }

    static void col(int[][] m, int j){
        for(int i = 0; i < m.length; i++){
            if(m[i][j] != 0){
                m[i][j] = -1;
            }
        }
    }
   
}
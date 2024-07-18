package Arrays1;
//https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/description/


public class Matrix_leetcode_1886 {
    public static void main(String[] args) {
         int[][] mat = {
                 {0,0,0},{0,1,0},{1,1,1}
         };
         int[][] target = {
                 {1,1,1},{0,1,0},{0,0,0}
         };
        System.out.println(findRotation(mat,target));
    }
    public static boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;
        for(int i = 0;i < 4 ; i++){
            for(int j = 0;j < n ; j++){
                if(check(mat,target)){
                    return true;
                }
                else{
                    mat = rotate(mat);
                }
            }
        }
        return false;
    }
    public static boolean check(int[][] mat,int[][] target){
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(mat[i][j] == target[i][j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static int[][] rotate(int[][] mat){
        int n = mat.length;
        int[][] mat1 = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat1[j][i] = mat[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = mat1[i][j];
                    mat1[i][j] = mat1[i][n - j - 1];
                    mat1[i][n - j - 1] = temp;
            }
        }
        return mat1;
    }
}

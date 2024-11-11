public class ARRAYS {
    public static void main(String[] args) {

        //declaring 1D ARRAY ->single dimension
        int[] a = new int [4];
        a[0]=1;
        a[1]=2;
        a[2]=3;
        a[3]=4;

        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

        System.out.println();
        //declaring 2D ARRAY -> multiply rows and cols of same number
        int b[][]={{1,2,3},
                   {4,5,6},
                   {7,8,9},
                   {10,11,12}};

        for(int n=0;n<a.length;n++){
            for(int m=0;m<b[n].length;m++){
                System.out.print(b[n][m]+" ");
            }
            System.out.println();
            }

        System.out.println();
        //declaring Jagged ARRAY -> multiply rows and cols of diff number
        int[][] c ={{1,2},
                {4,5,6,98},
                {7,8,9}};

        for(int p=0;p<c.length;p++){
            for(int q=0;q<c[p].length;q++){
                System.out.print(c[p][q]+" ");
            }
            System.out.println();
        }
    }
}

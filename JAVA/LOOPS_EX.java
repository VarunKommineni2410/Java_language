public class LOOPS_EX {
    public static void main(String[] args) {
        /*  * * * *
            * * * *
            * * * *
            * * * *
         */

        int i,j;
        for (i=0;i<=3;i++){
            for (j=0;j<=3;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        /*  1
            1 2
            1 2 3
            1 2 3 4

         */

        int m,n;
        for (m=1;m<=4;m++){
            for (n=1;n<=m;n++){
                System.out.print(n+" ");
            }
            System.out.println();
        }
    }
}

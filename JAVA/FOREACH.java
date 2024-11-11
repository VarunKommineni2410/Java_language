public class FOREACH {
    public static void main(String[] args) {

        int a[]={10,20,30,40};
        //for 1D ARRAY
        for (int i:a)
        {
            System.out.println(i);
        }


        int b[][]={{27,44,63},
                {80,10},
                {14,16,18,23}};
        //for 2D ARRAY and JAGGED ARRAY
        for(int m[]:b)
        {
            for (int n:m)
            {
                System.out.print(n+" ");
            }

            System.out.println();
        }
    }
}

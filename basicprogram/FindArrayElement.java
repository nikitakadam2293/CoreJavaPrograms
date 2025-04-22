package basicprogram;

public class FindArrayElement {

        public static void main(String[] args) {
            int [][]x = {{10,20,30},
                    {40,50,60}};

            for(int i = 0; i<2 ;i++)  //rows
            {
                for(int j =0 ; j < 3 ; j++)  //column
                {
                    System.out.println(x[i][j]);
                    /*if(i==0 && j==1){
                        System.out.println("h");
                        System.out.println(x[i][j]);
                    }*/
                }
            }


            //

            for(int i = 0; i<2 ;i++)  //rows
            {
                for(int j =0 ; j < 3 ; j++)  //column
                {
                    //System.out.println(x[i][j]);
                    if(i==0 && j==1){
                        System.out.println("h");
                        System.out.println(x[i][j]);
                    }
                }
            }
        }
    }


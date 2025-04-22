package ExceptionHandeling;

public class ReturnStatementScenario {
        int main1(int a)
        {
            // int a;
            try
            {
                int b = 10;

                //int z= 10/0;
                return b;
            }
            catch (Exception ex)
            {
                a=100;
               // return 100;
            }
            finally {
            /*a= 200;
            return a;
*/
                int c= 200;
                //return c;
            }

            return 300;
        }

        public static void main(String[] args) {
            ReturnStatementScenario obj = new ReturnStatementScenario();

            int a=0;
            int result = obj.main1( a);
            System.out.println(" a "+result);   // a 200
        }
    }



public class Test79
        {
        public static void main(String[] args) {
            int a = 20;
            try {
                System.out.println(a / 0); // arithemetic exception
            }
            catch (ArithmeticException obj) // handler
            {
                System.out.println(obj);
            }
            System.out.println("end of the main ");
        }
    }




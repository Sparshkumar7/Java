public class loops_P1 {
        public static void main (String[] args){
//            int loop = 0;
//            for (int a = 0; a<=loop; a++ ){
//                System.out.println(a);
//        }

//            int number = 6;
//            int factorial = 1;
//
//            for (int i = 1; i<=number; i++){
//                factorial *= i;
//            }
//            System.out.println(factorial);


            //while
//            int a= 6;
//            while(a<=10){
//                System.out.println(a);
//                a++;
//            }

            int s= 0;
            do{
                System.out.println(s);

                s--;
            }while (s>=-10);
// for each loop
//            for (type variableName : arrayName) {
//                // code block to be executed
//            }
            String[] color ={"red" , "green" , "blue", "white" , "black"};
            for (String i : color){
                System.out.println(i);
            }

    }
}
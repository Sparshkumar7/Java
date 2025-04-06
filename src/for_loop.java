import java.util.Scanner;
public class for_loop {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter number: ");
//        int num = scanner.nextInt();
//
//        for (int i= 0; i <= 10; i++){
//            System.out.println(num+" * "+i+" = "+ i*num);
//        }

//        for (int i=1; i<=4; i++){
//            for (int k=1; k<=4; k++){
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }

//        for (int i=1; i<=5; i++){
//            for (int k=1; k<=i; k++){
//                System.out.print(k);
//            }
//            System.out.println();
//        }

        //? While loop

//        int number = 10;
//        while(number >= 1 ){
//            System.out.println(number*2);
//            number--;
//        }

        //! Do while
      int num=0;
      do {
          num++;
          if(num == 2){
              continue;
          }
          System.out.println(num);
      }
      while (num<=5);
    }
}




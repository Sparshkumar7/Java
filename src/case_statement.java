import java.util.Random;
public class case_statement {
    public static void main(String[] args){
        Random random = new Random();
        int num = random.nextInt(1 ,4);

        switch (num){
            case 1:
                System.out.println("Red STOP!!!");
                break;
            case 2:
                System.out.println("Yellow");
                break;
            case 3:
                System.out.println("Green GOO...");
                break;
        }
    }
}

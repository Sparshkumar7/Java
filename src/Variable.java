public class Variable {
    public static void main (String[] args){
        //? types of variables
        //! byte (max range- 128)
        byte a = 121;

        //* short (max range- 32767)
        short b = 2353;

        //! int (max range 2,147,483,647)
        int c = 993527785;

        //? Long (max range 9,223,372,036,854,775,807)
        Long l= 99364883637383489l;

        //* Float (Store decimal value)
        float f= 45.89f;

        //! Double
        double d = 4673.04443487083633234;

        //? char (only one character store in variable)
        char name = 'H';

        //* Boolean (true or false)
        boolean one = true;
        boolean two = false;

        System.out.println("Byte: "+ a);
        System.out.println("Short: "+ b);
        System.out.println("Int: "+ c);
        System.out.println("Long: "+ l);
        System.out.println("Foat: "+ f);
        System.out.println("double: "+ d);
        System.out.println("Char: "+ name);
        System.out.println("Boolean: "+ one +"  "+ two);
    }
}

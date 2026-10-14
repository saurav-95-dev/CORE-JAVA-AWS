public class Main{
    public static void main(String[] args){
        System.out.println("Hello java");
        //Type conversion : impicit, explicit, truncating, Automatic type promotion
        byte num1 = 12;
        int num2 = num1;
        System.out.println(num2); //implicit
        //explicit type conversion:
        int i = 11;
        byte j;
        j = (byte) i;
        System.out.println(j);
        //Truncate Conversion :
        float f = 12.34f;
        int a;
        a = (int)f;
        System.out.println(a);

        //Automatic Type promotion:
        byte x = 12;
        byte z = (byte) (x * 2);
        System.out.println(z);

        //Special case :
        int y = 300;
        byte y1 = (byte) y;
        System.out.println("Truncated data for 300:" + y1);



    }
}
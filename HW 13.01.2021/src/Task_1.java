

public class Task_1 {

    public static void main(String[] args) {

        changeNumb(9,6);
        changeNumbBuffer(9,6);

    }

    public static void changeNumbBuffer (int a, int b){

        System.out.println("Before a = " + a + "  " + "b = " + b);

        int bufferNumber;
        bufferNumber = a;
        a = b;
        b = bufferNumber;

        System.out.println("After a = " + a + "  " + "b = " + b);
    }

    public static void changeNumb (int a, int b){

        System.out.println("Before a = " + a + "  " + "b = " + b);

        a = a % b;
        b = b + a;
        a = b - a;

        System.out.println("After a = " + a + "  " + "b = " + b);

    }

}

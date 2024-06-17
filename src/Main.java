public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Hello world2!");
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;

        System.out.println(findMax(a,b));
        findMax(c,d);
        findMax(a,d);
        findMax(b,d);
        findMax(d,d);

        Human human = new Human("Вася", 150);
        System.out.println(human.printPublic());
        human.setName("Петя");
        human.setHeight(-180);
        System.out.println(human.printPublic());
        System.out.printf("");
        System.out.print("");

        String[] array = new String[5];
        array[0] = "1";
        array[1] = "2";
        array[2] = "3";
        array[3] = "4";
        array[4] = "5";

        Integer[] array2 = {1, 2, 3, 65};

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            array[i] = "0";
        }

    }

    public static String findMax(int number1, int number2) {
        if (number1 > number2) {
            return ("Число " + number1 + " больше");
        } else {
            return ("Число " + number2 + " больше");
        }
    }
}
package homework;

public class Main {

    private static int counter = 0;

    public static void main(String[] args) {

        for (int i = 0; i < 2_000_000; i++) {
            if (i % 21 == 0) {
                if (has3(i)){
                    counter ++;
                }
            }
        }

        System.out.println("number 3 contains in: " + counter + "numbers");

//        has3(353);
//        throw21(25);

    }

//    public static void throw21(int num){
//        System.out.println(num % 21);
//    }

    public static boolean has3(int num) {
        char[] StrNum = String.valueOf(num).toCharArray();

        for (int j = 0; j < StrNum.length; j++) {
            if (StrNum[j] == '3') {
//                System.out.println("j: " + j);
                return true;
            }
//            System.out.println("j: " + j);

        }
        return false;
    }


}

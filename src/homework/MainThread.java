package homework;

public class MainThread {

    private static int counter = 0;

    public static synchronized void increment() {
        counter++;
    }

    public static void main(String[] args) {

        SecondThread secondThread = new SecondThread();

        secondThread.start();

        for (int i = 0; i < 1_000_000; i++) {
            if (i % 21 == 0) {
                if (has3(i)) {
                    increment();
                }
            }
        }

        try {
            secondThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("number 3 contains in: " + counter + "numbers");

    }


    public static boolean has3(int num) {
        char[] StrNum = String.valueOf(num).toCharArray();

        for (int j = 0; j < StrNum.length; j++) {
            if (StrNum[j] == '3') {
                return true;
            }
        }
        return false;
    }


}

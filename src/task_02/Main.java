package task_02;

public class Main {

    private static int counter = 0;

    public static synchronized void increment() {
        counter++;
    }

    public static void main(String[] args) {

        // Есть счётчик, сначала его значение равно 0.
        // Задача - увеличить счётчик на единицу 1_000_000 раз
        // и вывести в консоль значение счётчика.

        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();

        myThread1.start();
        myThread2.start();

        for (int i = 0; i < 1_000_000; i++) {
            increment();
        }

        try {
            myThread1.join();
            myThread2.join();
        }   catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Значение счётчика - " + counter);
    }
}
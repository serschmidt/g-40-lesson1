package task_01;

public class Main {
    public static void main(String[] args) {

        //  2 способа создания потоков
        //  1. наследуется от класса Thread
        //  2. реализируем интерфейс Runnable

        MyThread1 myThread1 = new MyThread1();
        MyThread2 myThread2 = new MyThread2();

        //  всё ещё однопоточный код
//        myThread1.run();
//        myThread2.run();

        //  для запуска кода в отдельном потоке вызываем метод start
        //  у объекта нашего класса, который унаследует от Thread
        myThread1.start();

        //  2. Для запуска кода в отдельном потоке мы создаём объект
        //  класса Thread, передавая ему в конструктор объект нашего класса
        //
        Thread thread = new Thread(myThread2);
        thread.start();

        for (int i = 0; i < 10; i++){
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}

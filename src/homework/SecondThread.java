package homework;

public class SecondThread extends Thread{

    @Override
    public void run(){
        for (int i = 1_000_001; i < 2_000_000; i++) {
            if (i % 21 == 0) {
                if (MainThread.has3(i)){
                    MainThread.increment();
                }
            }
        }
    }
}

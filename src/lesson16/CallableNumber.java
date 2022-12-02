package lesson16;

import java.util.concurrent.Callable;

public class CallableNumber implements Callable {

    @Override
    public Integer call() throws Exception {
        int i = 1;
        for(i = 0; i <= 5; i++) {
            System.out.println("Callable -> " + i);
        }
        return i;
    }


}

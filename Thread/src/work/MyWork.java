package work;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author: wig
 * @Date: 2019/12/19 12:29
 * @ClassName MyWork
 * @Description:
 */
public class MyWork {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        FutureTask<Long> futureTask = new FutureTask(myThread);
        Thread thread = new Thread(futureTask);
        thread.start();
        try {
            Long result = futureTask.get();
            System.out.println("一共花费了" + result + "毫秒");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}

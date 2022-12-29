import com.pattern.singleton.MultiThreadSingleton;
import com.pattern.singleton.Singleton;

public class SingletonClient {
    public static void main(String[] args) {
        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());
        threadFoo.start();
        threadBar.start();
    }

    static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            MultiThreadSingleton singleton = MultiThreadSingleton.getInstance();
        }
    }

    static class ThreadBar implements Runnable {
        @Override
        public void run() {
            MultiThreadSingleton singleton = MultiThreadSingleton.getInstance();
        }
    }
}

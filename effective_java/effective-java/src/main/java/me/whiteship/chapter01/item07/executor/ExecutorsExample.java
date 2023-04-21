package me.whiteship.chapter01.item07.executor;

import java.util.concurrent.*;

public class ExecutorsExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int cpu = Runtime.getRuntime().availableProcessors();

        ExecutorService service = Executors.newFixedThreadPool(cpu);
//        ExecutorService service = Executors.newCachedThreadPool();
//        ExecutorService service = Executors.newSingleThreadExecutor();
//        ScheduledExecutorService service = Executors.newScheduledThreadPool(10);
//        for (int i = 0; i < 100; i++) {
//            service.submit(new Task());
////            Thread thread = new Thread(new Task());
////            thread.start();
//        }
        Future<String> submit = service.submit(new Task());

        System.out.println(Thread.currentThread() + " hello");

        System.out.println(submit.get());

        service.shutdown();
    }

    static class Task implements Callable<String> {
        @Override
        public String call() throws Exception {
            Thread.sleep(2000L);
            return Thread.currentThread() + " world";
        }
    }

//    static class Task implements Runnable {
//        @Override
//        public void run() {
//            try {
//                Thread.sleep(2000L);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            System.out.println(Thread.currentThread() + " world");
//        }
//    }

}

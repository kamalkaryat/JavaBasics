package multi_threading_concurrency;

/**
 * Can't create a thread of ThreadvsRunnableUsage class as it is extending the NothingClass. Java
 * doesn't support multiple inheritance due to which can't extend the Thread class to make the
 * thread. Only option is to use the Runnable interface.
 */

//CASE 1:
class MyClass extends NothingClass implements Runnable{
    @Override
    public void run() {

    }
}

//CASE 2: Either Thread class or Runnable interface is used to create the thread

class ThreadClazz extends Thread{

}

class RunnableInterface implements Runnable{
    @Override
    public void run() { }
}

public class ThreadvsRunnableUsage{}
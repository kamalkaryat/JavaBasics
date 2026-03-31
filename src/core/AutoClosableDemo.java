package core;

/**
 * Try-with-resources statement is used to automatically close
 * resources that implement the AutoCloseable interface.
 * introduced in Java 7, eliminates the need for manual cleanup in a finally block
 * The resource is closed automatically at the end of the try block, even if an exception occurs.
 */
public class AutoClosableDemo {

    public static void main(String[] args) {
        //new AutoClosableDemo().customClassWhichImplementAutoClosable();

        //Problem before java 9 with try-with-resources statement: The resource variable must
        // be declared within the try block,
        new AutoClosableDemo().problemBeforeJava9();

        //java 9 enhancement: try-with-resources statement can be used with effectively final or
        // final variables that are already initialized outside the try block.
        //new AutoClosableDemo().java9Enhancement();

    }

    private void problemBeforeJava9() {

        //AutoCloseableTest test= new AutoCloseableTest();

        //before java 9, the resource variable must be declared within the try block, so the above line would not compile.
        try (AutoCloseableTest test = new AutoCloseableTest()) {
            test.doSomething();
        } catch (Exception e) {
            System.out.println("Exception occurred while using AutoCloseableTest");
            e.printStackTrace();
        }
    }

    private void java9Enhancement() {
        AutoCloseableTest test = new AutoCloseableTest();
        try (test) {
            test.doSomething();
        } catch (Exception e) {
            System.out.println("Exception occurred while using AutoCloseableTest");
            e.printStackTrace();
        }
    }

    private void customClassWhichImplementAutoClosable() {
        try (AutoCloseableTest test = new AutoCloseableTest()) {
            test.doSomething();
        } catch (Exception e) {
            System.out.println("Exception occurred while using AutoCloseableTest");
            e.printStackTrace();
        }
    }
}

class AutoCloseableTest implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("AutoCloseableTest closed");
    }

    public void doSomething() {
        System.out.println("Doing something in AutoCloseableTest");
    }
}

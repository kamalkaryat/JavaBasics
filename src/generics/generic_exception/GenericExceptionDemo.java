package generics.generic_exception;

/**
 * Generic Exceptions are not allowed
 * What if allowed?
 * When Exception(Runtime) occurred at this time Compiler has already done the 'Type Erasure'
 * And the actual type is already known. Hence, no usage of using generic exception. Therefore,
 * Generic Exception are not allowed.
 * But we can use the Generic Constructor
 */
public class GenericExceptionDemo {
    public static void main(String[] args) {
        try {
            throw new MyException(123343);
        }catch (MyException e){
            System.out.println(e.getMessage());
        }

        try {
            throw new MyException("Generic Demo");
        }catch (MyException e){
            System.out.println(e.getMessage());
        }
    }
}

/*
Error

class MyException<T> extends  Exception{
    public MyException(){
        super();
    }
}
*/

class MyException extends Exception{
    public <T> MyException(T val){
        super("Exception related to the value: "+val.toString()+
        " of type: "+val.getClass().getName());
    }
}
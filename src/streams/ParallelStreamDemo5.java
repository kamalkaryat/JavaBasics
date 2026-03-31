package streams;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class ParallelStreamDemo5 {
    public static void main(String[] args) {
        //PSHelper.problemDemo();
        //PSHelper.solutionDemo();
        PSHelper.varInLambdaExp();
    }
}

class PSHelper{
    public static void problemDemo() {
        List<Integer> noList= Stream.iterate(1, x -> x+1)
                .limit(20000).toList();

        long sequentialStartTime= System.currentTimeMillis();

        //Finding Factorial Using Sequential Stream
        List<Long> factorialOfNoSS= noList.stream().map(PSHelper::factorial).toList();

        long sequentialEndTIme= System.currentTimeMillis();
        System.out.println("Sequential Stream Time Taken: "+(sequentialEndTIme-sequentialStartTime));


        long parallelStartTime= System.currentTimeMillis();

        //Finding the factorial of no's using parallel Stream
        List<Long> factorialOfNoByPS= noList.parallelStream().map(PSHelper::factorial).toList();
        long parallelEndTIme= System.currentTimeMillis();
        System.out.println("Parallel Stream Time Taken: "+(parallelEndTIme-parallelStartTime));
    }

    public static void solutionDemo() {
    }

    private static long factorial(int n){
        if(n<=1) return 1;
        return n*factorial(n-1);
    }

    public static void varInLambdaExp(){
        List<Integer> noList= Arrays.asList(1,2,3,4,5);

        /*
        Get Compiler Error as Lambda Expression can't use a non-final variable if it is declared
        outside the expression

        List<Integer> cumulativeSum= noList.parallelStream().map(x ->{
            int i= x + sum;
            sum =i;
            return i;
        }).toList();
         */

        System.out.println("Correct Cumulative Sum[1, 3, 5, 7, 9]");
        AtomicInteger sum = new AtomicInteger(0);
        List<Integer> cumulativeSum= noList.parallelStream().map(x -> sum.addAndGet(x))
                .toList();
        System.out.println("Cumulative Sum Using Parallel Streams: "+cumulativeSum);


    }
}

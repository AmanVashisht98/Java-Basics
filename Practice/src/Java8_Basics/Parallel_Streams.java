package Java8_Basics;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class Parallel_Streams {

    private static long factorial(int n){
        long result = 1;
        for (int i=2; i<=n; i++){
            result*=i;
        }
        return result;
    }

    public static void main(String[] args) {
        // Paraller Stream
        //It is a type of stream that enables paraller processing of elements.
        //It allows multiple threads to process parts of stream simultaneously.
        //This can significantly improve performance for large data sets.
        //Workload is distributed across multiple threads.

        //When to use?
        //Parallel streams are most effective for CPU-intensive or large datasets where tasks are independent.
        //For simple task and small dataset, it may add overhead.

        //Creating a list using iterate() method and calculating factorial using stream
        long startTime = System.currentTimeMillis();
        List<Integer> list = Stream.iterate(1, x->x+1).limit(20000).toList();
        List<Long> list1 = list.stream().map(Parallel_Streams::factorial).toList();
        long endTime = System.currentTimeMillis();
        System.out.println("total time taken: " + (endTime-startTime) + " ms");

        //calculating factorial using parallel stream
         startTime = System.currentTimeMillis();
        list1 = list.parallelStream().map(Parallel_Streams::factorial).toList();
         endTime = System.currentTimeMillis();
        System.out.println("total time taken: " + (endTime-startTime) + " ms");

        //Calculating cumulative sum
        //[1,2,3,4,5] ----> [1,3,6,10,15]
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        AtomicInteger sum = new AtomicInteger(0);
        List<Integer> list2 = numbers.stream().map(x -> sum.addAndGet(x)).toList();
        System.out.println(list2);


    }
}

package Java8_Revision;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionalInterface_StreamsAPI {
    //benifits of java8

    //minimal code and functional programming
    //lambda expression, streams, date & time API

    public static void main(String[] args) {


        //Lamda Expression------------------------------------------------------------------------------------------------------------------------------------------
//        Thread thread1 = new Thread(()->{
//            System.out.println("Thread 1");
//        });
//        thread1.start();

        //@Functional Interface-------------------------------------------------------------------------------------------------------------------------------------
        System.out.println("Functional Interface-------------------------------------------------------------------------------------------------------------------");
        // It is an interface with only one abstract method, it can have any number of default and static methods

        //1. Predicate - It is a functional interface having only one abstract method i.e., boolean Test(T t).
        // boolean Test(T t) - It checks the condition and returns true or false
        //Predicate holds a condition.
        System.out.println("Predicate Functional Interface");
        Thread thread2 = new Thread(()->{
            Predicate<Integer> isEven = x->x%2==0;
            System.out.println(isEven.test(4));
        });
        thread2.start();
        Thread thread3 = new Thread(()->{
            Predicate<String> startsWith = x->x.toLowerCase().startsWith("a");
            System.out.println(startsWith.test("Aman"));
        });
        thread3.start();

        System.out.println("---------------------------------");

        //2. Function - It is a functional interface having only one abstract method i.e., R apply(T t).
        //R apply(T t) - It performs a operation for you and gives the result
        System.out.println("Function Functional Interface");

            Function<Integer, Integer> doubleIt = (x)->x*x;
            System.out.println(doubleIt.apply(4));
        //We have Unary Operator which is substitute of Function, it is similar to Function
        //In this we don't have to mentions return types separately for input and output
        UnaryOperator<Integer> unaryOperator = (x)->x*x;
        System.out.println(unaryOperator.apply(5));
        System.out.println("---------------------------------");

        //3. Consumer - It is a functional interface having only one abstract method i.e., void accept(T t)
        //void accept(T t) - It consumes and does not return. We can use it to print something
        System.out.println("Consumer Functional Interface");
        Consumer<Integer> consumer = (x)-> System.out.println(x);
        consumer.accept(75);
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        Consumer<List<Integer>> intList = x->{
            for(int i:x){
                System.out.println(i);
            }
        };
        intList.accept(list);
        System.out.println("---------------------------------");

        //4. Supplier - It is a functional interface having only one abstract method i.e., T get()
        // T get() - It gives result without accepting any input
        System.out.println("Supplier Functional Interface");
        Supplier<String> giveOutput = ()-> "This is supplier functional interface";
        System.out.println(giveOutput.get());
        System.out.println("---------------------------------");

        //5. Bipredicate - It is a functional interface similar to predicate, it takes two inputs.
        //It uses test(Object, Object) method
        System.out.println("Bipredicate Functional Interface");
        BiPredicate<Integer, Integer> check = (x,y)->(x+y)%2==0;
        System.out.println(check.test(2,3));
        System.out.println("---------------------------------");

        //6. BiFunction - It is a functional interface similar to function, it takes two inputs.
        // It uses apply(Object, Object) method.
        System.out.println("Bifunction functional Interface");
        BiFunction<Integer, Integer, Integer> perform = (x,y)->x*y;
        System.out.println(perform.apply(5,7));
        System.out.println("---------------------------------");
        //Binary Operator
        //We have Binary Operator which is substitute of BiFunction, it is similar to BiFunction. In this we don't have to mentions return types separately for inputs and output.
        System.out.println("Binary Operator");
        BinaryOperator<Integer> binaryOperator = (x,y)->x*y;
        System.out.println(binaryOperator.apply(3,5));
        System.out.println("---------------------------------");

        //7. Biconsumer
        System.out.println("Biconsumer Functional Interface");
        BiConsumer<Integer, Integer> consumeBoth = (x,y)->{
            System.out.println(x);
            System.out.println(y);
        };


        //Streams-----------------------------------------------------------------------------------------------------------------------------------------------------
        System.out.println("Streams API-----------------------------------------------------------------------------------------------------------------------------");
        //It is sequence of elements which supports functional and declarative programming
        //streams() method converts sequence of elements into streams
        //How to use Streams
        //Source -> Intermediate operation -> Terminal Operation

        //Intermediate Operations
        //Intermediate operations transform a stream intro another stream.
        //They are lazy, they don't execute until a terminal operation is invoked.

        //1. filter()-------------------------------------------------------------------------------------------------------------------------------------------------
        //It uses predicate interface (test() method). It is used to filter the data based on some condition.
        System.out.println("filter() Method");
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7);
        System.out.println(numbers.stream().filter(x->x%2==0).count());
        //Here, numbers is source, filter is intermediate operation and count is terminal operation
        System.out.println("---------------------------------");

        List<String> filterString = Arrays.asList("Akshit", "Ram", "Shyam", "Ghanshyam");
        System.out.println( filterString.stream().filter(x->x.startsWith("A")).count());
        //Here, filterString is source, filter is intermediate operation and count is terminal operation
        System.out.println("---------------------------------");


        //2. map()---------------------------------------------------------------------------------------------------------------------------------------------------
       //It uses function interface (apply() method). It is used to perform some action on data.
        System.out.println("map() method");
        List<String> filter1 = Arrays.asList("Akshit", "Ram", "Shyam", "Ghanshyam");
        Stream<String> stringStream = filter1.stream().map(x -> x.toUpperCase());
        System.out.println("---------------------------------");


        //3. flatMap()-----------------------------------------------------------------------------------------------------------------------------------------------
        //It handles streams of collections, lists or arrays where each element in itself is a collection
        System.out.println("filterMap() method");
        List<List<String>> listofLists = Arrays.asList(
                Arrays.asList("Apple", "Orange", "Banana"),
                Arrays.asList("Potato", "Tomato", "Onion"),
                Arrays.asList("Water", "Cold Drink", "Lemonade")
        );
        List<String> list8 = listofLists.stream().flatMap(x -> x.stream().map(y -> y.toUpperCase())).toList();
        System.out.println(list8);
        System.out.println("---------------------------------");


        //4. reduce()--------------------------------------------------------------------------------------------------------------------------------------------------
        //It combines elements to produce single result. such as adding all elements of a list(sum of all elements of list)
        //It uses BiFunction Interface(Binary Operator) (apply method)
        System.out.println("reduce() method");
        List<Integer> list6 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Optional<Integer> optionalInteger = list6.stream().reduce((x, y) -> x + y);
        System.out.println(optionalInteger.get());
        System.out.println("---------------------------------");


        //5. sorted()------------------------------------------------------------------------------------------------------------------------------------------------
        System.out.println("sorted() method");
        List<String> list1 = Arrays.asList("Akshit", "Ram", "Shyam", "Ghanshyam");
        System.out.println(list1.stream().sorted().toList());

        //Reverse order sorting - Comparator.reverseOrder()
        int[] arr = {1,2,3,21,5,7};
        System.out.println(Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).toList());

        //Custom sorting - Sorting stream using comparator
        List<String> list13 = list1.stream().sorted((a, b) -> a.length() - b.length()).toList();
        System.out.println(list13);

        //sorting hashmap based on key or value (comparingByKey(), ComparingByValue())
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Banana");
        map.put(5,"Apple");
        map.put(2, "Apple");
        map.put(3, "Orange");
        map.put(4, "Grapes");
        System.out.println(map.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toList()));
        System.out.println(map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toList()));
        //.sorted(Map.Entry.comparingByValue()): Sorts the stream of Map.Entry objects based on the values using the comparingByValue() method of the Map.Entry interface.
        System.out.println("---------------------------------");


        //4. distinct()-----------------------------------------------------------------------------------------------------------------------------------------------
        System.out.println("distinct() method");
        List<String> list2 = Arrays.asList("Akshit", "Akshit", "Ram", "Shyam", "Ghanshyam");
        long a = list2.stream().filter(x -> x.startsWith("A")).distinct().count();
        System.out.println(a);
        System.out.println("---------------------------------");


        //6. limit()----------------------------------------------------------------------------------------------------------------------------------------------------
        System.out.println("limit() method");
        List<String> list3 = Arrays.asList("Akshit", "Akshit", "Aman", "Ram", "Shyam", "Ghanshyam");
        long b = list3.stream().filter(x -> x.startsWith("A")).limit(2).count();
        System.out.println(b);
        System.out.println("---------------------------------");


        //7. forEach()--------------------------------------------------------------------------------------------------------------------------------------------------
        System.out.println("forEach() method");
        List<Integer> list4 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        list4.stream().forEach(x-> System.out.print(x + " "));
        System.out.println();
        System.out.println("---------------------------------");


        //8. skip()----------------------------------------------------------------------------------------------------------------------------------------------------
        System.out.println("skip() method");
        List<Integer> list5 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        list5.stream().skip(5).forEach(x-> System.out.print(x + " "));
        System.out.println();
        System.out.println("---------------------------------");


        //9. anyMatch, allMatch, noneMatch-----------------------------------------------------------------------------------------------------------------------------
        System.out.println("anyMatch, allMatch, noneMatch");
        List<Integer> list7 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        boolean b1 = list7.stream().anyMatch(x -> x % 2 == 0);
        System.out.println(b1);
        boolean b2 = list7.stream().allMatch(x -> x > 0);
        System.out.println(b2);
        boolean b3 = list7.stream().noneMatch(x -> x > 10);
        System.out.println(b3);
        System.out.println("---------------------------------");


        //10. toArray() and toList()-----------------------------------------------------------------------------------------------------------------------------------------
        //They are used to convert stream to array and list
        System.out.println("toArray() and toList()");
        List<Integer> list9 = Stream.of(1, 2, 3, 4, 5).toList();
        System.out.println("List: " + list9);
        Stream.of(1, 2, 3, 4, 5).toArray();
        System.out.println("---------------------------------");


       //11. min/max--------------------------------------------------------------------------------------------------------------------------------------------------------
        System.out.println("min and max");
        System.out.println(Stream.of(1,2,3,4,5,6,7,75).max(Comparator.naturalOrder()).get());
        System.out.println(Stream.of(1,2,3,4,5,6,7,75).min(Comparator.naturalOrder()).get());
        System.out.println("---------------------------------");

        //14. Stream.concat()-----------------------------------------------------------------------------------------------------------------------------------------------
       //It is used to concat two streams
        System.out.println("concat() method");
        Stream<Integer> integerStream = Stream.of(1, 2, 3);
        Stream<Integer> integerStream1 = Stream.of(4, 5, 6);
        List<Integer> concat = Stream.concat(integerStream, integerStream1).toList();
        System.out.println("Concat string : " + concat);
        System.out.println("---------------------------------");

        //15. chars() - It is used to convert a string into stream, so that we can perform operations on it.

        //16. Arrays.stream() - It is used to convert an array to stream, si that we can perform operations on it.

        //17. boxed() - It is used to convert primitive values to non-primitive values. (Example: int to Integer)

        //=======================================================================================================================================================================
        //Collectors Methods
        System.out.println("Collectors methods---------------------------------------------------------------------------------------------------------------------------------");

        //1. Summarizing Data (Collectors.summarizing)
        System.out.println("Summarizing Data");
        List<Integer> list10 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        IntSummaryStatistics collect = list10.stream().collect(Collectors.summarizingInt(x -> x));
        System.out.println(collect);
        System.out.println("---------------------------------");


        //2. Calculating sum (Collectors.summingInt)
        System.out.println("Calculating Sum");
        List<Integer> list11 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(" sum: " + list11.stream().collect(Collectors.summingInt(x -> x)));
        System.out.println("---------------------------------");


        //3. Calculating Average (Collector.averaging)
        System.out.println("Calculating average");
        Double collect1 = list10.stream().collect(Collectors.averagingInt(x -> x));
        System.out.println(collect1);
        System.out.println("---------------------------------");


        //4. Calculating count (Collectors.counting)
        System.out.println("Calculating count");
        long count = list10.stream().collect(Collectors.counting());
        System.out.println("count: " + count);
        System.out.println("---------------------------------");

        //5. Grouping Elements (Collectors.groupingBy)
        //It groups the elements based on some condition
        System.out.println("Grouping based on some condition");
        List<String> words = Arrays.asList("Aman", "Tarun", "Neha", "Sagar", "Yash");
        System.out.println(words.stream().collect(Collectors.groupingBy(x->x.length())));
        System.out.println("---------------------------------");


        //6. GroupingBy with counting (Collectors.groupingBy)
        System.out.println("Grouping with counting");
        List<String> words1 = Arrays.asList("Aman", "Tarun", "Neha", "Sagar", "Yash");
        System.out.println(words1.stream().collect(Collectors.groupingBy(x->x.length(), Collectors.counting())));
        System.out.println("---------------------------------");


        //7. Grouping with occurence (Collectors.groupingBy)
        System.out.println("Grouping with occurence");
        String occurence = "hello world hello world java";
        System.out.println(Arrays.stream(occurence.split(" ")).collect(Collectors.groupingBy(x->x,Collectors.counting())));

        List<String> list12 = Arrays.asList("Aman", "Tarun", "Neha", "Sagar", "Yash", "Aman");
        System.out.println(list12.stream().collect(Collectors.groupingBy(x->x, Collectors.counting())));
        System.out.println("---------------------------------");


        //8. Partitioning Elements (Collectors.partitioningBy)
        //It partitions elements into two groups
        System.out.println("Partitioning elements into groups");
        List<String> words2 = Arrays.asList("Aman", "Tarun", "Neha", "Sagar", "Yash");
        System.out.println(words2.stream().collect(Collectors.partitioningBy(x->x.length()>4)));
        System.out.println("---------------------------------");

        //9. Mapping and Collecting Elements (Collectors.mapping)
        //It applies a mapping function before collecting
        System.out.println("Mappind and collecting elements");
        List<String> words3 = Arrays.asList("Aman", "Tarun", "Neha", "Sagar", "Yash");
        System.out.println(words3.stream().collect(Collectors.mapping(x->x.toUpperCase(), Collectors.toList())));
        System.out.println("---------------------------------");

        //10. Converting stream to map (Collectors.toMap)
        System.out.println("converting stream to a map");
        List<String> words4 = Arrays.asList("Aman", "Tarun", "Neha", "Sagar", "Yash");
        System.out.println(words4.stream().collect(Collectors.toMap(x->x.toUpperCase(),x->x.length())));


        //----------------



    }
    }
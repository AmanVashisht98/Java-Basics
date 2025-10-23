package CollectionImplementation;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayList_2Threads {
    public static void main(String[] args) {

        //Creating a new CopyOnWriteArrayList
        List<String> sharedList = new CopyOnWriteArrayList<>();
        sharedList.add("Item1");
        sharedList.add("Item2");
        sharedList.add("Item3");

        //Creating a reader thread to read(iterates) a list
        Thread thread1 = new Thread(()->{
            try{
                //Iterate through list
                while(true){
                    for(String item: sharedList){
                        System.out.println("Reading iteam: " + item);
                        Thread.sleep(100); //small delay
                    }
                }

            } catch (Exception e) {
                System.out.println("Exception in reader thread");
            }
        });

        //Creating a writer thread to modify a list
        Thread thread2 =  new Thread(()->{
            try{
                //Delay to allow reading first
                Thread.sleep(500);
                sharedList.add("Item4");
                System.out.println("Added item 4 to the list");

            } catch (Exception e){
                System.out.println("Exception in writer thread");
            }
        });

        thread1.start();
        thread2.start();

        //If we try to replicate the above scenerio using Arraylist, we will get Concurrent Modification Exception

    }
}

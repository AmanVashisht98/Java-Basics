package CollectionImplementation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class HashMapImpl {
    static class HashMap<K,V>{ // K-key,V-value are generic type here
        private class Node{
            K key;
            V value;
            public Node(K key,V value){
                this.key=key;
                this.value=value;
            }
        }

        private int n; // n=total number of nodes
        private int N; //N=Number of buckets (size of array)
        //private int[] arr = new int[4];
        private LinkedList<Node>[] buckets; //N=buckets.length

        public HashMap(){
            this.N=4;
            this.buckets= new LinkedList[4];
            for(int i=0; i<N; i++){
                this.buckets[i] = new LinkedList<>();
            }
        }

        //hashFunction
        private int hashFunction(K key){
            int bucketIndex = key.hashCode();
            return Math.abs(bucketIndex) % N; //compression function
        }
        

        //rehashing
        private void rehash(){
            LinkedList<Node> oldBucket[] = buckets;
            buckets = new LinkedList[N*2]; //doubling the size of array buckets[]

            for(int i=0; i< buckets.length; i++){
                buckets[i]=new LinkedList<>(); //creating a new linked list at each index of buckets[]
            }

            for(int i=0; i<oldBucket.length; i++){
                LinkedList<Node> ll = oldBucket[i];
                for(int j=0;  j<ll.size(); j++){
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }

        //search
        private int searchInLL(K key, int bucketIndex){
            LinkedList<Node> ll = buckets[bucketIndex];
            for(int i=0; i<ll.size(); i++){
                if(ll.get(i).key==key){
                    return i; //key exist at index i
                }
            }
            return -1; //key does not exist
        }


        //put
        public void put(K key, V value){
           int bucketIndex = hashFunction(key); //hashFunction will return the bucketIndex
           int dataIndex = searchInLL(key, bucketIndex); //searchInLL will return the dataIndex

            if(dataIndex == -1){ //key does not exist
                buckets[bucketIndex].add(new Node(key, value));
                n++;
            } else { //key exists
                Node node = buckets[bucketIndex].get(dataIndex);
                node.value=value;
            }

            double loadFactor = (double) n/N;
            if(loadFactor > 2){ //rehashing
                rehash();
            }
        }

        //get
        public V get(K key){
            int bucketIndex = hashFunction(key); //hashFunction will return the bucketIndex
            int dataIndex = searchInLL(key, bucketIndex); //searchInLL will return the dataIndex

            if(dataIndex == -1){ //key does not exist
                return null;
            } else { //key exists
                Node node = buckets[bucketIndex].get(dataIndex);
                return  node.value;
            }
        }

        //containsKey
        public boolean containsKey(K key){
            int bucketIndex = hashFunction(key); //hashFunction will return the bucketIndex
            int dataIndex = searchInLL(key, bucketIndex); //searchInLL will return the dataIndex

            if(dataIndex == -1){ //key does not exist
                return false;
            } else { //key exists
                return true;
            }
        }

        //remove
        public V remove(K key){
            int bucketIndex = hashFunction(key); //hashFunction will return the bucketIndex
            int dataIndex = searchInLL(key, bucketIndex); //searchInLL will return the dataIndex
            if(dataIndex == -1){ //key does not exist
                return null;
            } else { //key exists
                Node node = buckets[bucketIndex].remove(dataIndex);
                return node.value;
            }
        }

        //keySet
        public ArrayList<K> keySet(){
            ArrayList<K> keys = new ArrayList<>();
            for(int i=0; i< buckets.length; i++){ //bucketIndex
                LinkedList<Node> ll = buckets[i];
                for(int j=0; j<ll.size(); j++){ //dataIndex
                    Node node=ll.get(j);
                    keys.add(node.key);
                }
            }
            return keys;
        }

        //isEmpty
        public boolean isEmpty(){
            return n==0;
        }
    }


    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 1);
//        map.put(new String("India"), 2);
        map.put("USA", 3);
        System.out.println(map.get("India"));
        System.out.println(map.keySet());
//        System.out.println(map.containsKey("India"));
//        System.out.println(map.containsKey("China"));
//        System.out.println(map.containsKey("America"));+
    }
}

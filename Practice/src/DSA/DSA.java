package DSA;

import java.util.*;

public class DSA {
    public static void main(String[] args) {

        //Question 1: Find occurence of each character in string
        String s1 = "abcbdeaaf";
        findOccurence(s1);

        //Question 2: Find the count of sub-arrays whose sum = target
        int[] arr = {1,2,3,4,6,7};
        int target=10;
        System.out.println("Count of sub-arrays: " + subarray(arr,target));

        //Question 3: Find the index of the target element if it exists in array. If it does not exist, find the index at which it should be inserted.
        int number=5;
        System.out.println("Index of target element: " + findIndex(arr,number));

        //Question 4: Find the length of longest sub-string without repeating characters.
        String s2 = "abcabcbbwxyz";
        System.out.println("Length of the longest substring without repeating characters: " + longestSubstring(s2));


        //Question 6: Arrange the characters of a string in order of occurenece and if two elements having same occurence than sort based on insertion order.
        String s3 = "Aabbcccdd";
        //Output:- cccbbddAa
        System.out.print("Sorted string based on occurence of characters: ");
        sortedMap(s3);

        //Question 7: Move all zeros to end of an array.

        //Question 8: An array is having 1 duplicate element(say a number is occuring twice). Find that duplicate element from array.

    }

    //Question 1: Find occurence of each character in string
    public static void findOccurence(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i))){

                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            } else {
                map.put(s.charAt(i),1);
            }

        }
        System.out.println(map);
    }

    //Question 2: Find the count of sub-arrays whose sum = target
    public static int subarray(int[] arr, int target){
        int count=0;
        for(int i=0; i<arr.length; i++){
            int sum=0;
            for(int j=i; j<arr.length; j++){
                sum = sum + arr[j];
                if(sum==target){
                    count++;
                }
            }
        }
        return count;
    }

    //Question 3: Find the index of the target element if it exists in array. If it does not exist, find the index at which it should be inserted.
    public static int findIndex(int[] arr, int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                return i;
            } else if (arr[i]>target) {
                return i;
            }
        }
        return arr.length-1;
    }

    //Question 4: Find the length of longest sub-string without repeating characters.
    public static int longestSubstring(String s){
        //"abcabcbb"
        HashSet<Character> set1 = new HashSet<>();
        int left=0;
        int maxLength=0;
        for(int right=0; right<s.length(); right++){
            while(set1.contains(s.charAt(right))){
                set1.remove(s.charAt(left));
                left++;
            }
            set1.add(s.charAt(right));
            maxLength = Math.max(maxLength, right-left+1);
        }
        return maxLength;
    }

    //Question 6: Arrange the characters of a string in order of occurenece and if two elements having same occurence than sort based on insertion order.
   // Input:- String s = “Aabbcccdd”
    //Output:- cccbbddAa
    public static String sortedMap(String s) {

        String[] sa=s.split("");
        Map<String,Integer> map=new LinkedHashMap<>();
        for(String ss:sa){
            if(map.containsKey(ss))
                map.put(ss,map.get(ss)+1);
            else
                map.put(ss,1);
        }
        System.out.println(map);

        Set<Map.Entry<String, Integer>> entries = getSet(map);
        System.out.println(entries);
        return null;
    }

    public static Set<Map.Entry<String, Integer>> getSet(Map<String, Integer> map){

        Set<Map.Entry<String, Integer>> ts=new TreeSet<>((l1,l2)-> {
            int diff = -l1.getValue().compareTo(l2.getValue());
            if (diff == 0)
                return 1;

            return diff;
        }
        );

        for(Map.Entry<String,Integer> ss:map.entrySet()){
            ts.add(ss);
        }
        return ts;
    }



}
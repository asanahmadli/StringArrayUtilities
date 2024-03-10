package com.zipcodewilmington;

import java.util.*;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {

        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        boolean flag = false;
        for(String str:array){
            if(str.equals(value)){
                flag=true;
            }

        }
        return flag;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {

       String[] arr = array;

        String[] reverse = new String[arr.length];

        for(int i=0;i<arr.length;i++){

            reverse[i]=arr[arr.length-i-1];
        }


        return reverse;
    }


    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        int number = 0;
        for(int i=0;i<array.length;i++){
            if(array[i]==array[array.length-1-i]){
                number++;
            }
        }
        return number==array.length;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        Set<Character> st = new HashSet<>();
        for(int i=0;i<array.length;i++){
            char[] str = array[i].toLowerCase().replaceAll(" ","").toCharArray();
            for(int j=0;j<str.length;j++){
                st.add(str[j]);
            }
        }
        return st.size()==26;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int occurence = 0;
        for(int i=0;i<array.length;i++){
            if(array[i].equals(value)){
                occurence++;
            }
        }
        return occurence;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        ArrayList<String> arr = new ArrayList<>(List.of(array));
        int i=0;
        while (i<arr.size()) {
            if (arr.get(i).equals(valueToRemove)) {
                arr.remove(i);

            }
            i++;
        }
        String[] a = new String[arr.size()];

        int m = 0;
        while (m<a.length){
            a[m]=arr.get(m);
            m++;
        }

        return a;
    }




    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {

        ArrayList<String> arr = new ArrayList<>(List.of(array));
        for(int i=0;i<arr.size()-1;i++) {
            while (i + 1 != arr.size() && arr.get(i).equals(arr.get(i + 1))) {
                arr.remove(i);
            }
        }

        String[] b = new String[arr.size()];
        for(int i=0;i<arr.size();i++){
            b[i]=arr.get(i);
        }
        return b;
    }




    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {

        StringBuilder sb = new StringBuilder();
        int number=0;
        for(int i=0;i<array.length;i++) {
            for (int m = i; m < array.length; m++) {
                if (array[i].equals(array[m])) {
                    number++;
                    sb.append(array[i]);
                }
                else {
                    break;
                }
            }
            sb.append(",");
            i=number-1;
        }
        String s = sb.toString();
        String[] a = s.split(",");
        return a;
    }



}

package binarysearch;
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class binarysearchquestion3 {
    public static void main(String[] args) {
        
    }

    public char nextGreatestLetter(char[] letters, char target) {
       
        int start = 0;
        int end = letters.length - 1;

        while(start<=end){
            //find the middle element
           // int mid = (start  + end)/2;
            // might be possible  (start + ennd ) exceds the range in java
            int mid = start + (end - start)/2;

            if(target < letters[mid]){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }

        return letters[start % letters.length]   ; 
    }

    
 }


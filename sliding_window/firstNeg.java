package sliding_window;


import java.util.ArrayList;

public class firstNeg {
    

    public static ArrayList<Integer> Neg_subb(int[] arr,int k ){
        ArrayList<Integer> list  = new ArrayList<>() ;
        int i = 0 ; 
        int j = 0 ; 
        while (j < arr.length) {
            if(arr[j] < 0){
                list.add(arr[j]) ;
                break ;
            }

            if(j - i  +1 < k ){
                j++ ;
            }else if(j - i + 1 == k ){
                i++ ;
                j++ ; 
            }
        }

        return list ; 
    }
}

package day58;

import java.util.*;
public class solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        
        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicatesSet = new HashSet<>();
        ArrayList<Integer> duplicatesList = new ArrayList<>();
        
        for(int i = 0 ; i< n ; i++){ //[2, 3, 1, 2, 3]
            if(set.contains(arr[i])){
                duplicatesSet.add(arr[i]);
            }else{
                set.add(arr[i]);
            }
        }
        if(duplicatesSet.isEmpty()){
            duplicatesList.add(-1);
            return duplicatesList;
        }
        
        duplicatesList.addAll(duplicatesSet);
        Collections.sort(duplicatesList);
        return duplicatesList;
        
    }
}
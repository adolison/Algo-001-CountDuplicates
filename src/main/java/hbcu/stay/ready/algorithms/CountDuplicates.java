package hbcu.stay.ready.algorithms;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicates {
    /**
     * Example of overloading a function that accepts a Array String
     * @param input
     * @return
     */
    public Integer countDuplicates(String[] input){
        Map<String,Integer> map = new HashMap<>();
        Integer duplicates =0;
        for (int i = 0;i<input.length;i++){
            if (!map.containsKey(input[i])){
                map.put(input[i],1);
            }else{
                Integer keyValue = map.get(input[i]);
                if (keyValue==1){
                    duplicates++;
                }
                keyValue++;
                map.put(input[i],keyValue);


            }
        }
        return duplicates;
    }

    /**
     * Example of overloading a function that accepts a Array of Integers
     * @param input
     * @return
     */
    public Integer countDuplicates(Integer[] input){

       Map<Integer,Integer> map = new HashMap<>();
       Integer duplicates =0;
       for (int i = 0;i<input.length;i++){
           if (!map.containsKey(input[i])){
               map.put(input[i],1);
           }else{
               Integer keyValue = map.get(input[i]);
               if (keyValue==1){
                   duplicates++;
               }
               keyValue++;
               map.put(input[i],keyValue);


           }
       }
        /*Integer duplicates = 0;
        Integer holdNum =0;
        for( int firstInt=0; firstInt<input.length;firstInt++) {
            for (int compareTo = firstInt+1; compareTo < input.length; compareTo++) {
                if (input[firstInt] == input[compareTo]) {
                    if (holdNum !=1) {
                        duplicates = duplicates + 1;

                        holdNum = input[firstInt];
                        break;
                    }else
                        if((input[firstInt] == input[compareTo])&&input[firstInt]>1) {
                         duplicates = duplicates + 1;


                    }
                }
            }
        }*/

        return duplicates;
    }
}

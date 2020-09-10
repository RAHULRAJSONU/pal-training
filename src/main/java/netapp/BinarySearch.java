package netapp;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class BinarySearch {

    public static void main(String[] args) {
//        int[] arr1 = {1, 5, 9, 10, 15, 20};
//        int[] arr2 = {2, 3, 8, 13};
//        for(int el : merge(arr1,arr2)){
//            System.out.print(el+" ");
//        }

        Map<Integer, Employee> emp = new HashMap<>();
        emp.put(1,new Employee(1,"Rahul"));
        emp.put(2,new Employee(2,"Awadhesh"));
        emp.put(3,new Employee(3,"Dinesh"));
        sortByValue(emp).entrySet().forEach((k)->System.out.println(k.getKey()+"-->"+k.getValue()));
    }

    static Map<Integer, Employee> sortByValue(Map<Integer, Employee> map){
        return map.entrySet().stream()
//                .sorted(Map.Entry.comparingByValue((e1,e2)->e1.name.compareTo(e2.name)))
                .sorted((e1,e2)->e1.getValue().name.compareTo(e2.getValue().name))
                .collect(Collectors
                        .toMap(e->e.getKey(),
                                e->e.getValue(),
                                (oldOne,newOne)->oldOne,
                                LinkedHashMap::new)
                );
    }

    static class Employee{
        Integer id;
        String name;

        public Employee(Integer id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    /**
     * sorted rotated array is given like [7,8,9,1,2,3,4,5,6] find the minimum  number .
     */

    /**
     * initially all are closed
     * first-> all will be open
     * second-> 2,4,6
     * third-> 3,6
     * 1,2,3,4,5,6,7,..n
     */

    /**
     * {1, 5, 9, 10, 15, 20}
     * {2, 3, 8, 13}
     */
    static int[] merge(int[] arr1, int[] arr2){
        int[] temp = new int[arr1.length+arr2.length];
        int leftLen = arr1.length;
        int index = 0;
        int left = 0;
        int right = 0;
        int rightLen = arr2.length;
        while (left < leftLen && right < rightLen){
            if(arr1[left] < arr2[right]){
                temp[index] = arr1[left];
                index++;
                left++;
            }else{
                temp[index] = arr2[right];
                index++;
                right++;
            }
        }

        if(left<leftLen){
            while (left<leftLen){
                temp[index] = arr1[left];
                index++;
                left++;
            }
        }else if(right < rightLen){
            while (right < rightLen){
                temp[index] = arr2[right];
                index++;
                right++;
            }
        }

        return temp;
    }


}

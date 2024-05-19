import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lists {
    public static void main(String []args){
        List<Integer> numbers = new ArrayList<>();

        // add items (elements) to the list
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // iteration in list

        for(int number : numbers){
            System.out.println(number);
        }

        // size of list
        int size = numbers.size();
        System.out.println(size);

        // [10,20,30] [0 1 2]
        for(int i=0;i<size;i++){
            System.out.println(i + " : " + numbers.get(i));
        }

        if(numbers.isEmpty()){
            System.out.println("the list is empty");
        }else{
            System.out.println("the list is not empty");
        }

        // remove an element from the list
        numbers.remove(1);

        for(int number : numbers){
            System.out.println(number);
        }
        numbers.remove(Integer.valueOf(30));

        for(int number : numbers){
            System.out.println(number);
        }
    }
}

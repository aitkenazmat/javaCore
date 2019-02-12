package stream;


import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class Reduce {
    public static void main(String[] args) {

        List<Integer> integerList = new LinkedList<>();
        integerList.add(1);integerList.add(2);integerList.add(3);integerList.add(4);integerList.add(5);

        Optional<Integer> result = integerList.stream().reduce((x,y)->x+y);
        Integer sum = integerList.stream().reduce(1,(x,y)->x+y);

        result.ifPresent(res->{
            System.out.println(res);
        });

        System.out.println(sum);

        System.out.println("-----------------------------------------");


        List<String> words = new LinkedList<>();
        words.add("aza");words.add("azamat");words.add("omar");

        Optional<String> strLengthOptional =  words.stream().reduce((total,word)->total+word.length());

        strLengthOptional.ifPresent(s -> {
            System.out.println(s);
        });

        int res = words.stream().reduce(0,
                (total,word)-> total + word.length(),
                (total1,total2) -> total1 + total2);

        System.out.println(res);


    }
}

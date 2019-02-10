package stream;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by WWW on 10.02.2019.
 */
public class GetNewStream {

    public static void main(String[] args) {

        User user1= new User("aza",26,"aza@statdata.kz");
        User user2= new User("araman",26,"ara@statdata.kz");
        User user3= new User("mura",28,"mura@statdata.kz");
        User user4= new User("zhora",31,"zhora@statdata.kz");
        User user5= new User("beka",41,"beka@statdata.kz");
        User user6= new User("beka",41,"beka@statdata.kz");

        List<User> users = new LinkedList<User>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        users.add(user6);


        //get new stream

        Stream<User> userStream = users.stream()
                .filter(user -> user.getName().length()>3 && user.getAge()>26 );
        // .map(user -> user.getName().substring(0,1));

        Stream<User> userStream1 = users.stream()
                .filter(user -> user.getName().length()>3 && user.getAge()>26 );

        userStream.forEach(user -> {
            System.out.println(user.getName());
        });
        System.out.println("---------------------------");

        userStream1.forEach(user -> {
            Stream<String> stringStream = Stream.of(user.getName());

            System.out.println(stringStream.count());
        });
    }
}

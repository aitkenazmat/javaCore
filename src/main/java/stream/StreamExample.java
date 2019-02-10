package stream;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {

        User user1= new User("aza",26,"aza@statdata.kz");
        User user2= new User("araman",26,"ara@statdata.kz");
        User user3= new User("mura",28,"mura@statdata.kz");
        User user4= new User("zhora",31,"zhora@statdata.kz");
        User user5= new User("beka",41,"beka@statdata.kz");

        List<User> users = new LinkedList<User>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);

        //standart method
        int count = 0;
        for ( User user : users) {
            if (user.getName().length()>3)
                count++;
        }

        System.out.println("count = " + count);

        //stream

        long c = users.stream()
                .filter(user-> user.getName().length()>3)
                .count();
        System.out.println("count = "  + c);


    }
}

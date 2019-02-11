package stream;


import java.util.Optional;

public class OptionalType {
    public static void main(String[] args) {

        //example 1
        //Optional<User> userOptional = Optional.empty();
        Optional<User> userOptional = Optional.of(new User("Scot",65,"scot@gh"));
        User user1 = userOptional.orElse(new User("patrik",25,"patrik@cg"));
        User user2 = userOptional.orElseGet(() -> smthMethod());
        //User user3 = userOptional.orElseThrow(IllegalArgumentException::new);
        System.out.println("user1 = " + user1.getName());
        System.out.println("user2 = " + user2.getName());


        //example2

        userOptional.ifPresent(user -> {
            System.out.println("user3 = " + user.getName());
        });

        //success
        if (userOptional.isPresent()) {
            System.out.println(userOptional.get().getName());
        }

        //error
        userOptional.get().getName();


    }

    public static User smthMethod(){
        return new User("Anna",12,"an@lk");
    }
}

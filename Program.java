package OOP_3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        User bigBoss = new User("Большой", "Начальник", 20);
        User litleBoss = new User("Маленький", "Начальничек", 43);
       List<User> users = Arrays.asList(new User[]{new User("Вася", "Иванов", 50),
       new User("Коля", "Сидоров", 28),
       new User("Петя", "Васильев", 38)});
        Personal personal = new Personal(users);
        for (User user: personal) {
            System.out.println(user);
        }
        Collections.sort(users);
        System.out.println(users);
        Company company = new Company(bigBoss);
        litleBoss.setSubordinates(users);
        bigBoss.setSubordinates(Arrays.asList(litleBoss));
        for (User user : company) {
            System.out.println(user);
        }
    }
}
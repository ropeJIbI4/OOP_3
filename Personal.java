package OOP_3 ;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Personal implements Iterable<User> {
    private List<User> users = new ArrayList<>();

    public Personal(List<User> users) {
        this.users = users;
    }

    public Integer size() {
        return users.size();
    }

    @Override
    public Iterator<User> iterator() {

        return new Iterator<User>() {
            private int index = 0;

            @Override
            public User next() {
                return users.get(index++);
            }

            @Override
            public boolean hasNext() {
                return index < users.size();
            }
        };
    }
}
    


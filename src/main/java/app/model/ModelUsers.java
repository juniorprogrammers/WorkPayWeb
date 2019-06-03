package app.model;

import app.entities.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ModelUsers {
    private static ModelUsers instance = new ModelUsers();

    private List<User> model;

    public static ModelUsers getInstance() {
        return instance;
    }

    private ModelUsers() {
        model = new ArrayList<>();
        model.add(new User("admin","admin", "admin"));
        model.add(new User("User","User","TestName"));
    }

    public void add (User user) {
        model.add(user);
    }

    public void del (User user) {model.remove(user);}

    public User getUser (Integer id) {
        return model.get(id);
    }

    public User getAdmin () {
        return this.model.get(0);
    }

    public List<User> getModel() {
        return model;
    }

    public List<String> list (){
        List<String> result = new ArrayList<>();
        for (User user :
                model) {
            result.add(user.getLogin() + " | " + user.getPassword());
        }
        return result;
    }
}

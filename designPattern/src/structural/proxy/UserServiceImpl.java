package structural.proxy;

public class UserServiceImpl implements UserService{
    @Override
    public void saveUser(String username) {
        System.out.println("Saving user: " + username);
    }
}

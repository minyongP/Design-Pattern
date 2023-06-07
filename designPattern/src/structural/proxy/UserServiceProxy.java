package structural.proxy;

public class UserServiceProxy implements UserService{
    private UserService userService;

    public UserServiceProxy(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void saveUser(String username) {
        System.out.println("Before saving user");
        userService.saveUser(username);
        System.out.println("After saving user");
    }
}

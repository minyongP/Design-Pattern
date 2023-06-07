package structural.proxy;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        UserService userServiceProxy = new UserServiceProxy(userService);

        userServiceProxy.saveUser("John");
    }
}

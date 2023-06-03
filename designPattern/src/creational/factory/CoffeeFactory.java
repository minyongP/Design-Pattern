package creational.factory;

public class CoffeeFactory {
    public static Coffee getCoffee(String type, int price) {
        // equalsIgnoreCase(type)를 통해 문자열 비교 기반이지만 Enum 또는 Map을 이용해 if문을 사용하지 않고 매핑 가능하다.
        if ("Latte".equalsIgnoreCase(type)) return new Latte(price);
        else if ("Americano".equalsIgnoreCase(type)) return new Americano(price);
        else return new DefaultCoffee();
    }
}

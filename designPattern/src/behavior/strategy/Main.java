package behavior.strategy;

public class Main {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        Item A = new Item("A", 100);
        Item B = new Item("B", 300);

        shoppingCart.addItem(A);
        shoppingCart.addItem(B);

        // pay by LUNACard
        shoppingCart.pay(new LUNACardStrategy("my@naver.com", "pwd"));

        // pay by CACAOCard
        shoppingCart.pay(new KAKAOcardStrategy("MY", "123456789", "522", "22/5"));
    }
}

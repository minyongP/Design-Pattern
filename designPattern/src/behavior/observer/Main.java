package behavior.observer;

public class Main {
    public static void main(String[] args) {
        Topic topic = new Topic();

        Observer a = new TopicSubscriber("a", topic);
        Observer b = new TopicSubscriber("b", topic);
        Observer c = new TopicSubscriber("c", topic);

        topic.register(a);
        topic.register(a);  // 중복 생성 불가
        topic.register(b);
        topic.register(c);

        topic.postMessage("observer!!");

        topic.unregister(c);    // 구독 취소

        topic.postMessage("out c");
    }
}

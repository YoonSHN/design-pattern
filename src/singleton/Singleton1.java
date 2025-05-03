package singleton;

public class Singleton1 {
    private static Singleton1 instance;

    private Singleton1(){
        System.out.println("지연 초기화 - 인스턴스 생성");
    }

    public static Singleton1 getInstance(){
        if(instance == null){
            instance = new Singleton1(); //최초 요청시 생성
        }
        return instance;
    }
}

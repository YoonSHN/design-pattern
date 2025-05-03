package singleton;

public class Singleton2 { //Holder 방식

    private Singleton2(){
        System.out.println("Holder 방식 생성");
    }
    private static class Holder{
        private static final Singleton2 INSTANCE = new Singleton2();
    }
    public static Singleton2 getInstance(){
        return Holder.INSTANCE;
    }

}

package singleton;

public class Singleton{
    private static Singleton singleton = null;

    private Singleton(){
        System.out.println("인스턴스 생성");
    }

    public static synchronized Singleton getInstance(){ //멀티쓰레드 대빕(synchronized)
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }

    public void maincall(){  //메인 호출용 함수
        TicketMaker maker = TicketMaker.getInstance();
        System.out.println(maker.getMaxTicketNumber());
        System.out.println(maker.getMaxTicketNumber());

        Triple triple1 = Triple.getInstance("ALPHA");
        System.out.println(triple1.toString());

        Triple triple2 = Triple.getInstance("BETA");
        System.out.println(triple2.toString());

        Triple triple3 = Triple.getInstance("GAMMA");
        System.out.println(triple3.toString());

        Triple triple4 = Triple.getInstance("name"); //에러 발생
        System.out.println(triple4.toString());
    }
}
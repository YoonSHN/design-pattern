package singleton;

public class TicketMaker{
    private static int number;

    private TicketMaker(int number){
        this.number = number;
    }
    public static TicketMaker getInstance(){
        TicketMaker maker = new TicketMaker(1000);
        return maker;
    }
    public int getMaxTicketNumber(){
        return number++;
    }
}

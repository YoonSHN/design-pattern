package proxy;

public class Printer implements Printable{
    private String name;

    public Printer(){
        heavyjob("Printer인스턴스 생성 중 ");
    }

    public Printer(String name){
        this.name = name;
        heavyjob("Printer 인스턴스(" + name + ")생성 중");
    }

    @Override
    public void setPrinterName(String name){
        this.name = name;
    }

    @Override
    public String getPrinterName(){
        return name;
    }

    @Override
    public void print(String string){
        System.out.println("=== " + name + " ===");
        System.out.println(string);
    }

    private void heavyjob(String msg){
        System.out.print(msg);
        for(int i = 0;i < 5;++i){
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.print(".");
            }
            System.out.println("완료");
        }
    }
}

package proxy;

public class PrinterProxy implements Printable{
    private String name;
    private Printer real;

    public PrinterProxy(){
        this.name = "No Name";
        this.real = null;
    }

    public PrinterProxy(String name){
        this.name = name;
        this.real = null;
    }

    @Override
    public synchronized void setPrinterName(String name){
        if(real != null){
            real.setPrinterName(name); //본인 설정
        }
        this.name = name;
    }

    @Override
    public String getPrinterName(){
        return name;
    }

    @Override
    public void print(String string){
        realize();
        real.print(string);  //프록시 객체가 실제 객체에 위임하는 위치
    }
    //본인 생성
    private synchronized void realize(){
        if(real == null){
            real = new Printer(name);
        }
    }
}

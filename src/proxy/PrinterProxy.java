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
        real.print(string);
    }
    //본인 생성
    private synchronized void realize(){
        if(real == null){
            real = new Printer(name);
        }
    }
}

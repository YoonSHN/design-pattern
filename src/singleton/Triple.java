package singleton;

public class Triple{
    private static final Triple[] instances = new Triple[3];
    private static final String[] names = {"ALPHA", "BETA", "GAMMA"};

    private String name;

    private Triple(String name){
        this.name = name;
    }

    static{
        for(int i = 0;i < 3;++i){
            instances[i] = new Triple(names[i]);
        }
    }

    public static Triple getInstance(String name){
        for(int i =0;i < 3;++i){
            if(name.equals(instances[i].name)){
                return instances[i];
            }
        }
        throw new IllegalArgumentException("그런 triple은 없습니다.");
    }

    @Override
    public String toString(){
        return "name : "+ name;
    }
}

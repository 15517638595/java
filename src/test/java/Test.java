import cn.edu.zut.servlet.persistent.DBoperator;

public class Test {
    public static  void  main(String...args) {
        DBoperator dBoperator =new DBoperator();
        String name ="spring 4.x";
        dBoperator.insert(name);
    }

}

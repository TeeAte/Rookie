package template_method;
//模版方法设计模式
public abstract class template {

    public void write(){
        System.out.println("共用部分1");
        write1();
        System.out.println("共用部分2");


    }
    public abstract void write1();
}

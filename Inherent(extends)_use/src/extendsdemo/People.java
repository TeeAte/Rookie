package extendsdemo;
//父类
public class People {
    private String name;
    private  String sex;
    String me ="fu";

    public People(String name,String sex){
    this.name=name;
    this.sex=sex;
    }




    public String  getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

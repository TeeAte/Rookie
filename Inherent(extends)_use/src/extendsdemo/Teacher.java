package extendsdemo;


//子类，只用定义特殊的东西
public class Teacher extends People{//继承了public的Get、set方法，私有的不行
    private String skill;
    String me = "Zi";

    public Teacher(String name,String sex){
        this(name,sex,"NULL");//this 用了兄弟构造器，没写skill默认传null
    }

    public Teacher(String name,String sex,String skill){
    super (name, sex);//继承父类构造器
    this.skill=skill;
    }




    public void show(){
        System.out.println(this.me); //调用这个子类的me
        System.out.println(super.me);//调用父类的me
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    @Override
    public String toString() {//一键输出对象内容
        return "Teacher{" +
                "sex='" + sex + '\'' +
                ", skill='" + skill + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}


package modifier;
public class modifier {

private void PrivateMethod(){
    //private method 只可以访问本类
}

void method (){
    //缺省，本类，同一个包的类
}

protected void ProtectedMethod(){
    //本类，同一个包的类，子孙类
}

public void PublicMethod(){
    //都可以
}
}

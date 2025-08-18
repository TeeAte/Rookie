package Interface_demo;

public interface Operate<T> {
    //void add(Student S);万一我要add一个Teacher呢？
    void add(T t);
    void remove(T t);
    void show();
    T query(int Id);//用Id查询对象




}

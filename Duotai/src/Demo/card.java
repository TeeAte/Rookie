package Demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //自动生产getter setter方法
@NoArgsConstructor //生成无参构造器
@AllArgsConstructor//全参构造器

public class card {
    private String id;
    private String name;
    private String phone;
    private Double money;

    public void save(double m){this.money+=m;}
    public void consume(double m){this.money-=m;}


}

package OptionalRT;

import java.util.Optional;
import java.util.function.Predicate;

public class Test01 {
    public static void main(String[] args) {
        String userName = "nick";
        //ofNullable 可以传递null
        //Optional optional = Optional.ofNullable(userName);
        //of不能传递null对象
        //Optional optional = Optional.of(userName);
        //判断当前对象是否为空
        //System.out.println(optional.isPresent());

        //optional 设置默认值
        String str = Optional.ofNullable(userName).orElse("nick");
        System.out.println(str);

        //optional 过滤
        boolean flag = Optional.ofNullable(userName).filter(s -> "nick".equals(s)).isPresent();
        System.out.println("curr res: "+ flag);
    }
}

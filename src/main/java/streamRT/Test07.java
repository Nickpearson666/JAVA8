package streamRT;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Test07 {

    public static void main(String[] args) {
        List<UserEntity> userEntities = new ArrayList<>();
        userEntities.add(new UserEntity("Kevin", 23));
        userEntities.add(new UserEntity("Kevin2", 21));
        userEntities.add(new UserEntity("Kate", 24));
        userEntities.add(new UserEntity("Kate2", 27));
        userEntities.add(new UserEntity("Randell", 22));
        //创建stream流 串行流->单线程
        Stream<UserEntity> stream = userEntities.stream();
        //stream.sorted((a, b)->(b.getAge() - a.getAge())).forEach(System.out::println);
        //stream 操作中 foreach/collect/min/max/allMatch 是终止操作
        stream.sorted((a, b)->(b.getAge() - a.getAge()))
                .filter(a->(a.getName().contains("K"))).limit(2)
                .forEach(System.out::println);

    }
}

package streamRT;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Test06 {
    public static void main(String[] args) {
        List<UserEntity> userEntities = new ArrayList<>();
        userEntities.add(new UserEntity("Kevin", 23));
        userEntities.add(new UserEntity("Kate", 24));
        userEntities.add(new UserEntity("Randell", 25));
        //创建stream流 串行流->单线程
        Stream<UserEntity> stream = userEntities.stream();
//        Stream<UserEntity> userEntityStream = stream.filter((a) -> (a.getAge() >= 24));
//        userEntityStream.forEach(System.out::println);
        //skip 开始 limit结束
        stream.skip(1).limit(2).forEach(user-> System.out.println(user));

    }
}

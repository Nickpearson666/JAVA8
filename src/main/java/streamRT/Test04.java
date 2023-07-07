package streamRT;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class Test04 {
    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(10, 20, 30, 40);
//        Optional<Integer> reduce = integerStream.reduce(new BinaryOperator<Integer>() {
//            @Override
//            public Integer apply(Integer integer, Integer integer2) {
//                return integer + integer2;
//            }
//        });

        Optional<Integer> reduce = integerStream.reduce((a, b)-> (a+b));
        System.out.println(reduce.get());
        //对自定义数据的属性求和
        List<UserEntity> userEntities = new ArrayList<>();
        userEntities.add(new UserEntity("Kevin", 23));
        userEntities.add(new UserEntity("Kate", 24));
        userEntities.add(new UserEntity("Randell", 25));
        //创建stream流 串行流->单线程
        Stream<UserEntity> stream = userEntities.stream();
        Optional<UserEntity> sum = stream.reduce((a, b) -> (new UserEntity("SUM", a.getAge() + b.getAge())));
        System.out.println(sum);

    }
}

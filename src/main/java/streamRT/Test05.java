package streamRT;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Test05 {

    public static void main(String[] args) {
        List<UserEntity> userEntities = new ArrayList<>();
        userEntities.add(new UserEntity("Kevin", 23));
        userEntities.add(new UserEntity("Kate", 24));
        userEntities.add(new UserEntity("Randell", 25));
        //创建stream流 串行流->单线程
        Stream<UserEntity> stream = userEntities.stream();
//        Optional<UserEntity> max = stream.max(Comparator.comparingInt(UserEntity::getAge));
//        System.out.println(max);

        boolean b = stream.anyMatch((a) -> ("Kevin".equals(a.getName())));
        System.out.println(b);


    }
}

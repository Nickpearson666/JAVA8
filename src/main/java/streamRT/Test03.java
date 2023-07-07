package streamRT;
//集合->创建stream流->中间操作->终止操作

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test03 {

    public static void main(String[] args) {
        List<UserEntity> userEntities = new ArrayList<>();
        userEntities.add(new UserEntity("Kevin", 23));
        userEntities.add(new UserEntity("Kate", 24));
        //默认情况下， equals比较两个对象地址是否相等
        userEntities.add(new UserEntity("Randell", 25));
        //userEntities.add(new UserEntity("Randell", 25));
        //创建stream流 串行流->单线程
        Stream<UserEntity> stream = userEntities.stream();
        //创建stream流 并行流->多线程 效率高
        //Stream<UserEntity> parallelStream = userEntities.parallelStream();

        //因为没有重写equals方法，导致set无法有效去重（string类型重写了equals方法）
//        Set<UserEntity> collect = stream.collect(Collectors.toSet());
//        collect.forEach(s-> System.out.println(s +" "+ s.hashCode()));
        //hashset的去重 底层靠map 防止key冲突
//        Set<String> strings = new HashSet<>();
//        strings.add("");
        //list -> map with stream
        Map<String, UserEntity> map = stream.collect(Collectors.toMap(new Function<UserEntity, String>() {
            @Override
            public String apply(UserEntity userEntity) {
                return userEntity.getName();
            }
        }, new Function<UserEntity, UserEntity>() {
            @Override
            public UserEntity apply(UserEntity userEntity) {
                return userEntity;
            }
        }));

//        Map<String, UserEntity> map = stream.collect(Collectors.toMap((userEntity -> userEntity.getName()),
//                userEntity -> userEntity));
        map.forEach((k, v) -> System.out.println(k+" "+v));


    }
}

package lambdaRT;

/**
 * 简化匿名内部类
 *
 */
public interface OldService {
    void get();
    //如果我们当前要使用get()函数， 接口本身无法new,可以用匿名内部类实现
}

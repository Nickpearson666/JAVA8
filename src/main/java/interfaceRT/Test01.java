package interfaceRT;

import interfaceRT.JDK8Interface;
import interfaceRT.JDK8InterfaceImpl;

public class Test01 {

    public static void main(String[] args) {
        JDK8InterfaceImpl jdk8Interface = new JDK8InterfaceImpl();
        jdk8Interface.getName();
        JDK8Interface.getAge();
        System.out.println(jdk8Interface.hashCode());
    }
}

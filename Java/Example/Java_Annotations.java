package Java.Example;

import java.lang.annotation.*;

@Target({ElementType.LOCAL_VARIABLE, ElementType.FIELD})
@interface Human {
    int age() default 0;

    String name() default "Unnamed";

}

public class Java_Annotations {
    @Human(age = 23, name = "Manas")
    int age;
    String name;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        @Human
        Java_Annotations d = new Java_Annotations();
        System.out.println(d.getAge());
        System.out.println(d.getName());
    }
}

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloTest {

    @Test
    public void case01(){
        Hello hello = new Hello();
        String actualResul = hello.sayhi("chai");
        assertEquals("Hello, chai", actualResul);
    }
}

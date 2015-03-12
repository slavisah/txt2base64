package net.hrkac.txt2base64;

import net.hrkac.txt2base64.App;

import org.junit.Test;

public class AppTest {

    @Test
    public void testApp() {
        App.main(new String[] { "src/test/resources/input.txt" });
    }

    @Test
    public void testApp_NoArgument() {
        App.main(new String[] {});
    }
}

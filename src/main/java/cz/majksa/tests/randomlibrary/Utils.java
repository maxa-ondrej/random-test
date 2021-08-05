package cz.majksa.tests.randomlibrary;

import java.nio.charset.StandardCharsets;
import java.util.Random;

public class Utils {

    public static String random(int length) {
        byte[] array = new byte[length];
        new Random().nextBytes(array);
        return new String(array, StandardCharsets.UTF_8);
    }

}

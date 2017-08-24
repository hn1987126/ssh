package cn.jhsoft.test;

import org.junit.Test;

/**
 * Created by chenyi9 on 2017/8/16.
 */
public class MyTest {

    @Test
    public void test(){
        System.out.println("hhaha");

        String str = "{\"time\":\"1503304821.456\", \"client\":\"111.204.243.6\", \"mac\":18:5e:0f:be:87:a5, \"rssi\":-70, \"lat\":25.555, \"lon\":30.334}";
        boolean b = str.matches(".*?\\\"mac\\\"\\:(.*?)\\,.*");
        String str2 = str.replaceAll("(.*?)\\\"mac\\\"\\:(.*?)\\,(.*)", "$1\"mac\":$2$3");
        System.out.println(str2);
        System.out.println(b);
    }

}

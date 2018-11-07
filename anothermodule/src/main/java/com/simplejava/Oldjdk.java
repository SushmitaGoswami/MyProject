package com.simplejava;

import static javax.xml.XMLConstants.XML_NS_PREFIX;
import org.junit.Test;
import com.newjava.*;
import com.mymodule.*;
public class Oldjdk {
    @Test
    public int test()
    {
        Util.print();
        return 1;
    }
    public static void main(String [] args){
        Util.print();
        MyUtil.sayHello();
        System.out.println("hello this is from old java " + XML_NS_PREFIX);
    }
}

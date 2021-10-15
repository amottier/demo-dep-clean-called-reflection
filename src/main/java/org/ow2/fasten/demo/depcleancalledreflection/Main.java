package org.ow2.fasten.demo.depcleancalledreflection;

import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        // We trick DepClean detection by using concat method to build the full class name
        String packageName = "org.slf4j";
        String className = "LoggerFactory";
        String fullClassName = packageName.concat(".").concat(className);
        Class.forName(fullClassName).getMethod("getLogger", String.class).invoke(null,"DemoLogger");
    }
}

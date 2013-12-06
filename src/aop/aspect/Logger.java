package aop.aspect;

/**
 *
 * @author caoxin
 */
public class Logger {
    
    public void info(String ...arg) {
        int length = arg.length;
        String str = "{";
        for (int i = 0; i < length; i++) {
            str += arg[i];
            if (i != (length - 1)) {
                str += ", ";
            } else {
                str += "}";
            }
        }
        System.out.println(str);
    }
    
    public void start(String name) {
        System.out.println(name + " = "+"start select song!");
    }
    
    public void stop(String name) {
        System.out.println(name + " = "+"stop select song.");
    }
    
    public void success(String name) {
        System.out.println(name + " = "+"this selecting song successed");
    }
    
    public void filure(String name) {
        System.out.println(name + " = "+"this selecting song filure!");
    }
}
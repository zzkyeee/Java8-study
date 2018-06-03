import java.awt.event.ActionListener;
import java.util.function.BinaryOperator;
/**
 * @Description: Lambda expression
 * @author: zhangzhikai
 * @date: 2018/6/3 下午11:57
 * @version: V1.0.0
 * @since: JDK 1.8
 */
public class Lambda {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        //1.Orginal start thread
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Starting thread!");
            }
        }).start();

        //2.Use Lambda expressions to start thread
        new Thread(() -> System.out.println("Use Lambda expressions.")).start();

        //3.The following is some examples using Lambda expressions

        //3.1 No arguments using ()
        Runnable r = () -> System.out.println("do something.");

        //3.2 With one argument
        ActionListener actionListener = event -> System.out.println("Trigger event.");

        //3.3 With muti-expressions using {}
        Runnable multiStatement = () -> {
            System.out.println("Use");
            System.out.println("Lambda");
        };

        //3.4 With multi-argument
        BinaryOperator<Long> add = (x,y) -> x + y;

        //3.5 With explicit multi-argument
        BinaryOperator<Long> addExplicit = (Long x,Long y) -> x + y;
    }



}

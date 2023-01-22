package JavaHomeWork.Zadaha;

import java.io.IOException;

public class Presenter {
    LoggerClass log = new LoggerClass();
    
    public void button() throws IOException { 
        int firstAsk = new View().firstAsK();
        log.log("Пользователь выбрал тип чисел");
        if (firstAsk == 1) {
            new RationalOperation().buttonRational();
        } else if (firstAsk == 2) {
            new ComplexOperation().buttonComplex();
        }
    }
}

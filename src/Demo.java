/**
 * Created by zaboev on 08.07.15.
 */
public class Demo {
    static void compute (int a) throws MyExeption {
        if (a ==10) System.out.println("A = 10");
        else
            throw new MyExeption("А вот и описание ошибки");

    }

}

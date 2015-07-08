/**
 * Created by zaboev on 08.07.15.
 */


public class MyExeption  extends Exception {
    private String deteai;
    MyExeption (String a) {
        deteai = a;
    }

    public String toString () {
        return "Ошибка " + deteai;
    }
}

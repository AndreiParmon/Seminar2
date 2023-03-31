//Создать список типа ArrayList<String>.
//Поместить в него как строки, так и целые числа.
//Пройти по списку, найти и удалить целые числа.

package lesson3.task;

import java.util.ArrayList;

public class Task3 {
    public static void Delete() {
        ArrayList ourArray = new ArrayList<String>();
        ourArray.add("qwerty");
        ourArray.add(123);
        ourArray.add("asdfg");
        ourArray.add(456.789);
        System.out.println(ourArray);
        for (int i = 0; i < ourArray.size(); i++) {
            if (ourArray.get(i) instanceof Integer) ourArray.remove(ourArray.get(i));
        }
        System.out.println(ourArray);
    }
}

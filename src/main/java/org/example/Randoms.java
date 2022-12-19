package org.example;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {

    private int min;
    private int max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            Random random = new Random();

            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return min + random.nextInt(max - min);
            }
        };
    }
}
//Реализуйте требуемый интерфейсом Iterable метод,
// для чего вам может понадобиться создать вспомогательный класс
// для итератора (реализующего Iterator<Integer>) по вашему классу.
//Для генерации случайных чисел используйте встроенный класс Random.
//Создайте класс Main, продемонстрируйте работосбособность
// написанного вами класса, например как это было сделано выше.

//}Java уже имеет стандартный интерфейс Iterator, основная часть которого приведена выше.
// Он активно используется в коллекциях и многих других местах, а цикл foreach под капотом
// чаще всего сводится именно к нему.Получив от коллекции объект-итератор, вы через next()
// получаете следующий элемент в переборе, а через hasNext проверяете остались ли ещё
// неперебранные элементы.Iterable - интерфейс для коллекций, по которым можно пройтись итератором.
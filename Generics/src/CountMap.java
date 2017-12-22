import java.util.Map;



public interface CountMap<E> {
    // добавляет элемент в этот контейнер.
    void add(E o);

    //Возвращает количество добавлений данного элемента
    int getCount(E o);

    //Удаляет элемент из контейнера и возвращает количество его добавлений(до удаления)
    int remove(E o);

    //количество разных элементов
    int size();

    //Добавить все элементы из source в текущий контейнер, при совпадении ключей,     суммировать значения
    void addAll(CountMap source);

    //Вернуть java.util.Map. ключ - добавленный элемент, значение - количество его добавлений
    Map<E, Integer> toMap();

    void toMap(Map<? super E, Integer> destination);
}
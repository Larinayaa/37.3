import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Person> persons1 = List.of( //три списка работников
                new Person ("Катя", new Date(22, 9, 1987)),
                new Person("Паша", new Date(15, 2, 1991)),
                new Person("Петя", new Date(16, 3, 1976)),
                new Person("Аня", new Date(1, 10, 2002)),
                new Person("Люда", new Date(19, 12, 1999))
        );
        List<Person> persons2 = List.of(
                new Person("Миша", new Date(20, 5, 1999)),
                new Person("Паша", new Date(15, 2, 1991)),
                new Person("Кирилл", new Date(10, 12, 1992)),
                new Person("Аня", new Date(1, 10, 2002))
        );

        List<Person> persons3 = List.of(
                new Person("Люда", new Date(19, 12, 1999)),
                new Person("Игнат", new Date(17, 11, 1988)),
                new Person("Кирилл", new Date(10, 12, 1992)),
                new Person("Саша", new Date(3, 3, 1995))
        );

        List< List<Person>  > personsList = List.of(persons1,persons2, persons3);
        System.out.println("---СПИСОК 1 ---");
        System.out.println(persons1);
        System.out.println("---СПИСОК 2 ---");
        System.out.println(persons2);
        System.out.println("---СПИСОК 3 ---");
        System.out.println(persons3);
        System.out.println("----------- СКОЛЬКО РАЗ СОТРУДНИК В СПИСКЕ--------------");
        System.out.println(skolkoRaz(personsList));
    }
public static Map<Person, Integer> skolkoRaz(List<List<Person>> lists) {
    Map<Person, Integer> personCountMap = new HashMap<>();
    for (List<Person> list : lists) {
        for (Person person : list) {//считаем сколько раз вошел
            personCountMap.put(person, personCountMap.getOrDefault(person, 0) + 1);
        }
    }

    return personCountMap;}}
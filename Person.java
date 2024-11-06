import java.util.Objects;

public class Person {
    private String name;
    private Date data;

    public Person(String name, Date data) {
        this.name = name;
        this.data = data;
    }

    @Override
    public String toString() {
        return name + " (" + data + ")";
    }

    @Override
    public boolean equals(Object odinakovoe) { //находим одинаковых персон
        if (this == odinakovoe) return true;
        if (odinakovoe == null || getClass() != odinakovoe.getClass()) return false;

        Person person = (Person) odinakovoe;

        if (!Objects.equals(name, person.name)) return false;
        return Objects.equals(data, person.data);
    }
    @Override
    public int hashCode() { //если будут одинаковые значения, будет одинаковый хешкод. вычисляем хешкод обьектов по нейм и дата
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (data != null ? data.hashCode() : 0);
        return result;
    }
}

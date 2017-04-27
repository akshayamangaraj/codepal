import java.util.HashSet;

public class Person {
    public static void main(String[] args) {
        PersonData pd1 = new PersonData("Raheem");
        PersonData pd2 = new PersonData("Dixy");
        PersonData pd3 = new PersonData("Raj");
        PersonData pd4 = new PersonData("Ram");
        PersonData pd5 = new PersonData("Raj");
        PersonData pd6 = new PersonData("Ram");
        HashSet<PersonData> arrl = new HashSet<PersonData>();
        arrl.add(pd1);
        arrl.add(pd2);
        arrl.add(pd3);
        arrl.add(pd4);
        arrl.add(pd5);
        arrl.add(pd6);
        System.out.println(arrl);
    }
}

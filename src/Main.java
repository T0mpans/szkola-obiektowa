//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Osoba osoba = new Uczen();
        System.out.println(osoba.imie);
        osoba.imie="Jaś";
        System.out.println(osoba.imie);
        osoba.setWiek(12);
        System.out.println("wiek: "+osoba.getWiek());
        System.out.println(osoba);
        System.out.println("Liczba uczniów: "+Uczen.getLiczbaUczniow());
        Uczen uczen = new Uczen("Jadwiga", 16, 123);
        Uczen uczen2 = new Uczen("Janush", 17, 1234);
        System.out.println("Liczba uczniów: "+Uczen.getLiczbaUczniow());
        System.out.println(uczen);
        System.out.println(uczen2);

    }
}
import java.util.ArrayList;

public class Klasa {
    private Wychowawca wychowawca;
    private ArrayList<Uczen> uczniowie;
    private String nazwaklasy;
    //myślimy co ta klasa powinna "wiedzieć"


    public Klasa(Wychowawca wychowawca, ArrayList<Uczen> uczniowie, String nazwaklasy) {
        this.wychowawca = wychowawca;
        this.uczniowie = uczniowie;
        this.nazwaklasy = nazwaklasy;
    }

    public Klasa(String nazwaklasy) {
        this.nazwaklasy = nazwaklasy;
        uczniowie = new ArrayList<>();
    }
}

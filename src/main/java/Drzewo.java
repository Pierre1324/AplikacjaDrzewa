import java.util.ArrayList;
import java.util.List;

public abstract class Drzewo {

    protected final Pien pien;

    protected final List<Galaz> galezie;

    protected List<GenerycznyLisc> liscie;

    protected double wspolczynnik;


    public Drzewo(Pien pien, List<Galaz> galezie, List<GenerycznyLisc> liscie) {
        this.pien = pien;
        this.galezie = galezie;
        this.liscie = liscie;
        wspolczynnik = 1;
    }

    public void rosnij(){
        pien.zwiekszSwojRozmiar(wspolczynnik);
    }
    public abstract void zrzucLiscieNaJesien();


    public Pien getPien() {
        return pien;
    }

    public List<GenerycznyLisc> getLiscie() {
        return liscie;
    }
}

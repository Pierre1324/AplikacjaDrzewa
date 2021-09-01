import java.util.ArrayList;
import java.util.List;

public class DrzewoLisciaste extends Drzewo{

    public DrzewoLisciaste(Pien pien, List<Galaz> galezie, List<GenerycznyLisc> liscie) {
        super(pien, galezie, liscie);
        this.wspolczynnik=2;
    }

    @Override
    public void zrzucLiscieNaJesien() {
       liscie = new ArrayList<>();
    }
}

import java.util.List;

public class DrzewoIglaste extends Drzewo{


    public DrzewoIglaste(Pien pien, List<Galaz> galezie, List<GenerycznyLisc> liscie) {
        super(pien, galezie, liscie);
    }


    @Override
    public void zrzucLiscieNaJesien() {
      liscie.removeIf(lisc -> lisc.getPolePowierzchni()<5);
    }


}

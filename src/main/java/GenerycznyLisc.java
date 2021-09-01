public class GenerycznyLisc {

  private final TypLiscia typLiscia;
  private final double polePowierzchni;

    public GenerycznyLisc(TypLiscia typLiscia, double polePowierzchni) {
        this.typLiscia = typLiscia;
        this.polePowierzchni = polePowierzchni;
    }

    public TypLiscia getTypLiscia() {
        return typLiscia;
    }

    public double getPolePowierzchni() {
        return polePowierzchni;
    }
}

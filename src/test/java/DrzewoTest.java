import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DrzewoTest {

    Pien pien;
    List<Galaz> galezie;
    List<GenerycznyLisc> liscieTradycyjne;
    List<GenerycznyLisc> liscieIglaste;

    @BeforeEach
    public void init(){
        pien = new Pien(2, 0.5);
        galezie = Collections.singletonList(new Galaz(10));
        liscieTradycyjne = Arrays.asList(new GenerycznyLisc(TypLiscia.TRADYCYJNY_LISC, 10), new GenerycznyLisc(TypLiscia.TRADYCYJNY_LISC, 10), new GenerycznyLisc(TypLiscia.TRADYCYJNY_LISC, 10));
        liscieIglaste = Arrays.asList(new GenerycznyLisc(TypLiscia.IGLA, 10), new GenerycznyLisc(TypLiscia.IGLA, 3), new GenerycznyLisc(TypLiscia.IGLA, 7));
    }

    @Test
    void rosnij() {
        assertEquals(2,pien.getWysokosc());
        assertEquals(0.5,pien.getPromien());
        Drzewo drzewoLisciaste = new DrzewoLisciaste(pien,galezie, liscieTradycyjne);
        drzewoLisciaste.rosnij();
        assertEquals(4,pien.getWysokosc());
        assertEquals(1,pien.getPromien());
    }


    @Test
    void zrzucLiscieNaJesien(){
        Drzewo drzewoLisciaste = new DrzewoLisciaste(pien,galezie, liscieTradycyjne);
        assertEquals(3,drzewoLisciaste.getLiscie().size());
        drzewoLisciaste.zrzucLiscieNaJesien();
        assertEquals(0,drzewoLisciaste.getLiscie().size());
    }
}
package factoryMethod.naturalNumber;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NaturalNumberTest {
    
    private NaturalNumberHandler handler;
    
    @Before
    public void before() {
        this.handler = new NaturalNumberHandler();
    }

    @Test
    public void naturalNumberEsTest() {
        this.handler.setCreator(new NaturalNumberEsCreator());
        NaturalNumber numero = this.handler.getCreator().createNaturalNumber(1);
        assertEquals("uno", numero.getTextValue());
    }
    
    @Test
    public void naturalNumberEnTest() {
        this.handler.setCreator(new NaturalNumberEnCreator());
        NaturalNumber numero = this.handler.getCreator().createNaturalNumber(1);
        assertEquals("one", numero.getTextValue());
    }
    
    @Test
    public void naturalNumberFrTest() {
        this.handler.setCreator(new NaturalNumberFrCreator());
        NaturalNumber numero = this.handler.getCreator().createNaturalNumber(1);
        assertEquals("un", numero.getTextValue());
    }

}

package packageIngegneria;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import pack.Campanello;
import pack.CampanelloClassico;

class CampanelloFactoryTest {

	@Test
	void test() {
		Campanello campanello1 = CampanelloFactory.creaCampanello("classico");
        
        assertNotNull(campanello1);
        assertTrue(campanello1 instanceof CampanelloClassico);
	}

}

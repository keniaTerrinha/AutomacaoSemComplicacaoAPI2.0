package transferencia;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {
    Cliente xuxa;
    Cliente silvioSantos;
    Conta contaXuxa;
    Conta contaSilvio;
    @BeforeEach
    void setUp() {
        xuxa = new Cliente("Xuxa","12345678900","1111111");
        silvioSantos = new Cliente("Silvio Santos","00987654321","22222");
        contaXuxa = new Conta("0025", "2254",2500.00, xuxa);
        contaSilvio = new Conta("0026","2251",3500.00, silvioSantos);
    }

    @Test
   public void validaNome() {
        assertEquals("Xuxa",xuxa.getNome());
    }

    @Test
    public void validaCpf() {
        assertEquals("12345678900",xuxa.getCpf());
    }

    @Test
    public void validaRg() {
        assertEquals("1111111",xuxa.getRg());
    }
}
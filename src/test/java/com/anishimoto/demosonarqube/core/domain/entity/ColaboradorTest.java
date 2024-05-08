package com.anishimoto.demosonarqube.core.domain.entity;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ColaboradorTest {

    @Test
    public void teste1() {
        Colaborador colaborador = new Colaborador();
        colaborador.setCpf("188.202.600-42");
        assertEquals(colaborador.getCpf(), "188.202.600-42");
    }
}

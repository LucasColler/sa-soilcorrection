package edu.utfpr.cp.dacom.sa.soilcorrection.controle.complemento;

import java.util.Set;

import edu.utfpr.cp.dacom.sa.soilcorrection.controle.nucleo.IFonteNutriente;
import edu.utfpr.cp.dacom.sa.soilcorrection.controle.nucleo.NomeNutrienteAdicional;
import edu.utfpr.cp.dacom.sa.soilcorrection.controle.nucleo.NutrienteAdicional;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum FonteCalcioMagnesio 
        implements IFonteNutriente {

    CALCARIO_DOLOMITICO(30.4, Set.of()),
    CALCARIO_CALCITICO(56.0, Set.of()),
    CALCARIO_CONCHA(54.0, Set.of()),
    GESSO_AGRICOLA(29.0, Set.of(new NutrienteAdicional(NomeNutrienteAdicional.ENXOFRE, 0.15))),
    HIDROXIDO_CALCIO(75.7, Set.of()),
    CALCARIO_MAGNESIANO(35.0, Set.of());

    private final double teorFonte;
    private final Set<NutrienteAdicional> nutrientesAdicionais;

}

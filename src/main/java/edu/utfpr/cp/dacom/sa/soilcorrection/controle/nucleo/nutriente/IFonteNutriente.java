package edu.utfpr.cp.dacom.sa.soilcorrection.controle.nucleo;

import java.util.Set;

public interface IFonteNutriente {
    
    public double getTeorFonte();
    public Set<NutrienteAdicional> getNutrientesAdicionais();
}

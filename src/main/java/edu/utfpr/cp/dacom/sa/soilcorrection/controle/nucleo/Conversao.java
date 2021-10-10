package edu.utfpr.cp.dacom.sa.soilcorrection.controle;

public interface Conversao<T, R> {

    public R converte(T valor);
}

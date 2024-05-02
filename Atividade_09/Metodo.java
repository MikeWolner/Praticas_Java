package Atividade_09;

import Atividade_07.*;


public class Metodo {
    public static void main (String args[]) {
        VetorMenorMaior vmn = new VetorMenorMaior();
        Vetor_soma_par vsp = new Vetor_soma_par();
        Vetor_numero_negativo vnn = new Vetor_numero_negativo();

        vmn.VetorMenor(args);
        vsp.Vetor_par(args);
        vnn.Vetor_negativo();
    }
}

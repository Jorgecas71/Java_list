package dev.jorge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GestorDiasDeLaSemana {

     private List<String> diasDeLaSemana;

    public GestorDiasDeLaSemana() {
        this.diasDeLaSemana = new ArrayList<>();
    }

    public void crearDiasDeLaSemana() {
        diasDeLaSemana.add("Lunes");
        diasDeLaSemana.add("Martes");
        diasDeLaSemana.add("Miércoles");
        diasDeLaSemana.add("Jueves");
        diasDeLaSemana.add("Viernes");
        diasDeLaSemana.add("Sábado");
        diasDeLaSemana.add("Domingo");
    }

    public List<String> getDiasDeLaSemana() {
        return diasDeLaSemana;
    }

    public int getLargoDeLaLista() {
        return diasDeLaSemana.size();
    }

    public void eliminarDiaDeLaSemana(String dia) {
        diasDeLaSemana.remove(dia);
    }

    public String getDiaDeLaSemana(int index) {
        return diasDeLaSemana.get(index);
    }

    public boolean existeDia(String dia) {
        return diasDeLaSemana.contains(dia);
    }

    public void ordenarDias() {
        Collections.sort(diasDeLaSemana);
    }

    public void vaciarLista() {
        diasDeLaSemana.clear();
    }
    
}

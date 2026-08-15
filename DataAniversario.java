import java.util.ArrayList;
import java.util.List;
 
// ─────────────────────────────────────────────
// 1. Classe DataAniversario
// ─────────────────────────────────────────────
class DataAniversario {
 
    private int dia;
    private int mes;
 
    public DataAniversario(int dia, int mes) {
        this.dia = dia;
        this.mes = mes;
    }
 
    public int getDia() { return dia; }
    public int getMes() { return mes; }
 
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof DataAniversario)) return false;
        DataAniversario outra = (DataAniversario) obj;
        return this.dia == outra.dia && this.mes == outra.mes;
    }
 
    @Override
    public String toString() {
        return String.format("%02d/%02d", dia, mes);
    }
}
import java.util.ArrayList;
import java.util.List;

// ─────────────────────────────────────────────
// 2. Criando a Classe Aniversariante
// ─────────────────────────────────────────────
class Aniversariante {
 
    private String nome;
    private DataAniversario dataAniversario;
 
    // Questao 2a - Criando construtor com nome, dia e mes
    public Aniversariante(String nome, int dia, int mes) {
        this.nome = nome;
        this.dataAniversario = new DataAniversario(dia, mes);
    }
 
    // Questao 2b - Criando construtor com nome e DataAniversario encapsulada
    public Aniversariante(String nome, DataAniversario dataAniversario) {
        this.nome = nome;
        this.dataAniversario = dataAniversario;
    }

     public String getNome()                      { return nome; }
    public DataAniversario getDataAniversario()  { return dataAniversario; }

     // Questao 1 - aplicando o metodo equals na classe Aniversariante: true somente se mesmo nome E mesma data
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Aniversariante)) return false;
        Aniversariante outro = (Aniversariante) obj;
        return this.nome.equals(outro.nome)
            && this.dataAniversario.equals(outro.dataAniversario);
    }

     @Override
    public String toString() {
        return nome + " (aniversário: " + dataAniversario + ")";
    }
}
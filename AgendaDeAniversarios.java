import java.util.ArrayList;
import java.util.List;

// ─────────────────────────────────────────────
// 3a. Criando a Interface AgendaDeAniversarios
// ─────────────────────────────────────────────
interface AgendaDeAniversarios {
 
    /** Adiciona um aniversariante a agenda. */
    void adicionarAniversariante(Aniversariante aniversariante);
 
    /** Remove um aniversariante da agenda; retorna true se removido. */
    boolean removerAniversariante(Aniversariante aniversariante);
 
    /** Busca aniversariante pelo nome; retorna null se nao encontrado. */
    Aniversariante buscarPorNome(String nome);
 
    /** Retorna todos os aniversariantes do mes informado (1-12). */
    List<Aniversariante> buscarPorMes(int mes);
 
    /** Retorna uma copia da lista completa de aniversariantes. */
    List<Aniversariante> listarTodos();
 
    /** Retorna o total de aniversariantes cadastrados. */
    int totalAniversariantes();
}

// ─────────────────────────────────────────────
// 3b. Criando a Classe concreta MinhaAgendaDeAniversarios
// ─────────────────────────────────────────────
class MinhaAgendaDeAniversarios implements AgendaDeAniversarios {
 
    // Lista interna de aniversariantes
    private ArrayList<Aniversariante> aniversariantes;
 
    public MinhaAgendaDeAniversarios() {
        this.aniversariantes = new ArrayList<>();
    }
 
    @Override
    public void adicionarAniversariante(Aniversariante aniversariante) {
        aniversariantes.add(aniversariante);
    }
 
    @Override
    public boolean removerAniversariante(Aniversariante aniversariante) {
        // remove(elemento) usa equals internamente - funciona corretamente
        return aniversariantes.remove(aniversariante);
    }
 
    @Override
    public Aniversariante buscarPorNome(String nome) {
        for (int i = 0; i < aniversariantes.size(); i++) {
            if (aniversariantes.get(i).getNome().equalsIgnoreCase(nome)) {
                return aniversariantes.get(i);
            }
        }
        return null;  // nao encontrado
    }
 
    @Override
    public List<Aniversariante> buscarPorMes(int mes) {
        ArrayList<Aniversariante> resultado = new ArrayList<>();
        for (int i = 0; i < aniversariantes.size(); i++) {
            if (aniversariantes.get(i).getDataAniversario().getMes() == mes) {
                resultado.add(aniversariantes.get(i));
            }
        }
        return resultado;
    }
 
    @Override
    public List<Aniversariante> listarTodos() {
        return new ArrayList<>(aniversariantes); // copia defensiva
    }
 
    @Override
    public int totalAniversariantes() {
        return aniversariantes.size();
    }
}
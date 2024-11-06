package list.operacoesBasicas;

public class Tarefa {
    //atributo
    private String descrissao;

    public Tarefa(String descrissao) {
        this.descrissao = descrissao;
    }

    public String getDescrissao() {
        return descrissao;
    }

    @Override
    public String toString() {
        return descrissao;
    }
}

package Associacao_Classes2;

public class Cidade {
    private String nome;
    private String uf;
    private Funcionario[] funcionarios;

    public Cidade(String nome, String uf) {
        this.setNome(nome);
        this.setUf(uf);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public Funcionario[] getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Funcionario[] funcionarios) {
        this.funcionarios = funcionarios;
    }
    // sobrescrevendo método toStrinf(), pois irei imprimir a cidade associada ao funcionário e assim imprimir
    // um represenyação mais significativa
        public String toString(){
        return nome + ", " + uf;
    }
}

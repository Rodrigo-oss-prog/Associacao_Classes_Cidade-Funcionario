package Associacao_Classes2;


public class Main {
    public static void main(String[] args) {

        Cidade cidade = new Cidade("São Carlos", "SP");


        Funcionario func1 = new Funcionario("José Rodrigo", "123456987");
        Funcionario func2 = new Funcionario("Ana Clara", "2255664897");
        Funcionario func3 = new Funcionario("Maria Clara", "6551668999");

        func2.setCidade(cidade);
        func3.setCidade(cidade);
        func1.setCidade(cidade);

        cidade.setFuncionarios(new Funcionario[]{func2, func3, func1});



        Funcionario[] listaFuncionarios = cidade.getFuncionarios();
        for(int i = 0; i < listaFuncionarios.length;i++){
            if (listaFuncionarios[i]!= null){
                System.out.println("Nome: " + listaFuncionarios[i].getNome());
                System.out.println("CPF: " + listaFuncionarios[i].getCpf());
                System.out.println("Cidade: " + listaFuncionarios[i].getCidade());
                System.out.println("_______________________________________");


            }


        }




    }
}
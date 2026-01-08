public class Sistema {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setName("Emerson Matos Oliveira");
        p1.setEmail("emerson@emerson.com.br");
        p1.setTelefone("16998785568");

        Estudante e1 = new Estudante();
        e1.setName("Laura Bonfim Oliveira");
        e1.setEmail("laura@laura.com.br");
        e1.setTelefone("16986365479");
        e1.setNumeroMatricula(1234);
        e1.setCurso("Biologia");

        System.out.println(p1.exibir());
        System.out.println(e1.exibir());
    }
}

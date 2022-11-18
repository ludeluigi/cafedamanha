import java.util.Scanner;

public class PessoaService extends Pessoa {
    public static void adicionarFuncionario(Funcionario f) {
        if (funcionario.contains(f)) {
            System.out.println("Funcionário cadastrado anteriormente");
        } else {
            funcionario.add(f);
            System.out.println("Funcionário Cadastrado");
        }
    }

    public static void adicionarAlimento(Alimento a) {
        if (item.contains(a)) {
            System.out.println("Alimento já foi inserido, por favor escolher outro alimento");
        } else {
            item.add(a);
            System.out.println("Item adicionado");
        }
    }

    public static void preencherFormulario() {
        Scanner scan = new Scanner(System.in);
        Funcionario f1 = new Funcionario();
        System.out.println("Digite seu nome: ");
        String nome = scan.next();
        f1.setNome(nome);
        System.out.println("Digite seu Cpf");
        String cpf = scan.next();
        f1.setCpf(cpf);
        adicionarFuncionario(f1);
        Alimento item1 = new Alimento();
        System.out.println("Digite o item que você levará");
        String item = scan.next();
        item1.setItem(item);
        adicionarAlimento(item1);
    }

    public static void listarCadastros() {

        for (int i = 0; i < funcionario.size(); i++) {

                System.out.printf("%d- %s\n", i, funcionario.get(i));

        }

        for (int i = 0; i < item.size(); i++) {
            System.out.printf("%d- %s\n", i, item.get(i));
        }

    }
}


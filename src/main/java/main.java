import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Scanner scan = new Scanner(System.in);
        System.out.println("Olá, bem vindo ao cadastro para o café da manhã, sua participação é bastante importante para a nossa" +
                "confraternização. Você fará seu cadastro a seguir informando seu nome, cpf e o item escolhido para levar (você poderá levar" +
                "mais de um item (adicione um por vez).");
        System.out.println(" Podemos seguir em frente: 1 - sim  | 2 - não");
        int n = scan.nextInt();
        if (n == 1) {
            do {
                System.out.println("Escolha uma opção: 1 - cadastro formulário  |  2 - listar funcionários e itens | 3 - sair");
                n = scan.nextInt();
                switch (n) {
                    case 1: {
                        PessoaService.preencherFormulario();
                        break;
                    }
                    case 2: {
                        PessoaService.listarCadastros();
                        break;
                    }
                    default:
                        System.out.println("Até Mais");
                        break;
                }

            } while (n != 3);
            //System.out.println("você pode fechar, até mais!");
        }
    }

}


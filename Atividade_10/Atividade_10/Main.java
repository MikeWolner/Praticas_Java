package Atividade_10;

import java.util.Scanner;

class PessoaFisica {
    private String nome;
    private String CPF;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getCPF() {
        return CPF;
    }
}

class PessoaJuridica {
    private String nome;
    private String CNPJ;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getCNPJ() {
        return CNPJ;
    }
}

class Cadastro {
    private PessoaFisica[] pessoasFisicas;
    private PessoaJuridica[] pessoasJuridicas;
    private int numPessoasFisicas;
    private int numPessoasJuridicas;

    public Cadastro(int tamanhoMaximo) {
        pessoasFisicas = new PessoaFisica[tamanhoMaximo];
        pessoasJuridicas = new PessoaJuridica[tamanhoMaximo];
        numPessoasFisicas = 0;
        numPessoasJuridicas = 0;
    }

    public void cadastrarPessoaFisica(String nome, String CPF) {
        PessoaFisica pessoa = new PessoaFisica();
        pessoa.setNome(nome);
        pessoa.setCPF(CPF);
        pessoasFisicas[numPessoasFisicas++] = pessoa;
    }

    public void cadastrarPessoaJuridica(String nome, String CNPJ) {
        PessoaJuridica pessoa = new PessoaJuridica();
        pessoa.setNome(nome);
        pessoa.setCNPJ(CNPJ);
        pessoasJuridicas[numPessoasJuridicas++] = pessoa;
    }

    public void imprimirPessoasFisicas() {
        System.out.println("Pessoas Físicas:");
        for (int i = 0; i < numPessoasFisicas; i++) {
            System.out.println("Nome: " + pessoasFisicas[i].getNome() + ", CPF: " + pessoasFisicas[i].getCPF());
        }
    }

    public void imprimirPessoasJuridicas() {
        System.out.println("Pessoas Jurídicas:");
        for (int i = 0; i < numPessoasJuridicas; i++) {
            System.out.println("Nome: " + pessoasJuridicas[i].getNome() + ", CNPJ: " + pessoasJuridicas[i].getCNPJ());
        }
    }

    public void pesquisarPorCPF(String CPF) {
        for (int i = 0; i < numPessoasFisicas; i++) {
            if (pessoasFisicas[i].getCPF().equals(CPF)) {
                System.out.println("Pessoa Física encontrada:");
                System.out.println("Nome: " + pessoasFisicas[i].getNome() + ", CPF: " + pessoasFisicas[i].getCPF());
                return;
            }
        }
        System.out.println("Pessoa Física não encontrada.");
    }

    public void pesquisarPorCNPJ(String CNPJ) {
        for (int i = 0; i < numPessoasJuridicas; i++) {
            if (pessoasJuridicas[i].getCNPJ().equals(CNPJ)) {
                System.out.println("Pessoa Jurídica encontrada:");
                System.out.println("Nome: " + pessoasJuridicas[i].getNome() + ", CNPJ: " + pessoasJuridicas[i].getCNPJ());
                return;
            }
        }
        System.out.println("Pessoa Jurídica não encontrada.");
    }

    public void atualizarPorCPF(String CPF, String novoNome) {
        for (int i = 0; i < numPessoasFisicas; i++) {
            if (pessoasFisicas[i].getCPF().equals(CPF)) {
                pessoasFisicas[i].setNome(novoNome);
                System.out.println("Nome atualizado com sucesso.");
                return;
            }
        }
        System.out.println("Pessoa Física não encontrada.");
    }

    public void atualizarPorCNPJ(String CNPJ, String novoNome) {
        for (int i = 0; i < numPessoasJuridicas; i++) {
            if (pessoasJuridicas[i].getCNPJ().equals(CNPJ)) {
                pessoasJuridicas[i].setNome(novoNome);
                System.out.println("Nome atualizado com sucesso.");
                return;
            }
        }
        System.out.println("Pessoa Jurídica não encontrada.");
    }

    public void excluirPorCPF(String CPF) {
        for (int i = 0; i < numPessoasFisicas; i++) {
            if (pessoasFisicas[i].getCPF().equals(CPF)) {
                // Movendo a última pessoa para a posição atual e diminuindo o contador
                pessoasFisicas[i] = pessoasFisicas[numPessoasFisicas - 1];
                pessoasFisicas[numPessoasFisicas - 1] = null;
                numPessoasFisicas--;
                System.out.println("Pessoa Física excluída com sucesso.");
                return;
            }
        }
        System.out.println("Pessoa Física não encontrada.");
    }

    public void excluirPorCNPJ(String CNPJ) {
        for (int i = 0; i < numPessoasJuridicas; i++) {
            if (pessoasJuridicas[i].getCNPJ().equals(CNPJ)) {
                // Movendo a última pessoa para a posição atual e diminuindo o contador
                pessoasJuridicas[i] = pessoasJuridicas[numPessoasJuridicas - 1];
                pessoasJuridicas[numPessoasJuridicas - 1] = null;
                numPessoasJuridicas--;
                System.out.println("Pessoa Jurídica excluída com sucesso.");
                return;
            }
        }
        System.out.println("Pessoa Jurídica não encontrada.");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cadastro cadastro = new Cadastro(100); // Supondo um limite máximo de 100 pessoas físicas e jurídicas

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Cadastrar Pessoa Física");
            System.out.println("2. Cadastrar Pessoa Jurídica");
            System.out.println("3. Imprimir Pessoas Físicas");
            System.out.println("4. Imprimir Pessoas Jurídicas");
            System.out.println("5. Pesquisar por CPF");
            System.out.println("6. Pesquisar por CNPJ");
            System.out.println("7. Atualizar por CPF");
            System.out.println("8. Atualizar por CNPJ");
            System.out.println("9. Excluir por CPF");
            System.out.println("10. Excluir por CNPJ");
            System.out.println("11. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome da pessoa física:");
                    String nomePF = scanner.nextLine();
                    System.out.println("Digite o CPF:");
                    String cpf = scanner.nextLine();
                    cadastro.cadastrarPessoaFisica(nomePF, cpf);
                    break;
                case 2:
                    System.out.println("Digite o nome da pessoa jurídica:");
                    String nomePJ = scanner.nextLine();
                    System.out.println("Digite o CNPJ:");
                    String cnpj = scanner.nextLine();
                    cadastro.cadastrarPessoaJuridica(nomePJ, cnpj);
                    break;
                case 3:
                    cadastro.imprimirPessoasFisicas();
                    break;
                case 4:
                    cadastro.imprimirPessoasJuridicas();
                    break;
                case 5:
                    System.out.println("Digite o CPF a ser pesquisado:");
                    String cpfPesquisa = scanner.nextLine();
                    cadastro.pesquisarPorCPF(cpfPesquisa);
                    break;
                case 6:
                    System.out.println("Digite o CNPJ a ser pesquisado:");
                    String cnpjPesquisa = scanner.nextLine();
                    cadastro.pesquisarPorCNPJ(cnpjPesquisa);
                    break;
                case 7:
                    System.out.println("Digite o CPF a ser atualizado:");
                    String cpfAtualizacao = scanner.nextLine();
                    System.out.println("Digite o novo nome:");
                    String novoNomePF = scanner.nextLine();
                    cadastro.atualizarPorCPF(cpfAtualizacao, novoNomePF);
                    break;
                case 8:
                    System.out.println("Digite o CNPJ a ser atualizado:");
                    String cnpjAtualizacao = scanner.nextLine();
                    System.out.println("Digite o novo nome:");
                    String novoNomePJ = scanner.nextLine();
                    cadastro.atualizarPorCNPJ(cnpjAtualizacao, novoNomePJ);
                    break;
                case 9:
                    System.out.println("Digite o CPF a ser excluído:");
                    String cpfExclusao = scanner.nextLine();
                    cadastro.excluirPorCPF(cpfExclusao);
                    break;
                case 10:
                    System.out.println("Digite o CNPJ a ser excluído:");
                    String cnpjExclusao = scanner.nextLine();
                    cadastro.excluirPorCNPJ(cnpjExclusao);
                    break;
                case 11:
                    System.out.println("Encerrando o programa...");
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        
    }
}
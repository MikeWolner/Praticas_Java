package Atividade_11;

class Poo {
    private String nome;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

class PessoaFisica extends Pessoa {
    private String CPF;

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getCPF() {
        return CPF;
    }
    
    @Override
    public String toString() {
        return "Nome: " + getNome() + ", CPF: " + getCPF();
    }
}

class PessoaJuridica extends Pessoa {
    private String CNPJ;

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getCNPJ() {
        return CNPJ;
    }
    
    @Override
    public String toString() {
        return "Nome: " + getNome() + ", CNPJ: " + getCNPJ();
    }
}

class Cadastro {
    private Pessoa[] pessoas;
    private int numPessoas;

    public Cadastro(int tamanhoMaximo) {
        pessoas = new Pessoa[tamanhoMaximo];
        numPessoas = 0;
    }

    public void cadastrarPessoa(Pessoa pessoa) {
        pessoas[numPessoas++] = pessoa;
    }

    public void imprimirCadastro() {
        System.out.println("Cadastro:");
        for (int i = 0; i < numPessoas; i++) {
            System.out.println(pessoas[i].toString());
        }
    }

    public void imprimirPessoasFisicas() {
        System.out.println("Pessoas Físicas:");
        for (int i = 0; i < numPessoas; i++) {
            if (pessoas[i] instanceof PessoaFisica) {
                System.out.println(pessoas[i].toString());
            }
        }
    }

    public void imprimirPessoasJuridicas() {
        System.out.println("Pessoas Jurídicas:");
        for (int i = 0; i < numPessoas; i++) {
            if (pessoas[i] instanceof PessoaJuridica) {
                System.out.println(pessoas[i].toString());
            }
        }
    }

    public void pesquisarPorCPFouCNPJ(String identificador) {
        System.out.println("Resultados da pesquisa para " + identificador + ":");
        for (int i = 0; i < numPessoas; i++) {
            if (pessoas[i] instanceof PessoaFisica) {
                PessoaFisica pessoaFisica = (PessoaFisica) pessoas[i];
                if (pessoaFisica.getCPF().equals(identificador)) {
                    System.out.println(pessoaFisica.toString());
                }
            } else if (pessoas[i] instanceof PessoaJuridica) {
                PessoaJuridica pessoaJuridica = (PessoaJuridica) pessoas[i];
                if (pessoaJuridica.getCNPJ().equals(identificador)) {
                    System.out.println(pessoaJuridica.toString());
                }
            }
        }
    }

    public void atualizarPessoa(String identificador, String novoNome) {
        for (int i = 0; i < numPessoas; i++) {
            if (pessoas[i] instanceof PessoaFisica) {
                PessoaFisica pessoaFisica = (PessoaFisica) pessoas[i];
                if (pessoaFisica.getCPF().equals(identificador)) {
                    pessoaFisica.setNome(novoNome);
                    System.out.println("Nome atualizado com sucesso.");
                    return;
                }
            } else if (pessoas[i] instanceof PessoaJuridica) {
                PessoaJuridica pessoaJuridica = (PessoaJuridica) pessoas[i];
                if (pessoaJuridica.getCNPJ().equals(identificador)) {
                    pessoaJuridica.setNome(novoNome);
                    System.out.println("Nome atualizado com sucesso.");
                    return;
                }
            }
        }
        System.out.println("Pessoa não encontrada.");
    }

    public void excluirPessoa(String identificador) {
        for (int i = 0; i < numPessoas; i++) {
            if (pessoas[i] instanceof PessoaFisica) {
                PessoaFisica pessoaFisica = (PessoaFisica) pessoas[i];
                if (pessoaFisica.getCPF().equals(identificador)) {
                    // Movendo a última pessoa para a posição atual e diminuindo o contador
                    pessoas[i] = pessoas[numPessoas - 1];
                    pessoas[numPessoas - 1] = null;
                    numPessoas--;
                    System.out.println("Pessoa excluída com sucesso.");
                    return;
                }
            } else if (pessoas[i] instanceof PessoaJuridica) {
                PessoaJuridica pessoaJuridica = (PessoaJuridica) pessoas[i];
                if (pessoaJuridica.getCNPJ().equals(identificador)) {
                    // Movendo a última pessoa para a posição atual e diminuindo o contador
                    pessoas[i] = pessoas[numPessoas - 1];
                    pessoas[numPessoas - 1] = null;
                    numPessoas--;
                    System.out.println("Pessoa excluída com sucesso.");
                    return;
                }
            }
        }
        System.out.println("Pessoa não encontrada.");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cadastro cadastro = new Cadastro(100); // Supondo um limite máximo de 100 pessoas no cadastro

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Cadastrar Pessoa Física");
            System.out.println("2. Cadastrar Pessoa Jurídica");
            System.out.println("3. Imprimir Cadastro");
            System.out.println("4. Imprimir Pessoas Físicas");
            System.out.println("5. Imprimir Pessoas Jurídicas");
            System.out.println("6. Pesquisar por CPF ou CNPJ");
            System.out.println("7. Atualizar pessoa por CPF ou CNPJ");
            System.out.println("8. Excluir pessoa por CPF ou CNPJ");
            System.out.println("9. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    PessoaFisica pessoaFisica = new PessoaFisica();
                    System.out.println("Digite o nome da pessoa física:");
                    pessoaFisica.setNome(scanner.nextLine());
                    System.out.println("Digite o CPF:");
                    pessoaFisica.setCPF(scanner.nextLine());
                    cadastro.cadastrarPessoa(pessoaFisica);
                    break;
                case 2:
                    PessoaJuridica pessoaJuridica = new PessoaJuridica();
                    System.out.println("Digite o nome da pessoa jurídica:");
                    pessoaJuridica.setNome(scanner.nextLine());
                    System.out.println("Digite o CNPJ:");
                    pessoaJuridica.setCNPJ(scanner.nextLine());
                    cadastro.cadastrarPessoa(pessoaJuridica);
                    break;
                case 3:
                    cadastro.imprimirCadastro();
                    break;
                case 4:
                    cadastro.imprimirPessoasFisicas();
                    break;
                case 5:
                    cadastro.imprimirPessoasJuridicas();
                    break;
                case 6:
                    System.out.println("Digite o CPF ou CNPJ a ser pesquisado:");
                    String identificador = scanner.nextLine();
                    cadastro.pesquisarPorCPFouCNPJ(identificador);
                    break;
                case 7:
                    System.out.println("Digite o CPF ou CNPJ da pessoa a ser atualizada:");
                    String identificadorAtualizacao = scanner.nextLine();
                    System.out.println("Digite o novo nome:");
                    String novoNome = scanner.nextLine();
                    cadastro.atualizarPessoa(identificadorAtualizacao, novoNome);
                    break;
                case 8:
                    System.out.println("Digite o CPF ou CNPJ da pessoa a ser excluída:");
                    String identificadorExclusao = scanner.nextLine();
                    cadastro.excluirPessoa(identificadorExclusao);
                    break;
                case 9:
                    System.out.println("Encerrando o programa...");
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}



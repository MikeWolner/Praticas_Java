package Atividade_10;
import java.util.Scanner;

public class CadastroVeiculos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Veiculo[] veiculos = new Veiculo[10];
        int contador = 0;

        while (true) {
            System.out.println("\nSelecione a opcao:");
            System.out.println("1. Cadastrar veiculos");
            System.out.println("2. Pesquisar veiculos por chassi ou placa");
            System.out.println("3. Atualizar veiculos por chassi ou placa");
            System.out.println("4. Excluir veiculos por chassi ou placa");
            System.out.println("5. Exibir todos os veiculos cadastrados");
            System.out.println("6. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o numero do chassi:");
                    String numeroChassi = scanner.nextLine();
                    System.out.println("Digite a placa:");
                    String placa = scanner.nextLine();
                    System.out.println("Digite a marca:");
                    String marca = scanner.nextLine();
                    System.out.println("Digite o modelo:");
                    String modelo = scanner.nextLine();
                    System.out.println("Digite o ano:");
                    int ano = scanner.nextInt();
                    scanner.nextLine();

                    Veiculo novoVeiculo = new Veiculo(numeroChassi, placa, marca, modelo, ano);
                    veiculos[contador] = novoVeiculo;
                    contador++;
                    break;

                case 2:
                    System.out.println("Digite o numero do chassi ou a placa do veiculo:");
                    String chavePesquisa = scanner.nextLine();
                    pesquisarVeiculo(veiculos, contador, chavePesquisa);
                    break;

                case 3:
                    System.out.println("Digite o numero do chassi ou a placa do veiculo:");
                    String chaveAtualizacao = scanner.nextLine();
                    atualizarVeiculo(veiculos, contador, chaveAtualizacao, scanner);
                    break;

                case 4:
                    System.out.println("Digite o numero do chassi ou a placa do veiculo:");
                    String chaveExclusao = scanner.nextLine();
                    excluirVeiculo(veiculos, contador, chaveExclusao);
                    contador--;
                    break;

                case 5:
                    exibirVeiculos(veiculos, contador);
                    break;

                case 6:
                    System.out.println("Saindo");
                    return;

                default:
                    System.out.println("Opcao invalida");
                    break;
            }
        }
    }

    public static void pesquisarVeiculo(Veiculo[] veiculos, int contador, String chave) {
        boolean encontrado = false;
        for (int i = 0; i < contador; i++) {
            Veiculo veiculo = veiculos[i];
            if (veiculo.getNumeroChassi().equals(chave) || veiculo.getPlaca().equals(chave)) {
                System.out.println("veiculo encontrado:");
                System.out.println(veiculo);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("veiculo nao encontrado.");
        }
    }

    public static void atualizarVeiculo(Veiculo[] veiculos, int contador, String chave, Scanner scanner) {
        boolean encontrado = false;
        for (int i = 0; i < contador; i++) {
            Veiculo veiculo = veiculos[i];
            if (veiculo.getNumeroChassi().equals(chave) || veiculo.getPlaca().equals(chave)) {
                System.out.println("Veículo encontrado:");
                System.out.println(veiculo);
                System.out.println("Digite os novos dados do veículo:");
    
                System.out.println("Digite o novo número do chassi:");
                String novoChassi = scanner.nextLine();
                System.out.println("Digite a nova placa:");
                String novaPlaca = scanner.nextLine();
                System.out.println("Digite a nova marca:");
                String novaMarca = scanner.nextLine();
                System.out.println("Digite o novo modelo:");
                String novoModelo = scanner.nextLine();
                System.out.println("Digite o novo ano:");
                int novoAno = scanner.nextInt();
                scanner.nextLine();
    
                veiculo.setNumeroChassi(novoChassi);
                veiculo.setPlaca(novaPlaca);
                veiculo.setMarca(novaMarca);
                veiculo.setModelo(novoModelo);
                veiculo.setAno(novoAno);
    
                System.out.println("veiculo atualizado com sucesso.");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("veiculo nao encontrado.");
        } 
    }
    public static void excluirVeiculo(Veiculo[] veiculos, int contador, String chave) {
        boolean encontrado = false;
        for (int i = 0; i < contador; i++) {
            Veiculo veiculo = veiculos[i];
            if (veiculo.getNumeroChassi().equals(chave) || veiculo.getPlaca().equals(chave)) {
                for (int j = i; j < contador - 1; j++) {
                    veiculos[j] = veiculos[j + 1];
                }
                veiculos[contador - 1] = null;
                System.out.println("Veículo excluído com sucesso.");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Veículo não encontrado.");
        }
    }
    public static void exibirVeiculos(Veiculo[] veiculos, int contador) {
        if (contador == 0) {
            System.out.println("Nenhum veículo cadastrado.");
            return;
        }
        System.out.println("Veículos cadastrados:");
        for (int i = 0; i < contador; i++) {
            System.out.println(veiculos[i]);
        }
    }
}

class Veiculo {
    private String numeroChassi;
    private String placa;
    private String marca;
    private String modelo;
    private int ano;

    public Veiculo(String numeroChassi, String placa, String marca, String modelo, int ano) {
        this.numeroChassi = numeroChassi;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getNumeroChassi() {
        return numeroChassi;
    }

    public void setNumeroChassi(String numeroChassi) {
        this.numeroChassi = numeroChassi;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "numeroChassi='" + numeroChassi + '\'' +
                ", placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                '}';
    }
}


import java.util.Scanner;

public class Notas {
    public static void main(String [] args){
    Scanner myObj = new Scanner(System.in);
    
    double avgNota = 0.0;
    int qHiNota = 0,
        reprov = 0,
        hiNota = 0,
        lowNota = 100,

        qAlunos = 0,
        qNota = 0,
        faltas = 0;

    int nota = 0;
    do{        
        //Coleta
        System.out.println("-------------------------------------");
        System.out.println("Digite a nota do aluno");
        nota = myObj.nextInt();
        System.out.println("Digite a quantidade de faltas");
        faltas = myObj.nextInt();

        //Filtros
        if(nota > 0){
            if (nota >= 90) {qHiNota++;}
            if (nota < 70 || faltas >= 20) {reprov++;}
            if (nota > hiNota) {hiNota = nota;}
            if (nota < lowNota) {lowNota = nota;}
            qAlunos++;
            qNota += nota;
        }
    } while (nota >= 0);

        avgNota = qNota / qAlunos;

        System.out.println("Quantidade de aluno com nota maior que 90: "+qHiNota);
        System.out.println("Quantidade de alunos que reprovaram: "+reprov);
        System.out.println("Maior nota: "+ hiNota + " Menor nota: " + lowNota);
        System.out.println("Media de notas da turma: " + avgNota);

        myObj.close();
    }
}

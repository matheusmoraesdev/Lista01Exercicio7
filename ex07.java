     import java.util.Scanner;

public class ex07 {
    public static void main(String [] args) {
    // Declaração das variáveis
    double area,area_dobro;
    int lado;

    //Passo 1: fazer a entrada dos dados
    Scanner reader = new Scanner(System.in);
        System.out.print("Qual o tamanho do lado de seu quadrado ? ");
            lado = reader.nextInt();
        reader.close();
  
    // Passo 2: Calcular o quadrado
        area = lado * lado;
        area_dobro = area * 2;

    
    // Passo 3: exibir a resposta para o usuário

    System.out.println("O dobro da área de seu quadrado é: " + area_dobro);
            




    }


    
}

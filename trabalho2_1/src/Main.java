import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;

public class Main {

public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

       // System.out.printf("Informe o nome de arquivo texto:\n");
        //String nome = ler.nextLine();
        String nome = "C:\\Users\\35191\\Desktop\\TRABALHO2\\trabalho2_1\\src\\teste.txt.txt";
        int i = 0;
        int j = 0;
        System.out.printf("\nConteúdo do arquivo texto:\n");
        try {
        FileReader arq = new FileReader(nome);
        BufferedReader lerArq = new BufferedReader(arq);
        String linha = lerArq.readLine();

        while (linha != null){
                if(linha){
                i++;}
                if(linha.contentEquals("}")){
                        j++;
                }
                if(i==j)
                {
                        System.out.println("TRUE");
                }

        System.out.printf("%d|%d %s\n",i ,j, linha);

        linha = lerArq.readLine(); // lê da segunda até a última linha

        }
        System.out.println();


                arq.close();
        } catch (IOException e) {
        System.err.printf("Erro na abertura do arquivo: %s.\n",
        e.getMessage());
        }


        System.out.println();
        }
        }


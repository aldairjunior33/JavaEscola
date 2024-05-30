package src.Escola;

import java.util.Scanner;

public class App {
    Scanner texto = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");

        Disciplina disciplina1 = new Disciplina();
    
        disciplina1.getNome("Matematica");
        disciplina1.getCargaHoraria(10 );

        System.out.println("Professor : " + disciplina1.setNome());
        System.out.println("Carga Horaria : " + disciplina1.setCargaHoraria() + " hrs");
        
        // Testando scanner
        String textoString = "Maria Silva";
        Scanner texto = new Scanner(textoString);
        System.out.println("Nome: " + textoString);
        texto.close(); //Encerra o programa

    }
}

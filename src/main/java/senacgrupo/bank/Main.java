/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package senacgrupo.bank;
import java.util.Scanner;
/**
 *
 * @author Erick
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        int opcao;
        do{
        System.out.println("#Bem vindo ao BANCO     #");
        System.out.println("#########################");
        System.out.println("#Digite uma opção       #");
        System.out.println("#1 - Transferência Pix  #");
        System.out.println("#2 - Pagamentos         #");
        System.out.println("#3 - Investimento       #");
        System.out.println("#4 - Sair               #");
        opcao = ler.nextInt();

        
        }while(opcao!=4);
    }
    
}

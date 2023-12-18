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
        
        switch(opcao){
            case 1:
                String chave;
                int opcao_chave = 0;
                do{
                System.out.println("#Digite uma opção de chave       #");
                System.out.println("#1 - Telefone                    #");
                System.out.println("#2 - CPF/CNPJ                    #");
                System.out.println("#3 - Email                       #");
                System.out.println("#4 - Chave aleatória             #");
                System.out.println("#5 - Voltar                      #");
                opcao_chave = ler.nextInt();
                if(opcao_chave == 5){
                    break;
                }
                else{
                    System.out.println("Digite a chave:");
                    ler.next();
                    System.out.println("Digite a chave novamente");
                    chave = ler.next();
                    break;
                }
                } while(opcao_chave != 5);
                break;
                case 2:
                System.out.println("Cole o Qr code do boleto a ser pago: ");
                ler.nextLine();
                String code = ler.nextLine();
                System.out.println("\ninforme o valor: ");
                float valor=ler.nextFloat();
                System.out.println("\nInforme a data do pagamento: ");
                ler.nextLine();
                String data = ler.nextLine();
                System.out.println("\nInforme a hora entre 8 e 16? ");
                int hora = ler.nextInt();
                System.out.println("\n\nRECIBO");
                System.out.println("Qr code: "+code);
                System.out.println("Valor pago: "+valor);
                System.out.println("Data pagamento: "+data);
                System.out.println("Hora do pagamento: "+hora);
                break;
                
                
                case 3:
                    int opcao_invest = 0;
                    float valor_aplicacao = 0;
                    do{
                    
                    System.out.println("#Digite uma opção         #");
                    System.out.println("#1 Aplicar dinheiro       #");
                    System.out.println("#2 Checar saldo investido #");
                    System.out.println("#3 Voltar                 #");
                    opcao_invest = ler.nextInt();
                    if(opcao_invest == 3){
                    
                        break;
                    }
                    else if(opcao_invest == 1){
                        
                    System.out.println("# Digite o valor que quer aplicar: R$ ");
                    valor_aplicacao = ler.nextFloat();
                    aplicacao +=  valor_aplicacao;
                        System.out.println("##########################");
                        System.out.println("Valor aplicado com sucesso!");
                        System.out.println("##########################");
                        System.out.println(" ");
                    }
                    else if(opcao_invest == 2){
                        System.out.println("##########################");
                        System.out.println("#Valor aplicado: R$" + aplicacao);
                        System.out.println("##########################");
                                
                        System.out.println(" ");
                    }
                        
                    } while(opcao_invest != 3);
                     break;

                // ESCREVA AQUI NO MEIO OS OUTROS CASES 
                
                
                
                
                
                
                

                // ESCREVA AQUI NO MEIO OS OUTROS CASES 
                
        }

        
        }while(opcao!=4);
    }
    
}

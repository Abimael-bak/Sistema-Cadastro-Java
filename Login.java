
package login;
import java.util.Scanner;
import java.util.Locale;
public class Login {
           private static String nome;
           private static String senha;
           private static int idade;
           private static String cpf;
           private static String nome1;
           private static String senha1;
          
       public static void teste(){
            Scanner cad2 = new Scanner(System.in);
            Locale.setDefault(Locale.US);
           System.out.println("Digite seu nome :");
           nome1=cad2.nextLine();
           System.out.println("Digite sua senha :");
           senha1=cad2.nextLine();
           
       }
       public static void cadastrar(){
           Scanner cad = new Scanner(System.in);
          
           System.out.println("Digite seu nome :");
           nome=cad.nextLine();
           System.out.println("Digite sua senha :");
           senha=cad.nextLine();
           System.out.println("Digite sua idade :");
           idade=cad.nextInt();
           cad.nextLine();
           System.out.println("Digite seu CPF :");
           cpf=cad.nextLine();
           
       }
       public static String acesso(){
            String dados;
            dados = "Nome: "+ nome + "\n" + "Senha: "+ senha + "\n" + "Idade: "+idade+ "\n"+ "CPF: "+ cpf;
            return dados;
       }
      
    public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);
            System.out.println("Ola, Seja bem vindo");
            System.out.println(" 1-ENTRAR\n 2-CADASTRAR\n 3-NOVA SENHA \n 4-SAIR");
             int valor = ler.nextInt();
      while(valor != 4){
            if(valor ==  1){
            teste();
                if(nome1.equals(nome) && senha1.equals(senha)){
                    
                      System.out.println(acesso());
                      System.out.println(" 1-ENTRAR\n 2-CADASTRAR\n 3-NOVA SENHA \n 4-SAIR");
                      valor = ler.nextInt(); 
                }else{ 
                  System.out.println("Você não tem cadastro");
                   System.out.println(" 1-ENTRAR\n 2-CADASTRAR\n 3-NOVA SENHA \n 4-SAIR");
                      valor = ler.nextInt();  
                }  
            }else if(valor == 2){
                cadastrar();
                 System.out.println(" 1-ENTRAR\n 2-CADASTRAR\n 3-NOVA SENHA \n 4-SAIR");
                      valor = ler.nextInt();  
                     
              
            }else if(valor == 3){
                Scanner ler2 = new Scanner(System.in);
                String senha2 ;
                System.out.println("Digite sua senha antiga:");
                senha2=ler2.nextLine();
                if(senha2.equals(senha)){
                     System.out.println("Digite a nova senha:");
                     senha=ler2.nextLine();
                     System.out.println(" 1-ENTRAR\n 2-CADASTRAR\n 3-NOVA SENHA \n 4-SAIR");
                      valor = ler.nextInt();  
                }else{
                    System.out.println("senha incorreta");
                    System.out.println(" 1-ENTRAR\n 2-CADASTRAR\n 3-NOVA SENHA \n 4-SAIR");
                      valor = ler.nextInt();  
                }
            }
            
      }   
    }
    
}

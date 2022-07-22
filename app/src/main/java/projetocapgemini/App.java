// inicio
package projetocapgemini;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
       String nomeProduto;
       float precoCusto;
       float precoVenda;
       
       float totalCusto = 0;
       float totalVenda = 0;
       
       Scanner leitor = new Scanner(System.in);
       
        int i = 0;
        for(; i < 40; i++){
            
            System.out.println("Digite o nome do produto");
            nomeProduto = leitor.nextLine();
            
            System.out.println("Digite o preco de custo do produto");
            precoCusto = leitor.nextFloat();
            
            System.out.println("Digite o preco de venda");
            precoVenda = leitor.nextFloat();
            
            totalCusto = totalCusto + precoCusto;
            totalVenda = totalVenda + precoVenda;
            
            if(precoCusto == precoVenda) {
                System.out.println("houve um empate no preco");
            }else{
                if(precoCusto > precoVenda){
                    System.out.println("Houve um prejuizo");
                }else{
                    System.out.println("Houve lucro");
                }
            }
            
            System.out.println(nomeProduto + ", "
                    + "preco de custo - " + precoCusto + 
                    ", preco de venda - " + precoVenda);
        }   
        
        System.out.println("O total do preco de custo é de: " + 
                (totalCusto / i));
        System.out.println("O total do preco de venda é de: " + 
                (totalVenda / i));
    }
}
package BinaryTree;

   //testando elementos da arvore pre-ordem, em-ordem, pos-ordem, onde 15 é a raiz
   //e 10 o nó da direita
public class Teste {
    
    public static void main(String[] args) {

        BinaryTree no = new BinaryTree(15, new BinaryTree(10, null, null), 
                new BinaryTree(50, new BinaryTree(20, null, null), null));
        
        System.out.println("Pre-ordem: ");
        no.preOrdem(no);
        System.out.println(" ");
        
        System.out.println("Em-ordem: ");
        no.emOrdem(no);
        System.out.println(" ");
        
         System.out.println("Pos-ordem: ");
        no.posOrdem(no);
        System.out.println(" ");
    }
}

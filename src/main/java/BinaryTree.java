
public class BinaryTree {
    
    private int valor;
    private BinaryTree esquerda;
    private BinaryTree direita;
    
    BinaryTree(int valor, BinaryTree esquerda, BinaryTree direita){
        this.valor    = valor;
        this.esquerda = esquerda;
        this.direita  = direita;
        
    }
    //imprime elemento a partir da raiz 
    public static void preOrdem(BinaryTree n){
        System.out.println(n.valor);
        
        if(n.esquerda != null){
            preOrdem(n.esquerda);
        }
        
        if(n.direita != null){
            preOrdem(n.direita);
        }
    }
    //imprime elemento a ordenado
    public static void emOrdem(BinaryTree n){
        if(n.esquerda != null){
            emOrdem(n.esquerda);
        }
        
        System.out.println(n.valor);
       
        if(n.direita != null){
            emOrdem(n.direita);
        }
    }
    //imprime elemento começandos dos nós até a raiz
    public static void posOrdem(BinaryTree n){
        if(n.esquerda != null){
            emOrdem(n.esquerda);
        }
    
        if(n.direita != null){
            emOrdem(n.direita);
        }
        System.out.println(n.valor);
    }
}

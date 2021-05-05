
package banco;


public class Banco {


    public static void main(String[] args) {
      
        Cliente c1 = new Cliente("Gabriel","Rua 274", "070.305.439-20", 18);
        System.out.println(c1.getNome());
        System.out.println(c1.getEnederco());
        System.out.println(c1.getCpf());
        System.out.println(c1.getIdade());
        
        Banco2 b2 = new Banco2();
        b2.teste();
        
    }
    
    
    
    
    
}

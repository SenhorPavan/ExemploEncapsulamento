package banco;

public class Banco2 {

    public void teste(){
         Cliente c1 = new Cliente("Gabriel", "Rua 274", "070.305.439-20", 18);

    c1.setCpf("514.524.236-45");
    c1.setNome("Relampago Marquinhos");
    c1.setEnederco("Lá na Puta que Pariu");
    c1.setIdade(69);
        System.out.println(c1.getNome());
        System.out.println(c1.getEnederco());
        System.out.println(c1.getCpf());
        System.out.println(c1.getIdade());
    }    
}

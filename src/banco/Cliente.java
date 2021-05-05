
package banco;


public class Cliente {

    public Cliente(String nome, String enederco, String cpf, int idade) {
        this.nome = nome;
        this.enederco = enederco;
        this.cpf = cpf;
        this.idade = idade;
    }
       
    private String nome;
    private String enederco;
    private String cpf;
    private int idade;

    public String getNome() {
        return this.nome;
    }

    public String getEnederco() {
        return this.enederco;
    }

    public String getCpf() {
        return this.cpf;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setNome(String nome) {
        validaCpf();
        this.nome = nome;
    }

    public void setEnederco(String enederco) {
        validaCpf();
        this.enederco = enederco;
    }

    public void setCpf(String cpf) {
        validaCpf();
        this.cpf = cpf;
    }

    public void setIdade(int idade) {
        validaCpf();
        this.idade = idade;
    }
    
    public void validaCpf(){
        
    }
            
}

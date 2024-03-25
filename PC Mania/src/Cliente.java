public class Cliente {
    public String nome;
    public String cpf;
    public Computador computador= new Computador();
    public float calculaTotalCompra(){
        return computador.preco;

    }
}


public class Cliente {
    public String nome;
    public String cpf;
    Computador[] pscComprados= new Computador[10];
    float totalcompra=0;

    public float calculaTotalCompra(){
        for (int i = 0; i< pscComprados.length; i++){
            if (pscComprados[i] != null){
                totalcompra=totalcompra+pscComprados[i].preco;
            }
        }
        return totalcompra;
    }
}


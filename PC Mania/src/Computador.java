public class Computador {
    // atributos
    public String marca;
    public float preco;
    public SistemaOperacional sistemaOperacional;
    public HardwareBasico hardwareBasico;
    public MemoriaUSB memoriaUSB = new MemoriaUSB();

    // construtor
    public Computador() {
        sistemaOperacional= new SistemaOperacional();

        hardwareBasico = new HardwareBasico();
    }
    // metodos
    public void mostraPCConfigs(){
        System.out.println("Marca:"+marca);
        System.out.println("preco:"+preco);
        System.out.println("Nome do Sistema Operacional:"+sistemaOperacional.nome);
        System.out.println("Tipo do Sistema Operacional:"+sistemaOperacional.tipo);
        System.out.println("Nome do Hardware:"+hardwareBasico.nome);
        System.out.println("Capacidade do Hardware:"+hardwareBasico.capacidade);

    }
    public void addMemoriaUSB(MemoriaUSB usbNova){
        memoriaUSB.nome= usbNova.nome;
        memoriaUSB.capacidade= usbNova.capacidade;
    }


}

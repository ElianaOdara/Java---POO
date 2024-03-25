import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner entradadedados= new Scanner(System.in);
        Computador pc1 = new Computador();
        Computador pc2 = new Computador();
        Computador pc3 = new Computador();
        Computador[] pscComprados= new Computador[10];
        MemoriaUSB usbNova = new MemoriaUSB();
        Cliente novoCliente= new Cliente();

        // inserindo dados do Cliente
        novoCliente.nome="Eliana";
        novoCliente.cpf="12345";


        usbNova.nome = "Pendrive";
        usbNova.capacidade = 16;

        // inserindo dados do PC1
        pc1.marca= "Positivo";
        pc1.preco= 3300f;
        pc1.hardwareBasico.nome= "Pentium Core i3 (2200 Mhz)";
        pc1.hardwareBasico.capacidade = 500f;
        pc1.sistemaOperacional.nome= "Sistema Operacional Linux Ubuntu";
        pc1.sistemaOperacional.tipo= 32;
        pc1.addMemoriaUSB(usbNova);

        // inserindo dados do PC2
        usbNova.capacidade = 32;
        pc2.marca= "Acer";
        pc2.preco= 8800f;
        pc2.hardwareBasico.nome= "Pentium Core i5 (3370 Mhz)";
        pc2.hardwareBasico.capacidade = 16f;
        pc2.sistemaOperacional.nome= "Sistema Operacional Windows 8";
        pc2.sistemaOperacional.tipo= 64;
        pc2.addMemoriaUSB(usbNova);

        // inserindo dados do PC3
        usbNova.capacidade = 1;
        usbNova.nome = "HD Externo";
        pc3.marca= "Vaio";
        pc3.preco= 4800f;
        pc3.hardwareBasico.nome= "Pentium Core i7 (4500 Mhz)";
        pc3.hardwareBasico.capacidade = 32f;
        pc3.sistemaOperacional.nome= "Sistema Operacional Windows 10";
        pc3.sistemaOperacional.tipo= 64;
        pc3.addMemoriaUSB(usbNova);

        float totalcompra = 0;

        // menu de Controle
        boolean controle=true;
        while(controle==true){
            int opcao;
            System.out.println("Digite a opcao de compra: ");
            opcao= entradadedados.nextInt();
            entradadedados.nextLine();

            switch (opcao){
                case 1:
                    System.out.println("Voce adquiriu o computador 1");
                    totalcompra= totalcompra+pc1.preco;
                    for (int i = 0; i<pscComprados.length; i++){
                        if (pscComprados[i] == null) {
                            pscComprados[i] = pc1;

                        }
                    }

                    break;
                case 2:
                    System.out.println("Voce adquiriu o computador 2");
                    totalcompra= totalcompra+pc2.preco;
                    for (int i = 0; i<pscComprados.length; i++){
                        if (pscComprados[i] == null) {
                            pscComprados[i] = pc2;

                        }
                    }

                    break;
                case 3:
                    System.out.println("Voce adquiriu o computador 3");
                    totalcompra= totalcompra+pc3.preco;
                    for (int i = 0; i<pscComprados.length; i++){
                        if (pscComprados[i] == null) {
                            pscComprados[i] = pc3;

                        }
                    }

                    break;
                case 0:
                    controle= false;
                    break;

            }
        }

        System.out.println("Cliente: " + novoCliente.nome);
        System.out.println("cpf: " + novoCliente.cpf);
        System.out.println("Informacoes dos pcs adquiridas:");
        for (int i = 0; i< pscComprados.length; i++){
            if (pscComprados[i] != null){
                pscComprados[i].mostraPCConfigs();
            }
        }
        System.out.println("Total: " + totalcompra);

    }
}
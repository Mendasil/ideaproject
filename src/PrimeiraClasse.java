import java.util.Scanner;

public class PrimeiraClasse {
    public static void main(String[] args){
        String nome = "";
        String sobreNome = "";
        double saldo = 150;
        double valorUtil = 0;
        double valorUtil2 = 0;
        String contiSN = "S";
        Scanner digitaDados = new Scanner(System.in);
        byte opcao = 0;

        while(opcao != 4) {
            System.out.println("""
                        Digite a oção desejada:
                        1 - Consultar saldo;
                        2 - Transferir valor;
                        3 - Efetuar depósito;
                        4 - Sair.
                        """);
            opcao = digitaDados.nextByte();
            switch (opcao){
                case 1:
                    System.out.println("Valor em conta é de "+saldo+"\n");
                    break;
                case 2:
                    System.out.println("Qual o valor a transferir?");
                    valorUtil = digitaDados.nextDouble();
                    if(valorUtil > saldo){
                        System.out.println("Saldo insuficiente e você não tem cheque especial." +
                                "Efetue outros depósitos ou digite um valor menor.\n");
                        break;
                    }else{

                        saldo -= valorUtil;
                        System.out.println(String.format("Valor de %.2f transferido com sucesso. Novo saldo: %.2f.\n",
                                valorUtil,
                                saldo));
                        break;
                    }
                case 3:
                    System.out.println("Qual o valor a receber?");
                    valorUtil = digitaDados.nextDouble();
                    saldo += valorUtil;
                    System.out.println(String.format("Valor de %.2f recebido com sucesso. Novo saldo: %.2f.\n",
                            valorUtil,
                            saldo));
                    break;
                case 4:
                    System.out.println("Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Digite novamente!\n");
            }
            System.out.println("Digite seu nome");
//            nome = digitaDados.nextLine();
//
//            System.out.println("\nDigite o valor em conta");
//            saldo = digitaDados.nextDouble();
//
//            System.out.println(String.format("\n%s, seu saldo em conta é de %.2f", nome, saldo));
//
//            digitaDados.nextLine();
//
//            System.out.println("\nGostaria de continuar (S/N)");
//            contiSN = digitaDados.nextLine();
//
//            if(contiSN.equalsIgnoreCase("N"))
//                break;
//            else
//                System.out.print("\n");
        }
    }
}
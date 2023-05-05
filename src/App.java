import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        

        double metragem;

        System.out.print("Entre com a metragem a ser pintada em M2: ");
        Scanner teclado = new Scanner(System.in);
        metragem = teclado.nextDouble();
        teclado.close();

        
        double rendimentoLitros = 6;
        double precoLata = 80.00;
        double volumeLatalitros = 18;

        double precoGalao = 25.00;
        double volumeDoGalao = 3.6; 

        double quantidadeLatas = metragem / (rendimentoLitros * volumeLatalitros);
        double valorTotalLatas = quantidadeLatas * precoLata;

        double quantidadoGaloes = metragem / (volumeDoGalao * rendimentoLitros );
        double valorTotalGaloes = quantidadoGaloes * precoGalao;

        
        double metragemMistura = metragem * 1.1;
        double quantidadeLatasMistura = metragemMistura / (rendimentoLitros * volumeLatalitros);
        double quantidadeLatasMisturaArrendondada = Math.ceil(metragemMistura /( rendimentoLitros * volumeLatalitros));
        double quantidadeDesperdicioDaLata = quantidadeLatasMisturaArrendondada - quantidadeLatasMistura;
        double quantidadeLitrosAConverterEmGaloes = (1 - quantidadeDesperdicioDaLata) * volumeLatalitros;
        double quantidadeGaloesArrendondada = Math.ceil(quantidadeLitrosAConverterEmGaloes/ volumeDoGalao);
        double quantidadeEmLataFinal = Math.floor(quantidadeLatasMistura);

        System.out.printf(" A metragem a ser pintade é de %f metros quadrados", metragem);
        System.out.println("");
        System.out.printf("A quantidae de latas é %f e o valor total em latas é %f " , quantidadeLatas, valorTotalLatas);
        System.out.println("");
        System.out.printf("A quantidae de galões é %f e o valor total em galões é %f " , quantidadoGaloes, valorTotalGaloes);
        System.out.println("");
        System.out.printf(" A metragem para mistura é igual a %f", metragemMistura);
        System.out.println("");
        System.out.printf("A quantidade de latas para mistura é %f", quantidadeLatasMistura);
        System.out.println("");
        System.out.printf("A quantidade de latas para mistura arrendondada é %f", quantidadeLatasMisturaArrendondada);
        System.out.println("");
        System.out.printf("A quantidade desperdicio na lata  %f", quantidadeDesperdicioDaLata);
        System.out.println("");
        System.out.printf("A quantidade em litros a ser utilizada em galões é  %f", quantidadeLitrosAConverterEmGaloes);
        System.out.println("");
        System.out.printf("A quantidade arrendondada em galões é  %f", quantidadeGaloesArrendondada);
        System.out.println("");
        System.out.printf("A quantidade final em latas  é  %f e em galões %f", quantidadeEmLataFinal, quantidadeGaloesArrendondada);
    }
}

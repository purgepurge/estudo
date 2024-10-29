public class App {
    public static void main(String[] args) {
        double maiorLucro = 0;
        double maiorPrejuizo = 0;
        double total = 0;
        double[] array = {12.5, 2.7, 5, -74.7, -24.4, 108, -97.4, 52.5, 12.7, 7.5, 12.5, -5.7};

        for(double valor : array) {
            if(valor > maiorLucro) {
                maiorLucro = valor;
            } else if(valor < maiorPrejuizo) {
                maiorPrejuizo = valor;
            }

            total += valor;
        }

        System.out.println("Maior lucro mensal do ano R$" + maiorLucro);
        System.out.println("Maior prejuizo mensal do ano R$" + maiorPrejuizo);


        if(total > 0) {
            System.out.println("Houve lucro anual");
        } else if(total < 0) {
            System.out.println("Houve prejuizo anual");
        } else {
            System.out.println("Nao houve prejuizo nem lucro");
        }
    }
}

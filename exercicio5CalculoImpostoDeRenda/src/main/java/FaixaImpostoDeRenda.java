public class FaixaImpostoDeRenda {

    public static int calcularFaixaImposto(double salario){
        if(salario <= 2.112){
            return  1;
        } else if (salario >= 2112.01 && salario <= 2826.66) {
            return  2;
        } else if (salario >= 2826.67 && salario <= 3751.06) {
            return  3;
        } else if (salario >= 3751.07 && salario <= 4664.68) {
            return  4;
        } else {
            return 5;
        }
    }
}

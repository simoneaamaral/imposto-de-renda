public class ImpostoDeRenda {
    private Pessoa pessoa;

    public ImpostoDeRenda(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public double calcular(){
        double salario = pessoa.getSalario();
        double imposto = 0;
        if(salario <= 2.112){
            imposto = 0;
        } else if (salario >= 2112.01 && salario <= 2826.66) {
            imposto = (salario * 0.075) - 158.40;
        } else if (salario >= 2826.67 && salario <= 3751.06) {
            imposto = (salario * 0.15) - 370.40;
        } else if (salario >= 3751.07 && salario <= 4664.68) {
            imposto = (salario * 0.225) - 651.73;
        } else {
            imposto = (salario * 0.275) - 884.96;
        }
        return imposto;
    }

    public void imprimir(){
        double imposto = calcular();
        int faixa = FaixaImpostoDeRenda.calcularFaixaImposto(pessoa.getSalario());
        System.out.format("\n" + pessoa.getNome() + " seu salário é R$ " + String.format("%.2f",pessoa.getSalario()) + "\nSua faixa de imposto é " + faixa + "\nO valor do imposto de renda a ser pago é R$" + String.format("%.2f",imposto) + "\n");
    }


}


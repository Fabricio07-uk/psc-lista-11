
public class SistemaVeiculos {

    public static void main(String[] args) {
        
        Veiculo carro = new Carro("Fiat", "Argo", 2020);
        Veiculo moto = new Moto("Yamaha", "Nmax", 2024);
        Veiculo caminhao = new Caminhao("Volvo", "FH 540", 2020);

        System.out.println("--- Teste Carro ---");
        carro.exibirDetalhes();
        carro.acelerar();
        System.out.println("-------------------");

        System.out.println("--- Teste Moto ---");
        moto.exibirDetalhes();
        moto.acelerar();
        System.out.println("------------------");

        System.out.println("--- Teste Caminhão ---");
        caminhao.exibirDetalhes();
        caminhao.acelerar();
        System.out.println("----------------------");
    }
}

abstract class Veiculo {
    
    protected String marca;
    protected String modelo;
    protected int ano;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void exibirDetalhes() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
    }
    
    public abstract void acelerar();
}

class Carro extends Veiculo {

    public Carro(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public void acelerar() {
        int segundosAceleracao = 8;
        
        System.out.printf("%s %s está acelerando de 0 a 100 km/h em %d segundos.\n", 
            this.modelo, this.marca, segundosAceleracao);
    }
}

class Moto extends Veiculo {

    public Moto(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public void acelerar() {
        System.out.printf("%s %s está acelerando e empinando a roda dianteira!\n", 
            this.modelo, this.marca);
    }
}

class Caminhao extends Veiculo {

    public Caminhao(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public void acelerar() {
        System.out.printf("%s %s está engrenando a próxima marcha e acelerando lentamente.\n", 
            this.modelo, this.marca);
    }
}
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String ambiente = Arrays.toString(args);
        System.out.println(ambiente);
        if(ambiente.contains("DEV") ){
            System.out.println("Rodando a aplicação no ambiente de desenvolvimento");
        } else if (ambiente.contains("PRD")) {
            System.out.println("Rodando a aplicação no ambiente de produção");
        } else {
            System.out.println("Ambiente não encontrado");
        }
    }
}
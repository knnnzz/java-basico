public class MinhaClasse {
    public static void main(String[] args) {
        System.out.println("Olá, mundo!");

        String primeiroNome = "Kauan";
        String segundoNome = "Alves";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome); //cria uma váriavel e passa pra ela um método, que está com parametro
        System.out.println(nomeCompleto);

        String meuNome = "Kauan"; 
        int anoFabricacao = 2025;

        boolean verdadeiro = true;



        System.out.println(meuNome + " " + anoFabricacao + " " + verdadeiro);
    }
    
    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome); //Método pra concatenar a primeira palavra e dar um espaço entre elas

    }
}

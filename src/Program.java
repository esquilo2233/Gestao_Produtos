public class Program {
    private Parser parser;

    public Program(){
        parser=new Parser();
    }
    public void Start(){
        printWelcome();
    }
    private void printWelcome() {
        System.out.println();
        System.out.println("Bem Vindo!");
        System.out.println("Deseja fazer Login ou vai fazer o registo na nossa plataforma?");
    }
}

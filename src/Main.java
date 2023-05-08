// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Account a = new Account("cenas","123","cenas@op.pt");
        User u =new User(a);
        u.authenticate("cenas","12");
    }
}
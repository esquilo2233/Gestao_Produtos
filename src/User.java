public class User implements Authentication {
    private Account account;

    // construtor
    public User(Account account) {
        this.account = account;
    }

    // método para autenticar usuário
    @Override
    public String authenticate(String username, String password) {
        if (account.getPassword().equals(password) && account.getUsername().equals(username)) {
            return "Login bem sucedido";
        }else {
            return "Errou em algum campo";
        }
    }
}

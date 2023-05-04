public class User implements Authentication{
    private Account account;

    // construtor
    public User(Account account) {
        this.account = account;
    }

    // método para autenticar usuário
    @Override
    public boolean authenticate(String username, String password) {
        return account.getUsername().equals(username) && account.getPassword().equals(password);
    }
}

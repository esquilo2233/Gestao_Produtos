public class User implements Authentication {
    private Account account;

    // construtor
    public User(Account account) {
        this.account = account;
    }

    // método para autenticar usuário
    @Override
    public Boolean authenticate(String username, String password) {
        return account.getPassword().equals(password) && account.getUsername().equals(username);
    }
}

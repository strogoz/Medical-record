package Client;

/**
 * Класс, реализующий пользователя
 */
public class User {

    /**
     * логин пользователя
     */
    private String login;

    /**
     * Пароль пользователя
     */
    private String password;

    /**
     * Установить логин пользователя
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * установить пароль пользователя
     */
    public void setPassword(String password) {
        this.password = password;
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    /**
     * Получить логин пользователя
     * @return логин
     */
    public String getLogin() {
        return login;
    }

    /**
     * Получить пароль пользователя
     * @return пароль
     */
    public String getPassword() {
        return password;
    }
}
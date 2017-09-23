package Client;

/**
 * Класс, реализующий пользователя
 */
public class User {

    /**
     * Логин пользователя
     */
    private String login;
    /**
     * Пароль пользователя
     */
    private String password;
    /**
     * Роль пользователя
     */
    private String role;
    /**
     * Строка типа пользователя "администратор"
     */
    public static final String ADMIN = "admin";
    /**
     * Установить логин пользователя
     */
    public void setLogin(String login) {
        this.login = login;
    }
    /**
     * Установить пароль пользователя
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Установить роль пользователя
     * @param role роль
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * Конструктор
     * @param login логин пользователя
     * @param password пароль пользователя
     */
    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    /**
     * Пустой конструктор
     */
    public User() {
        login = null;
        password = null;
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

    /**
     * Получить роль пользователя
     * @return роль
     */
    public String getRole() {
        return role;
    }
}
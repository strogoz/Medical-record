/**
 * �����, ����������� ������������
 */
public class User {

    /**
     * ����� ������������
     */
    private String login;

    /**
     * ������ ������������
     */
    private String password;

    /**
     * ���������� ����� ������������
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * ���������� ������ ������������
     */
    public void setPassword(String password) {
        this.password = password;
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    /**
     * �������� ����� ������������
     * @return �����
     */
    public String getLogin() {
        return login;
    }

    /**
     * �������� ������ ������������
     * @return ������
     */
    public String getPassword() {
        return password;
    }
}
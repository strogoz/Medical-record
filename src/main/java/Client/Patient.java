package Client;

/**
 * Класс, реализующий пациента
 */
public class Patient extends User {

    /**
     * Строка типа пользователя
     */
    private final static String STRING_ROLE_OF_USER = "Patient";
    /**
     * Полное имя пациента
     */
    private String fullName;
    /**
     * Дата рождения пациента
     */
    private String dateOfBirthday;
    /**
     * Номер телефона пациента
     */
    private int phoneNumber;

    /**
     * Конструктор
     * @param login логин
     * @param password пароль
     * @param fullName полное имя
     * @param dateOfBirthday дата рождения
     * @param phoneNumber номер телефона
     */
    public Patient(String login, String password, String fullName, String dateOfBirthday, int phoneNumber){
        super(login,password);
        this.fullName = fullName;
        this.dateOfBirthday = dateOfBirthday;
        this.phoneNumber = phoneNumber;
    }

    /**
     * Получить ФИО пациента
     * @return полное имя
     */
    public String getFullName() {
        return fullName;
    }
    /**
     * Получить дату рождения пациента
     * @return дата рождения
     */
    public String getDateOfBirthday() {
        return dateOfBirthday;
    }
    /**
     * Получить номер телефона пациента
     * @return номер телефона
     */
    public int getPhoneNumber() {
        return phoneNumber;
    }
    /**
     * Установить ФИО пациента
     * @param fullName полное имя
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    /**
     * Установить дату рождения пациента
     * @param dateOfBirthday дата рождения
     */
    public void setDateOfBirthday(String dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }
    /**
     * Установить номер телефона пациента
     * @param phoneNumber номер телефона
     */
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}


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

    public Patient(String login, String password, String fullName, String dateOfBirthday, int phoneNumber){
        super(login,password);
        this.fullName = fullName;
        this.dateOfBirthday = dateOfBirthday;

    }
}


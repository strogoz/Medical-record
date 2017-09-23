package Client;

/**
 * Класс, реализующий врача
 */
public class Doctor extends User{

    /**
     * Строка типа пользователя
     */
    private static final String STRING_ROLE_OF_USER = "Doctor";
    /**
     * Полное имя врача
     */
    private String fullName;
    /**
     * Специальность врача
     */
    private String specialty;
    /**
     * Категория врача
     */
    private int category;
    /**
     * Номер кабинета врача
     */
    private int doctorIffice;

    /**
     * Конструктор
     * @param login логин
     * @param password пароль
     * @param fullName ФИО
     * @param specialty специальность
     * @param category категория
     * @param doctorIffice номер кабинета
     */
    public Doctor(String login, String password, String fullName, String specialty, int category, int doctorIffice) {
        super(login, password);
        this.fullName = fullName;
        this.specialty = specialty;
        this.category = category;
        this.doctorIffice = doctorIffice;
    }

    /**
     * Получить ФИО врача
     * @return ФИО
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Получить специальность врача
     * @return специальность
     */
    public String getSpecialty() {
        return specialty;
    }

    /**
     * Получить категорию врача
     * @return категория
     */
    public int getCategory() {
        return category;
    }

    /**
     * Получить номер кабинета врача
     * @return номер кабинета
     */
    public int getDoctorIffice() {
        return doctorIffice;
    }

    /**
     * Установить ФИО врача
     * @param fullName ФИО
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * Установить специальность врача
     * @param specialty специальность
     */
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    /**
     * Установить категорию врача
     * @param category категория
     */
    public void setCategory(int category) {
        this.category = category;
    }

    /**
     * Установить номер кабинета врача
     * @param doctorIffice номер кабинета
     */
    public void setDoctorIffice(int doctorIffice) {
        this.doctorIffice = doctorIffice;
    }
}

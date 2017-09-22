public class Patient extends User {

    /**
     * ������ ���� ������������
     */
    private final static String STRING_ROLE_OF_USER = "Patient";
    /**
     * ������ ��� ��������
     */
    private String fullName;
    /**
     * ���� �������� ��������
     */
    private String dateOfBirthday;
    /**
     * ����� �������� ��������
     */
    private int phoneNumber;

    public Patient(String login, String password, String fullName, String dateOfBirthday, int phoneNumber){
        super(login,password);
        this.fullName = fullName;
        this.dateOfBirthday = dateOfBirthday;

    }
}

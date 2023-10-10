package homeWork.hw_3;

public class UserData {
    private String surname;
    private String firstName;
    private String patronymic;
    private String dateOfBirth;
    private String phoneNumber;
    private String gender;

    public UserData(String surname, String firstName, String patronymic, String dateOfBirth,
                    String phoneNumber, String gender) {
        this.surname = surname;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return surname + firstName + patronymic + " " + dateOfBirth + " " + phoneNumber + gender;
    }
}


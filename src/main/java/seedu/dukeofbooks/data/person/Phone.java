package seedu.dukeofbooks.data.person;
import seedu.dukeofbooks.data.exception.IllegalValueException;

public class Phone {
    public final String INVALID_PHONE_NUMBER = "The phone number supplied is not valid in Singapore";
    private int number;

    public Phone(int number) throws IllegalValueException {
        setNumber(number);
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int newNumber) throws IllegalValueException {
        // Perform checks if number is 8 number long
        if (newNumber<10000000) {
            throw new IllegalValueException(INVALID_PHONE_NUMBER);
        }
        number = newNumber;
    }
}

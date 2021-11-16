package ss11_dsa_stack_queue.bai_tap.demerging;

import java.time.LocalDate;



public class Data {
    protected String name;
    protected boolean isMale;
    protected LocalDate dayOfBirth;

    protected Data() {
    }

    protected Data(String name, boolean isMale, LocalDate dayOfBirth) {
        this.name = name;
        this.isMale = isMale;
        this.dayOfBirth = dayOfBirth;
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected boolean isMale() {
        return isMale;
    }

    protected String getGender() {
        if (!isMale()) {
            return "Female";
        }
        return "Male";
    }

    protected void setMale(boolean male) {
        isMale = male;
    }

    protected LocalDate getBirthDay() {
        return dayOfBirth;
    }

    protected void setBirthDay(LocalDate dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    @Override
    public String toString() {
        return "Person:" +
                "name: '" + name + '\'' +
                ", gender: " + getGender() +
                ", dayOfBirth: " + dayOfBirth +
                '.';
    }
}




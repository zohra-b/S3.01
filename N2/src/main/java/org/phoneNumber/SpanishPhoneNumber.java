package org.phoneNumber;

public class SpanishPhoneNumber implements PhoneNumber{
    private final String INTCODE = "+34";
    private String number;

    public SpanishPhoneNumber(String number){
        setPhoneNumber(number);
    }
    public String getINTCODE() {
        return INTCODE;
    }

    public String getNumber() {
        return number;
    }

    public void setPhoneNumber(String number) {
        if (number == null || !number.matches("\\d{9}") ){
            throw new IllegalArgumentException("Spanish phone numbers contain 9 digits");
        }
        this.number = number;
    }

    @Override
    public String toString() {
        return  INTCODE + ' ' + number + "\n";
    }
}



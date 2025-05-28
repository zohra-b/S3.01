package org.phoneNumber;

public class TunisianPhoneNumber implements PhoneNumber{
        private final String INTCODE = "+216";
        private String number;

        public TunisianPhoneNumber(String number){
            setPhoneNumber(number);
        }

        public String getINTCODE() {
            return INTCODE;
        }

        public String getNumber() {
            return number;
        }

        public void setPhoneNumber(String number) {
            if (number == null || !number.matches("\\d{8}") ){
                throw new IllegalArgumentException("Tunisian phone numbers contain 8 digits");
            }
            this.number = number;
        }

        @Override
        public String toString() {
            return  INTCODE + ' ' + number + "\n";
        }
    }




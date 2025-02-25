package LAB6.Ex4;

public class USCode extends PostalCode {

    public USCode( String code ) {
        super( code );
    }

    public boolean isValid() {

        String myCode = getCode();
        boolean valid = true;

        if (myCode.length() != 8) {
            valid = false;
        }
        if (valid && !Character.isLetter(myCode.charAt(0))) {
            valid = false;
        }
        if (valid && !Character.isLetter(myCode.charAt(1))) {
            valid = false;
        }
        if (valid && !Character.isWhitespace(myCode.charAt(2))) {
            valid = false;
        }
        for (int i = 3; valid && i < 8; i++) {
            if (!Character.isDigit(myCode.charAt(i))) {
                valid = false;
            }
        }
        return valid;
    }
}

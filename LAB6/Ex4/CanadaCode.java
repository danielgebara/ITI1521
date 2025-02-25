package LAB6.Ex4;

public class CanadaCode extends PostalCode {

    public CanadaCode( String code ) {
        super( code );
    }

    public boolean isValid() { 

        String myCode = getCode();
        boolean valid = true;

        if (myCode.length() != 7) {
            valid = false;
        }
        if (valid && !Character.isLetter(myCode.charAt(0))) {
            valid = false;
        }
        if (valid && !Character.isDigit(myCode.charAt(1))) {
            valid = false;
        }
        if (valid && !Character.isLetter(myCode.charAt(2))) {
            valid = false;
        }
        if (valid && !Character.isWhitespace(myCode.charAt(3))) {
            valid = false;
        }
        if (valid && !Character.isDigit(myCode.charAt(4))) {
            valid = false;
        }
        if (valid && !Character.isLetter(myCode.charAt(5))) {
            valid = false;
        }
        if (valid && !Character.isDigit(myCode.charAt(6))) {
            valid = false;
        }
        return valid;
    }
}
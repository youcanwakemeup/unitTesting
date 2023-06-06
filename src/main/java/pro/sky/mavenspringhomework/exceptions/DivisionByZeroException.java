package pro.sky.mavenspringhomework.exceptions;

public class DivisionByZeroException extends IllegalArgumentException {
    public DivisionByZeroException(String error) {
        super(error);
    }
}

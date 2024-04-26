public class customException {
    public static void main(String[] args) throws AgeLessThanZeroException{
        validAge(15);

    }
    public static void validAge(int age) throws AgeLessThanZeroException{
        if(age < 0 ){
            throw new AgeLessThanZeroException();
        }
    }
}

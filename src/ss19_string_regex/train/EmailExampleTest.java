package ss19_string_regex.train;

public class EmailExampleTest {
    private static EmailExample emailExample;
    public static final String[] validEmail = new String[]{"nnthoi1994@gmail.com","a@yah.com"};
    public static final String[] invalidEmail = new String[]{"nnthoi1994@gmailcom","a@yah.com"};

    public static void main(String[] args) {
        emailExample = new EmailExample();
        for(String email:validEmail){
            boolean isvalid = emailExample.validate(email);
            System.out.println("Email"+ email + "isvalid: "+isvalid);
        }
        for(String email:invalidEmail){
            boolean isvalid = emailExample.validate(email);
            System.out.println("Email" + email + "isvalid: "+isvalid);
        }
    }
}

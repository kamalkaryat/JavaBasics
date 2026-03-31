package design_patterns.dependency_inversion_principle.problem;

public class EmailService {
    public void sendMessage(String message){
        System.out.println("Email Sent: "+message);
    }
}

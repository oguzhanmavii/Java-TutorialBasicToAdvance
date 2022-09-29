package business.abstracts;

public interface VerificationService
{
    void sendEmail(String email);
    void verifyEmail(String email);
    boolean isVerificated(String email);


}

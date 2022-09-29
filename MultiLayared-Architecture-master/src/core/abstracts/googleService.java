package core.abstracts;

public interface googleService
{

    void sendToVerifyMail(String email);
    boolean checkVerifyAccount(String password);


}

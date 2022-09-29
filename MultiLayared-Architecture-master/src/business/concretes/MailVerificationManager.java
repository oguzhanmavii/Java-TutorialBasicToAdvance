package business.concretes;

import business.abstracts.VerificationService;

import java.util.ArrayList;
import java.util.List;

public class MailVerificationManager implements VerificationService {


    CustomerCheckManager customerCheckManager;

    List<String> verificatedEmails = new ArrayList<String>();


    @Override
    public void sendEmail(String email) {

        System.out.println(email+"kullanicisina doğrulama email i gönderildi");

    }

    @Override
    public void verifyEmail(String email) {

        verificatedEmails.add(email);
    }

    @Override
    public boolean isVerificated(String email) {

        if (verificatedEmails.contains(email))
        {
            return true;
        }
        return false;

    }
}

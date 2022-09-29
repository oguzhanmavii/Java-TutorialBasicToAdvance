package google;

import core.abstracts.googleService;

public class LoginGoogleManager  implements googleService {
    @Override
    public void sendToVerifyMail(String email) {
        System.out.println(email+"Kullaniciya mail gönderildi !");
    }

    @Override
    public boolean checkVerifyAccount(String password) {
        System.out.println(password+"Kullaniciya doğrulama şifresi gönderildi !");
        return false;
    }
}

package business.concretes;

import business.abstracts.CustomerCheckService;
import business.abstracts.CustomerService;
import business.abstracts.VerificationService;
import dataAccess.abstracts.CustomerDal;
import entities.concretes.Customer;

public class CustomerManager implements CustomerService {


    CustomerCheckService customerCheckService;
    VerificationService mailverificationService;
    CustomerDal customerDal;

    public CustomerManager(CustomerCheckService customerCheckService,
                           VerificationService mailverificationService,
                           CustomerDal customerDal)
    {
        this.customerCheckService=customerCheckService;
        this.mailverificationService=mailverificationService;
        this.customerDal=customerDal;
    }



    @Override
    public void signUp(Customer customer) {
        if (customerCheckService.isValid(customer) == true) {
            System.out.print(customer.getFirstName() + " kullanıcısı başarıyla sisteme eklendi.\n");
            mailverificationService.sendEmail(customer.getEmail());
            customerDal.add(customer);

        }
    }
    @Override
    public void signIn(Customer customer) {
// Bu kodu çalıştırırsak doğrulama mailine tıklamış oluyoruz gibi düşünüyoruz.
            mailverificationService.isVerificated(customer.getEmail());

            // Bu komutta isVerificated komutunu çağırarak buraya gönderilen kullanıcının mail adresinin doğrulanan mail'ler listesinde olup olmadığını kontrol ediyoruz.
            if (customerDal.getEmail(customer.getEmail()) && customerDal.getPassword(customer.getPassword())
                    && mailverificationService.isVerificated(customer.getEmail()) == true) {
                System.out.println("Kullanıcı girişi başarıyla yapıldı.");
                //Bu else if durumunda kullanıcı bilgileri ama mail doğrulanmadıysa uyarısını veriyoruz.
            } else if (mailverificationService.isVerificated(customer.getEmail()) == false) {
                System.out.println("Kullanıcı bilgileri doğru. Fakat mail adresi doğrulanmadığı için giriş yapılamıyor.");
            } else {
                System.out.println("Kullanıcı bilgileri yanlış, lütfen kontrol ediniz.");
            }
    }
}

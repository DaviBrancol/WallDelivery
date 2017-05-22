package Builder;

import Exceptions.CEPFormatException;
import Exceptions.CPFInvalidException;
import Exceptions.CPFNumberFormatException;
import Exceptions.CPFSizeException;
import Exceptions.EmailInvalidException;
import Exceptions.PhoneFormatException;
import Exceptions.SizeException;
import model.CEP;
import model.CPF;
import model.Client;
import model.Email;
import model.Phone;
import model.Response;

public class ClientBuilder {
    
    public static Response createClient(String name, String emailString, String cpfString, String phoneString, 
                                        String address, String complement, String cepString, String reference) {
        
        Email email = new Email();
        CPF cpf = new CPF();
        Phone phone = new Phone();
        CEP cep = new CEP();
        
        try {
            if(name.length() == 0) {
                throw new SizeException("Nome");
            }
            if(address.length() == 0) {
                throw new SizeException("Endereço");
            }
            cpf.validateCPF(cpfString);
            email.validateEmail(emailString);
            phone.validatePhone(phoneString);
            cep.validateCep(cepString);
            Client newClient = new Client(name, email, cpf, phone, address, complement, cep, reference);
            return new Response<>(newClient, "Cliente cadastrado com sucesso", true);
        } catch (CPFSizeException | CPFNumberFormatException | CPFInvalidException | SizeException | EmailInvalidException | PhoneFormatException | CEPFormatException e) {
            return new Response<>(null, e.getMessage(), false);
        }
    }
}

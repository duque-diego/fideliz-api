package app.fideliz.service;

import app.fideliz.DTO.CadastroUsuarioAppDTO;
import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyService;
import org.springframework.stereotype.Service;

@Service
public class OfyService {

    private OfyService() {
        super();
    }

    static {
        ObjectifyService.register(CadastroUsuarioAppDTO.class);
    }

    public static Objectify ofy(){
        return ObjectifyService.ofy();
    }

}

package app.fideliz.service;

import app.fideliz.DTO.CadastroUsuarioAppDTO;
import app.fideliz.repository.CadastroUsuarioAppRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by diegods on 28/05/18.
 */

@Service
public class CadastroUsuarioAppService implements ICadastroUsuarioAppService {


    @Autowired
    private CadastroUsuarioAppRepository cadastroUsuarioAppRepository;

    public CadastroUsuarioAppDTO realizaCadastro(CadastroUsuarioAppDTO cadastroUsuarioAppDTO){
        cadastroUsuarioAppRepository.put(cadastroUsuarioAppDTO);
        return cadastroUsuarioAppDTO;
    }
}

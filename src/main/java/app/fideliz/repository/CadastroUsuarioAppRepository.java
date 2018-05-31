package app.fideliz.repository;

import app.fideliz.DAO.ObjectifyGenericDAO;
import app.fideliz.DTO.CadastroUsuarioAppDTO;
import org.springframework.stereotype.Repository;

@Repository
public class CadastroUsuarioAppRepository extends ObjectifyGenericDAO<CadastroUsuarioAppDTO> {
    public CadastroUsuarioAppDTO getById(Long id){
        ofy().clear();
        return ofy().transactionless().load().type(CadastroUsuarioAppDTO.class).id(id).now();
    }
}


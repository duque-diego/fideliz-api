package app.fideliz.controller;

import app.fideliz.DTO.CadastroUsuarioAppDTO;
import app.fideliz.service.ICadastroUsuarioAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Calendar;

/**
 * Created by diegods on 31/05/18.
 */

@RestController
public class CadastroController {

    @Autowired
    private ICadastroUsuarioAppService iCadastroUsuarioAppService;

    @GetMapping("/")
    public String hello() {
        return "Hello Spring Boot, I'm on App Engine!!!";
    }

    @GetMapping("/time")
    public String time() {
        return Calendar.getInstance().getTime().toString();
    }

    @ResponseBody
    @RequestMapping(value = "/cadastroUsuarioApp", method = RequestMethod.POST)
    public CadastroUsuarioAppDTO cadastroUsuarioApp(@RequestBody CadastroUsuarioAppDTO cadastroUsuarioAppDTO) {
        return iCadastroUsuarioAppService.realizaCadastro(cadastroUsuarioAppDTO);
    }
}

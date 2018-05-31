package app.fideliz.DTO;


import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

import java.io.Serializable;

/**
 * Created by diegods on 28/05/18.
 */

@Entity
public class CadastroUsuarioAppDTO implements Serializable{


    private String nome;
    private String email;
    private String telefone;
    @Id
    private String cpf;
    private String senha;
    private boolean desejaReceberInfo;

    public CadastroUsuarioAppDTO(){

    }

    public CadastroUsuarioAppDTO(
            String nome,
            String email,
            String telefone,
            String cpf,
            String senha,
            boolean desejaReceberInfo){
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.cpf = cpf;
        this.senha = senha;
        this.desejaReceberInfo = desejaReceberInfo;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isDesejaReceberInfo() {
        return desejaReceberInfo;
    }

    public void setDesejaReceberInfo(boolean desejaReceberInfo) {
        this.desejaReceberInfo = desejaReceberInfo;
    }
}

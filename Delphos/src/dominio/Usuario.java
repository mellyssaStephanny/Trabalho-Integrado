/*
 * Anne Caroline Silva
 * 16/04/2019
 */

package dominio;

import java.util.Date;
import java.util.Scanner;

public class Usuario {
	
	String nome;
	String email; /*podemos usar como login*/
        String cpf;
        String senha;
        Date DataNascimento;
    	
	/* metodos setters e getters */
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
        
        public void setSenha(String senha) {
            this.senha = senha;
        }
	
	public String getNome(){	

		return nome;
	}
	
	public String getEmail(){
		return email;
	}
	
	
        public String getSenha() {
        return senha;
        }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return DataNascimento;
    }

    public void setDataNascimento(Date DataNascimento) {
        this.DataNascimento = DataNascimento;
    }

    
        
	
}

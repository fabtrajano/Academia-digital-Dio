package me.dio.academia.digital.entity.form;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.br.CPF;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoForm {

	@NotBlank(message = "Preencha o campo corretamente")
	@Size(min = 3, max = 50, message = "'${ValidatedValue}' precisa estar entre {min} e {max} caracteres.")
	private String nome;
	
	@NotBlank(message = "Escreva o campo corretamente")
	@CPF(message = "'${ValidatedValue}' é invalido!")
	private String cpf;
	
	@NotBlank(message = "Preencha o campo corretamente")
	@Size(min = 3, max = 50, message = "'${ValidatedValue}' precisa estar entre {min} e {max} caracteres.")
	private String bairro;
	
	@NotEmpty(message = "Preencha o campo corretamente")
	@Past(message = "'${ValidatedValue}' é invalida.")
	private LocalDate dataDeNascimento;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	
	

}

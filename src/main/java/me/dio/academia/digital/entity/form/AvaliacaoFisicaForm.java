package me.dio.academia.digital.entity.form;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class AvaliacaoFisicaForm{
	
	@Positive(message = "O id do aluno precisa ser positivo.")
	private Long alunoId;
	
	@NotNull(message = "Preencha o campo corretamente")
	@Positive(message = "'${ValidatedValue}' precisa ser positivo.")
	private double peso;
	
	@NotNull(message = "Preencha o campo corretamente")
	@Positive(message = "'${ValidatedValue}' precisa ser positivo.")
	private double altura;

	public Long getAlunoId() {
		return alunoId;
	}

	public void setAlunoId(Long alunoId) {
		this.alunoId = alunoId;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
}

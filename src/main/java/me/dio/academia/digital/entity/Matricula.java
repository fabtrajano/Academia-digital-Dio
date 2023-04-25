package me.dio.academia.digital.entity;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // serve para abstrair getters e setters, iquas e hashcode;
@NoArgsConstructor // cria o construtor vazio;
@AllArgsConstructor 
@Entity // indica que a classe é uma tabela;
@Table(name = "tb_matricula")

public class Matricula {
	
	@Id // chave primária;
	@GeneratedValue(strategy = GenerationType.IDENTITY) // indica a geração da chave primaria;
	private Long id;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "aluno_id")
	private Aluno aluno;
		
	private LocalDateTime dataDaMatricula = LocalDateTime.now();

}

package me.dio.academia.digital.entity;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // serve para abstrair getters e setters, iquas e hashcode;
@NoArgsConstructor // cria o construtor vazio;
@AllArgsConstructor 
@Entity // indica que a classe é uma tabela;
@Table(name = "tb_avaliacoes")
public class AvaliacaoFisica{
	
	@Id // chave primária;
	@GeneratedValue(strategy = GenerationType.IDENTITY) // indica a geração da chave primaria;
	private Long id;
	
	@ManyToOne(cascade = CascadeType.ALL) // 'Muitas' avaliações tem um aluno	
	@JoinColumn(name = "aluno_id")
	private Aluno aluno;
	
	private LocalDateTime dataDaAvaliacao = LocalDateTime.now();
	
	@Column(name = "peso_atual")
	private double peso;
	
	@Column(name = "altura_atual")
	private double altura;

	
}

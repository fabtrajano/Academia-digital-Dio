package me.dio.academia.digital.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // serve para abstrair getters e setters, iquas and hashcode;
@NoArgsConstructor // cria o construtor vazio;
@AllArgsConstructor 
@Entity // indica que a classe é uma tabela;
@Table(name = "tb_alunos")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Aluno {
	
	@Id // chave primária;
	@GeneratedValue(strategy = GenerationType.IDENTITY) // indica a geração da chave primaria;
	private Long id;

	private String nome;
	
	@Column(unique = true)
	private String cpf;

	private String bairro;

	private LocalDate dataDeNascimento;

	@OneToMany(mappedBy = "aluno", fetch = FetchType.LAZY) // Um aluno tem 'muitas' avaliações
	@JsonIgnore
	private List<AvaliacaoFisica> avaliacoes = new ArrayList<>();

	
}

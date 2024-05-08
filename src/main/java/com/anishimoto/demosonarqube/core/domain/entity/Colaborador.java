package com.anishimoto.demosonarqube.core.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@Builder
@Table(name = "Colaboradores")
@NoArgsConstructor
@AllArgsConstructor
public class Colaborador extends DomainEntity {

    @Id
    private Long id;

    private String nome;

    private String cpf;

    @Column(name = "dtNascimento")
    private LocalDateTime nascimento;
}

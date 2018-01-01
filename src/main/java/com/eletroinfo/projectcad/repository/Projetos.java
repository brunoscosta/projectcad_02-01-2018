package com.eletroinfo.projectcad.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eletroinfo.projectcad.model.Projeto;
import com.eletroinfo.projectcad.repository.helper.ProjetosQueries;

//repositorio para projetos
@Repository
public interface Projetos extends JpaRepository<Projeto, Long>, ProjetosQueries {

}

package br.com.dudu.forum.repository;

import br.com.dudu.forum.modelo.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {
    Curso findByNome(String nome);
}

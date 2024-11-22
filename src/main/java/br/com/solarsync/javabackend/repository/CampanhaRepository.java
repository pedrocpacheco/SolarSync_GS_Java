package br.com.solarsync.javabackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.solarsync.javabackend.model.Campanha;

@Repository
public interface CampanhaRepository extends JpaRepository<Campanha, Long> {
}

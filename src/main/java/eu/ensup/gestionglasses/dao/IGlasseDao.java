package eu.ensup.gestionglasses.dao;

import eu.ensup.gestionglasses.domain.Glasse;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IGlasseDao extends JpaRepository<Glasse, Integer> {
    public List<Glasse> findAll();
}

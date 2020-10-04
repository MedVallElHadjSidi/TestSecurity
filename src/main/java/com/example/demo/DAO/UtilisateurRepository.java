package com.example.demo.DAO;

import com.example.demo.entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepository extends JpaRepository<Utilisateur,String> {
    public Utilisateur findByUsername(String code);
}

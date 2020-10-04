package com.example.demo.services;

import com.example.demo.entities.Role;
import com.example.demo.entities.Utilisateur;

public interface AccountService {
    public Utilisateur findUserByUser(String codeUser);
    public Role addRole(Role roles);
    public Utilisateur addUser(Utilisateur user);
    public Utilisateur AddRoles(String username, String rolename);

}

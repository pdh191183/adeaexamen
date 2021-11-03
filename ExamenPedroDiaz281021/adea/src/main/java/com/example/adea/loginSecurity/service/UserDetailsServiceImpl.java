package com.example.adea.loginSecurity.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.adea.loginSecurity.entity.*;
import com.example.adea.loginSecurity.repository.*;
import com.example.adea.repository.UsuarioRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

   // NOTA IMPORTANTE Pedro Diaz ::: Para buscar en la table de user ya utilizando Roles
	@Autowired
    UserRepository userRepository;

	// NOTA IMPOORTANTE : Pedro Diaz ::: Para buscar como se me pidio en el examen
    @Autowired
    UsuarioRepository usuarioRepository;   
    
    @Override
     public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
     //Buscar el usuario con el repositorio y si no existe lanzar una exepcion
     com.example.adea.loginSecurity.entity.User appUser = 
                 userRepository.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("No existe usuario"));
     com.example.adea.model.Usuario usuario = 
             usuarioRepository.findByLogin(username);
     if (usuario == null) {
    	System.out.println("No existe usuario en la Tabla Usuario");
     } else {
    	if (!usuario.getPassword().equals(appUser.getPassword())) {
    		System.out.println("La contraseña NO coincide con la registrada en la Tabla Usuario");
    	} else {
    		if (usuario.getFechaModificacion().after(usuario.getFechaVigencia())) {
    			System.out.println("La Fecha de Modificación ha caducado");
    		}
    	}
     }

     

    //Mapear nuestra lista de Authority con la de spring security 
    List grantList = new ArrayList();
    for (Authority authority: appUser.getAuthority()) {
        // ROLE_USER, ROLE_ADMIN,..
        GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(authority.getAuthority());
            grantList.add(grantedAuthority);
    }
		
    //Crear El objeto UserDetails que va a ir en sesion y retornarlo.
    UserDetails user = (UserDetails) new User(appUser.getUsername(), appUser.getPassword(), grantList);
         return user;
    }
}
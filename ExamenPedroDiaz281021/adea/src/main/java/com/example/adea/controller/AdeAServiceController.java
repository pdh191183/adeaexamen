package com.example.adea.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/service")
@RestController
public class AdeAServiceController {
	
	@RequestMapping("/")
	public String inicio () {
		return "Bienvenido";
	}
	
	@RequestMapping("/validar-usuario")
	public String validarUsuario () {
		return "Validando Usuario ...";
	}
	
	@RequestMapping("/validar-contrasena")
	public String validarContrasena () {
		return "Validando Contraseña ...";
	}
	
	@RequestMapping("/validar-vigencia")
	public String validarVigencia () {
		return "Validando Vigencia ...";
	}

	@RequestMapping("/actualizar-contrasena")
	public String actualizarContrasena () {
		return "Actualizando Contraseña ...";
	}
	
}
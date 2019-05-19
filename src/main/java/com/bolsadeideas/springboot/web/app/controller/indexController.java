package com.bolsadeideas.springboot.web.app.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bolsadeideas.springboot.web.app.models.Usuario;


@Controller
@RequestMapping("/app")
public class indexController {
	
	@GetMapping({"/index","/","/home"})
	public String index(Model model /*ModelMap modelMap<String, Object> map*/) {
		model.addAttribute("titulo","Hola Spring Boot");
		/*map.put("titulo","Hola Spring Boot");*/
		return "index";
	}
	
	/*
	@GetMapping({"/","index"})
	public ModelAndView index(ModelAndView mv) {
		mv.addObject("titulo","Model And View");
		mv.setViewName("index");
		return mv;
	}*/
	
	@RequestMapping("/perfil")
	public String perfil(Model model) {
		Usuario usuario =new Usuario();
		usuario.setNombre("Andres");
		usuario.setApellido("Hola");
		usuario.setEmail("123@g.com");
		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo","Perfil Usuario ".concat(usuario.getNombre()));
		return "perfil";
	}
	
	@RequestMapping("/listar")
	public String listar(Model model) {
		List<Usuario> usuarios =new ArrayList<>();
		usuarios.add(new Usuario("andres","guzman","email@email.com"));
		usuarios.add(new Usuario("andre","lus","email@email.com"));
		usuarios.add(new Usuario("andrew","rea","email@email.com"));
		model.addAttribute("usuarios", usuarios);
		model.addAttribute("titulo","Listado de Usuarios");
		return "listar";
	}
	/*
	//se aplica a todos los controladores
		@ModelAttribute("usuarios")
		public List<Usuario> poblarUsuarios(){
			List<Usuario> usuarios =new ArrayList<>();
			usuarios.add(new Usuario("andres","guzman","email@email.com"));
			usuarios.add(new Usuario("andre","lus","email@email.com"));
			usuarios.add(new Usuario("andrew","rea","email@email.com"));
			return usuarios;
		}
	*/
}

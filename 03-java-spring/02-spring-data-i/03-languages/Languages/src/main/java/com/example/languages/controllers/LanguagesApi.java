package com.example.languages.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.languages.models.Language;
import com.example.languages.services.LanguageService;

@RestController
public class LanguagesApi {
	private final LanguageService languageService;

	public LanguagesApi(LanguageService languageService) {
		this.languageService = languageService;
	}
	@RequestMapping("/languages")
    public List<Language> index() {
        return languageService.allLanguages();
        return "index.jsp";
    }
    
	@RequestMapping("/languages/{id}/edit")
	public 
	
    @RequestMapping(value="/languages", method=RequestMethod.POST)
    public Language create(@RequestParam(value="name") String name, @RequestParam(value="creator") String creator, @RequestParam(value="version") Integer currentVersion) {
        Language language= new Language(name, creator, currentVersion);
        return languageService.createLanguage(language);
    }
    
    @RequestMapping("/languages/{id}")
    public Language show(@PathVariable("id") Long id) {
        Language language = languageService.findLanguage(id);
        return language;
    }
	
	
}

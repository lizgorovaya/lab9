package controllers;


import models.Authors;
import repositories.ImageRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import services.AuthorsService;

import java.io.IOException;
import java.security.Principal;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class AuthorsController {
    private final AuthorsService authorsService;
    private final ImageRepository imageRepository;

    @GetMapping("/authors")
    public String product(@RequestParam(name = "name",required = false) String name,Principal principal, Model model) {
        model.addAttribute("author",authorsService.listAuthors(name));
        model.addAttribute("user",authorsService.getUserByPrincipal(principal));
        model.addAttribute("name", authorsService.list());
        model.addAttribute("images", imageRepository.findAll());
        return "authors";
    }
    @GetMapping("/getAuthors")
    public String searchFlowersByName(@RequestParam(value = "name", required = false) String searchQuery, Model model) {
        List<Authors> searchResults;
        if (searchQuery != null && !searchQuery.isEmpty()) {
            // Выполните поиск цветков по названию
            searchResults = authorsService.getAuthorsByName(searchQuery);
        } else {
            // Если поисковый запрос пустой, отобразите все цветки
            searchResults = authorsService.getAllAuthors();
        }
        model.addAttribute("authors", searchResults);
        return "authors";
    }
    @GetMapping("/authors/{ID}")
    public String productInfo(@PathVariable Long ID,Model model){
        Authors authors=authorsService.getAuthorsByID(ID);
        model.addAttribute("authors",authors);
        model.addAttribute("image",authors.getImages());
        return"admin";
    }
    @PostMapping("/authors/create")
    public String createFlowers(@RequestParam("file1") MultipartFile file1,
                                Authors authors, Principal principal)throws IOException {
        authorsService.saveFlowers(principal,authors,file1);
        return "redirect:/admin";
    }
    @PostMapping("/authors/delete/{ID}")
    public String deleteFlowers(@PathVariable Long ID){
        authorsService.deleteAuthors(ID);
        return"redirect:/admin";
    }
}
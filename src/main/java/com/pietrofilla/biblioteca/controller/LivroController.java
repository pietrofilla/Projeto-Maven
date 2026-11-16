package com.pietrofilla.biblioteca.controller;

import com.pietrofilla.biblioteca.model.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LivroController {

    @GetMapping("/")
    public String raiz() {
        return "redirect:/livros";
    }

    @GetMapping("/livros")
    public String inicio() {
        return "livros/inicio";
    }

    @GetMapping("/livros/livro")
    public String exibirLivro(Model model) {

        Livro livro = new Livro();
        livro.setTitulo("O Hobbit");
        livro.setAutor("J.R.R. Tolkien");
        livro.setIsbn("978-85-359-0277-5");

        Autor autor = new Autor();
        autor.setNome("J.R.R. Tolkien");
        autor.setNacionalidade("Britânico");
        autor.setDataNascimento("03/01/1892");

        Categoria categoria = new Categoria();
        categoria.setNome("Fantasia");
        categoria.setDescricao("Livros de fantasia e aventura");
        categoria.setCodigo("CAT002");

        Usuario usuario = new Usuario();
        usuario.setNome("Marina Costa");
        usuario.setEmail("marina@email.com");
        usuario.setCpf("000.000.000-00");

        Emprestimo emprestimo = new Emprestimo();
        emprestimo.setDataEmprestimo("10/11/2026");
        emprestimo.setDataDevolucao("24/11/2026");
        emprestimo.setStatus("Em andamento");
        emprestimo.setLivro("O Hobbit");
        emprestimo.setUsuario("Marina Costa");

        model.addAttribute("livro", livro);
        model.addAttribute("autor", autor);
        model.addAttribute("categoria", categoria);
        model.addAttribute("usuario", usuario);
        model.addAttribute("emprestimo", emprestimo);

        return "livros/livro";
    }
}

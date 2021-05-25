package br.edu.usj.ads.pw.jogos;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller

public class jogoController {

    @Autowired
    JogoRepository jogoRepository;

    @GetMapping(value="/")
    public ModelAndView getIndex() {
        // criar um objeto lista
        List<Jogos> lista = new ArrayList<>();
        // preencher esta lista com os dados do banco
        lista = jogoRepository.findAll();
        // instanciar um template
        ModelAndView modelAndView = new ModelAndView("index");
        //preencher o template com a lista 
        modelAndView.addObject("lista", lista);
        //retornar o template
        return modelAndView;
    }
    
    @GetMapping(value="/detalhes/{id}")
    public ModelAndView getDetalhes(@PathVariable Long id) {
        // ler contato do banco pelo id 1
        Jogos jogos = new Jogos();
        jogos = jogoRepository.findById(id).get();

        // instanciar o template 
        ModelAndView modelAndView = new ModelAndView("detalhes");

        // popular o template
        modelAndView.addObject("jogos", jogos);

        // retornar o template
        return modelAndView;
    }
    @GetMapping(value="/editar/{id}")
    public ModelAndView getEditar (@PathVariable Long id) {
        // selecionar contato do banco pelo id
        Jogos jogos = new Jogos();
        jogos = jogoRepository.findById(id).get();

        // instanciar o template
        ModelAndView modelAndView = new ModelAndView("cadastro");
 
        // preencher o template com o jogos selecionado
        modelAndView.addObject("jogos", jogos);

        //retornar ao template
        return modelAndView;
    }
    @GetMapping(value="/deletar/{id}")
    public String getDeletar(@PathVariable Long id) {
        // deletar o objeto com o id passado pelo parametro 
      jogoRepository.deleteById(id);
        // retornar para / (raiz)
        return "redirect:/";
    }
    
    @GetMapping(value="/cadastro")
    public ModelAndView getCadastro() {

        Jogos jogos = new Jogos();

        ModelAndView modelAndView = new ModelAndView("cadastro");

        modelAndView.addObject("jogos", jogos);

        return modelAndView;
    }

    @PostMapping(value="/adicionar")
    public ModelAndView postAdicionar(Jogos jogos) {
        // salvar no banco (usando repository)
        jogoRepository.save(jogos);

        // salvar no banco (usando repository)
        jogoRepository.save(jogos);

        // criar template
        ModelAndView modelAndView = new ModelAndView("detalhes");

        // popular o template
        modelAndView.addObject("jogos", jogos);

        // retornar
        return modelAndView;
    }
}
package com.pro.cristiano.drogaria.controller;

import java.util.List;
import java.util.Optional;

import com.pro.cristiano.drogaria.domain.Categoria;
import com.pro.cristiano.drogaria.exception.RecursoNaoEncotardoException;
import com.pro.cristiano.drogaria.repository.CategoriaRepository;
import com.pro.cristiano.drogaria.service.CategoriaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("categorias")
public class CategoriaController {
    @Autowired
    private CategoriaService categoriaService;

   /*  @GetMapping
    public List<Categoria> listar() {

        List<Categoria>  categorias = categoriaRepository.findAll();
        return categorias;
    }

    @PostMapping
    public Categoria inserir(@RequestBody Categoria categoria){
        Categoria categoriaSalva = categoriaRepository.save(categoria);

        return categoriaSalva;
    }

    @DeleteMapping("/{codigo}")
    public Categoria excluir(@PathVariable Short codigo){
      Optional<Categoria> categoria = categoriaRepository.findById(codigo);
        categoriaRepository.delete(categoria.get());
        return categoria.get();
    }

    @PutMapping
    public Categoria editar(@RequestBody Categoria categoria) {
       Categoria categoriaEditada = categoriaRepository.save(categoria);
       return categoriaEditada;
    }
 */
    @GetMapping("/{codigo}")
    public Categoria buscarPorCodigo(@PathVariable Short codigo){
        try {
            Categoria categoria =  categoriaService.buscarPorCodigo(codigo);
            return categoria;
            
        } catch (RecursoNaoEncotardoException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Categoria não encontrada",e);
        }
    }
}

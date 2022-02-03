package io.github.bartmy.Todo.lang;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api")
class LangServlet {

    private LangService service;

    LangServlet(LangService service){
        this.service = service;
    }

    @GetMapping("/langs")
    ResponseEntity<List<LangDTO>> findAllLangs(){
        log.info("Got lang request");
        return ResponseEntity.ok(service.findAll());
    }
}


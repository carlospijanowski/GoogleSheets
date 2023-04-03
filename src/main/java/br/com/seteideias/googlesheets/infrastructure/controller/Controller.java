package br.com.seteideias.googlesheets.infrastructure.controller;

import br.com.seteideias.googlesheets.infrastructure.controller.model.request.Payload.Payload;
import br.com.seteideias.googlesheets.service.MainService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class Controller {

    private final MainService mainService;

    @GetMapping("/get")
    public ResponseEntity<?> get(Payload payload){
        mainService.process(payload);
        return new ResponseEntity<>(HttpStatusCode.valueOf(200));
    }
}

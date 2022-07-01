package com.api_codigo_morse.api_codigo_morse.Controller;

import com.api_codigo_morse.api_codigo_morse.Model.MorseTraduzido;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MorseRestController {
    @GetMapping("/{morse}")
    public ResponseEntity<MorseTraduzido> converteDecimalParaRomano(@PathVariable String morse){
        return new ResponseEntity(new MorseTraduzido(morse), HttpStatus.OK);
    }
}

package com.senai.pagamento.controllers;

import com.senai.pagamento.dtos.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Desconto")
public class DescontoController {

    @PostMapping("/Total")
    public ResponseEntity<RetornoDTO> totalSalario(@RequestBody DescontoDTO dados) {

        RetornoDTO resultado = new RetornoDTO();

        /*  • Se o usuário faltar 1(um) dia, descontar R$100.
            • Se o usuário faltar mais de 1 (um) dia, descontar R$110 e R$50
                a cada dia. Ex: Faltou 5 dias, salário 2000. Descontar R$110 e mais R$250 por
                5 dias faltados, totalizando R$360 de desconto.
         */

        int faltouUmDia = 1;
        float descontoUmDia = 100f;
        float descontoExtra = 50f;

        if (dados.getDiasFaltados() == faltouUmDia) {

            resultado.setDescontoSalario(dados.getSalario() - descontoUmDia);
            resultado.setNomeUsuario(dados.getNomeUsuario());
            resultado.setSalario(dados.getSalario());
            resultado.setDiasFaltados(dados.getDiasFaltados());

        } else
            if (dados.getDiasFaltados() == 0) {

            resultado.setDescontoSalario(dados.getSalario());
            resultado.setNomeUsuario(dados.getNomeUsuario());
            resultado.setSalario(dados.getSalario());
            resultado.setDiasFaltados(dados.getDiasFaltados());

        } else
            if (dados.getDiasFaltados() > 1) {
            resultado.setDescontoSalario(
                    dados.getSalario() - (descontoExtra * dados.getDiasFaltados()) - descontoUmDia + 10);
            resultado.setNomeUsuario(dados.getNomeUsuario());
            resultado.setSalario(dados.getSalario());
            resultado.setDiasFaltados(dados.getDiasFaltados());
        }
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(resultado);
    }

}

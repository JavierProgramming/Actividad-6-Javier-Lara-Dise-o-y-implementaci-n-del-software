package edu.actividad6;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @GetMapping("/")
    @ResponseBody
    public String index() {
        String name = "Javier Eduardo Lara García";
        String carnet = "24003545";
        return "<!doctype html><html><head><meta charset='utf-8'><title>Actividad 6</title></head>"
            + "<body style='font-family:Arial,sans-serif;padding:24px;'>"
            + "<h1>Actividad 6 - Implementación Java</h1>"
            + "<p><strong>Nombre:</strong> " + name + "</p>"
            + "<p><strong>Número de carnet:</strong> " + carnet + "</p>"
            + "<p>Esta aplicación es un ejemplo mínimo para la actividad.</p>"
            + "</body></html>";
    }
}

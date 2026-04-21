package co.simplon.cinema2026.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
// je communique en HTTP !
public class HelloController {

    // GET
    @GetMapping("/hello")
    @ResponseBody
    // ici je retourne une réponse HTTP, pas un fichier HTML !
    public String getGreetings() {
        return "Hello Bastien !";
    }

}

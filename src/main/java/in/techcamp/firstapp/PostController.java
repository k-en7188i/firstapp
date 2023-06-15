package in.techcamp.firstapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class PostController {
    @GetMapping("/hello")
    public String showHello(Model model) {
        var sampleText = "こんにちは、赤ちゃん！";
        model.addAttribute("sampleText", sampleText);
        return "hello";
    }

}
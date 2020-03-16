package org.fourhorde.coolmemes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class GreetingController {

    @GetMapping
    public String main(Map<String, Object> model) {
        model.put("some", "some");
        return "main";
    }

}

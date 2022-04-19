package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class DiceController {
    @GetMapping("/roll-dice")
    public String showDiceRoll() {
        return "roll-dice";
    }


    @PostMapping("/roll-dice")
    public String diceRoll(@RequestParam(name = "number") String number, Model model) {
        model.addAttribute(number);
        return rolled(number, model);
    }

    public String rolled(@PathVariable String number, Model model) {
        model.addAttribute("number", number);
        int random = (int) ((Math.random() * (6 - 1)) + 1);
        model.addAttribute("guessed", random);
        if(Integer.parseInt(number) == random) {
            model.addAttribute("correct", "you guessed correct!");
            return "rolled";
        } else {
            model.addAttribute("correct", "try again next time");
            return "rolled";
        }
    }

}

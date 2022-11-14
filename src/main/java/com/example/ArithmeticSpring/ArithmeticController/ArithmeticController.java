package com.example.ArithmeticSpring.ArithmeticController;

import com.example.ArithmeticSpring.domain.Addition;
import com.example.ArithmeticSpring.domain.Division;
import com.example.ArithmeticSpring.domain.Multiplication;
import com.example.ArithmeticSpring.domain.Subtraction;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ArithmeticController {
    @GetMapping("/index")
    public String ViewForm(Model model){
        model.addAttribute("Addition", new Addition());
        model.addAttribute("Subtraction", new Subtraction());
        model.addAttribute("Multiplication", new Multiplication());
        model.addAttribute("Division", new Division());
        return "index";
    }
    @PostMapping("/addition")
    public String additionForm(@ModelAttribute Addition addition, BindingResult result,Model model){
        model.addAttribute("addition",addition);
        return "calculate";
    }
    @PostMapping("/subtraction")
    public String subtractionForm(@ModelAttribute Subtraction subtraction, BindingResult result,Model model){
        model.addAttribute("subtraction",subtraction);
        return "calculate";
    }
    @PostMapping("/multiplication")
    public String multiplicationForm(@ModelAttribute Multiplication multiplication, BindingResult result,Model model){
        model.addAttribute("multiplication",multiplication);
        return "calculate";
    }
    @PostMapping("/division")
    public String divisionForm(@ModelAttribute Division division, BindingResult result,Model model){
        model.addAttribute("division",division);
        return "calculate";
    }

}

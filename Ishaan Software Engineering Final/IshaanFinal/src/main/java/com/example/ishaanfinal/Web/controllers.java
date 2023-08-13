package com.example.ishaanfinal.Web;
import com.example.ishaanfinal.Entities.Salesman;
import com.example.ishaanfinal.Repository.SalesmanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDate;
import java.util.List;


public class controllers {


    private SalesmanRepository salesmanRepository;

    @GetMapping("/")
    public String showSalesPage(Model model) {
        List<Salesman> salesList = salesmanRepository.findAll();
        model.addAttribute("salesList", salesList);
        model.addAttribute("newSale", new Salesman()); // For the form

        return "salesPage"; // Thymeleaf template name
    }

    @PostMapping("/saveSale")
    public String saveSale(@ModelAttribute Salesman newSale) {
        newSale.setDateOfTransaction(LocalDate.now());
        salesmanRepository.save(newSale);
        return "redirect:/"; // Redirect back to the main page
    }
}



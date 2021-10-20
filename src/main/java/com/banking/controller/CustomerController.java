package com.banking.controller;

import com.banking.model.Customer;
import com.banking.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class CustomerController {
    @Autowired
    ICustomerService service;

    @GetMapping("/customers")
    public ModelAndView showListCustomer() {
        ModelAndView modelAndView = new ModelAndView("/list");
        Iterable<Customer> customers = service.findAll();
        modelAndView.addObject("customers",customers);
        return modelAndView;
    }

    @GetMapping("/create-customer")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("customer", new Customer());
        return modelAndView;
    }

    @PostMapping("/create-customer")
    public ModelAndView CreateCustomer(@ModelAttribute("customer") Customer customer) {
        service.save(customer);
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("customer", new Customer());
        modelAndView.addObject("message", "New customer created successfully");
        return modelAndView;

    }
}

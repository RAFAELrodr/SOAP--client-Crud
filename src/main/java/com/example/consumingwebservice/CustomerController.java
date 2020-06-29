package com.example.consumingwebservice;

import com.example.consumingwebservice.wsdl.CustomerDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class CustomerController {

    private final CustomerClient customerClient;

    @Autowired
    public CustomerController(CustomerClient customerClient) {
        this.customerClient = customerClient;
    }

    @GetMapping("/home")
    public String index(Model model) {
        if(customerClient.getAllCustomer().getCustomerDetail().isEmpty()){
            return "home";
        }
        model.addAttribute("customers", customerClient.getAllCustomer().getCustomerDetail());
        return "home";
    }

    @GetMapping("/signup")
    public String showForm(CustomerDetail customerDetail) {
        return "add-customer";
    }

    @GetMapping("/getcustomer/{customerId}")
    public String getCustomer(@PathVariable int customerId, Model model) {
        CustomerDetail customerDetail = null;
        customerDetail = customerClient.getCustomerById(customerId).getCustomerDetail();

        model.addAttribute("customerDetail", customerDetail);
        return "get-customer";
    }

    @PostMapping("/addcustomer")
    public String addCustomer(@Valid CustomerDetail customerDetail, BindingResult result, Model model) {
        customerClient.insertCustomer(customerDetail);
        model.addAttribute("customers", customerClient.getAllCustomer().getCustomerDetail());
        return "redirect:/home";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") int id, Model model) {
        CustomerDetail customerDetail = customerClient.getCustomerById(id).getCustomerDetail();
        customerClient.deleteCustomer(customerDetail.getId());
        model.addAttribute("customers", customerClient.getAllCustomer().getCustomerDetail());
        return "redirect:/home";
    }

    @GetMapping("/edit/{id}")
    public String showUpdateForm(@PathVariable("id") int id, Model model) {
        CustomerDetail customerDetail = customerClient.getCustomerById(id).getCustomerDetail();
        model.addAttribute("customerDetail", customerDetail);
        // User user = userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
        //model.addAttribute("user", user);
        return "update-customer";
    }

    @PostMapping("/update/{id}")
    public String updateUser(@PathVariable("id") int id, @Valid CustomerDetail customerDetail,
                             BindingResult result, Model model) {
        if (result.hasErrors()) {
            customerDetail.setId(id);
            return "update-customer";
        }
        customerClient.updateCustomer(customerDetail);
        model.addAttribute("customers", customerClient.getAllCustomer().getCustomerDetail());
        return "redirect:/home";
    }

}

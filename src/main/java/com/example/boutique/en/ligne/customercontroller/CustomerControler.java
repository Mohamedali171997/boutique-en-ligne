package com.example.boutique.en.ligne.customercontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

@Controller
class CustomerControler {

    @GetMapping("/register")
    public String registerUser()
    {
        return "register";
    }
    @GetMapping("/contact")
    public String contact()
    {
        return "contact";
    }
    @GetMapping("/buy")
    public String buy()
    {
        return "buy";
    }
public String address;
    @GetMapping("s/user/product")
    public String getproduct(Model model) {
        return "uproduct";
    }
    @RequestMapping(value = "newuserregister", method = RequestMethod.POST)
    public String newUseRegister(@RequestParam("username") String username,@RequestParam("password") String password,@RequestParam("email") String email)
    {
        try
        {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:8080/springproject","root","");
            PreparedStatement pst = con.prepareStatement("insert into users(username,password,email) values(?,?,?);");
            pst.setString(1,username);
            pst.setString(2, password);
            pst.setString(3, email);


            pst.setString(4, address);
            int i = pst.executeUpdate();

            System.out.println("data base updated"+i);

        }
        catch(Exception e)
        {
            System.out.println("Exception:"+e);
        }
        return "redirect:/";
    }
}

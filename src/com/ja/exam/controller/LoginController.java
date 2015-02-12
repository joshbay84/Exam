package com.ja.exam.controller;

import com.ja.exam.model.Login;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by joshuaantony on 12/7/14.
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    @RequestMapping(method = RequestMethod.GET)
    public String showLoginForm(@ModelAttribute("loginObj") Login login, ModelMap modelMap)
    {
        modelMap.addAttribute("loginForm", new Login());
        return "login";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String login(@ModelAttribute("loginObj") Login login, ModelMap modelMap)
    {
        modelMap.addAttribute("user", login.getUserName());
        return "loginSuccess";
    }
}

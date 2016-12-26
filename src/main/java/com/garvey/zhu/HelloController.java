package com.garvey.zhu;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;

@Controller
@RequestMapping("/")
public class HelloController {
    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
        return "hello";
    }

    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String kidding(String webName, ModelMap model) {
        if (webName != null && webName.equals("朱佳伟")) {
            webName = webName + "，帅哥";
        } else if (webName == null || webName.length() == 0) {
            webName = "输名字啊傻逼";
        } else if (webName.equals("朱伟康") || webName.equals("丁徐进") || webName.equals("翟仁杰")) {
            webName = webName + "，大傻逼";
        } else {
            webName = webName + "，平凡人";
        }
        model.addAttribute("message", webName);
        return "kidding";

    }
}
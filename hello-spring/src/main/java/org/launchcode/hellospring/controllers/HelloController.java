package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.launchcode.hellospring.controllers.*;

/**
 * Created by B
 */

@Controller
@ResponseBody
@RequestMapping("hello")
public class HelloController {

//    @GetMapping
//    @ResponseBody
//    public String hello() {
//        return "Hello, Spring!";
//    }

    //now lives at /hello/goodbye
    @GetMapping("goodbye")
//    @ResponseBody
    public String goodbye() {
        return "Goodbye, Spring!";
    }

    //Handles request of the form with query param /hello?name=LaunchCode
    /* note that mapping hello and query param name are the same as in
    in the method
     */
//    @GetMapping("hello")
//    @PostMapping("hello")
    //lives at hello/hello
//    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "hello")
////    @ResponseBody
//    public String helloWithQueryParam(@RequestParam String name) {
//        return "Hello, " + name + "!";
//
//    }

    //lives at hello/form
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "hellomessage")
    public String createMessage (@RequestParam String name, @RequestParam String language) {
        if (language.equals("spanish")) {
            return "Hola " + name + "!";
        } else if (language.equals("thai")) {
            return "Sawaat di khaa, khun " + name + "!";
        } else if (language.equals("french")) {
            return "Bonjour, " + name + "!";
        } else if (language.equals("arabic")) {
            return "Marhaba, " + name + "!";
        } else if (language.equals("welsh")) {
            return "Bore da, " + name + "!";
        } else if (language.equals("english")) {
            return "Hello, " + name + "!";
        } else {
            return language;
        }
    }

    //handles requests of the form /hello/launchcode
    @GetMapping("hello/{name}")
    //"redirect:/hello/DESIREDPATH"
//    @ResponseBody
    public String helloWithPathParam(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

    //display the form
//    @GetMapping("form")
//    @ResponseBody
//    public String helloForm(){
//        return "<html>" +
//                "<body>" +
//                "<form action= 'hello'>" + // default is get here. submit a request to /hello using hello with query param method
//                "<input type = 'text' name = 'name'>" +
//                "<input type = 'submit' value = 'Greet me!'>" +
//                "</form>" +
//                "</body>" +
//                "</html>";
//    }

    //display the form and use post
    //lives at hello/form
//    @GetMapping("form")
////    @ResponseBody
//    public String helloForm(){
//        return "<html>" +
//                "<body>" +
//                "<form action= 'hello' method='post'>" + // using post. submit a request to /hello using hello with query param method
//                "<input type = 'text' name = 'name'>" +
//                "<input type = 'submit' value = 'Greet me!'>" +
//                "</form>" +
//                "</body>" +
//                "</html>";
//    }

    //select element drop down
    @GetMapping("form")
//    @ResponseBody
    public String helloForm(){
        return "<html>" +
                "<link rel = 'stylesheet' type = 'text/css' + href = 'style1.css'>" +
                "<body>" +
                "<form action= 'hellomessage' method='post'>" + // using post. submit a request to /hello using hello with query param method
                "<input type = 'text' name = 'name'>" +
//                "<label for = 'language-select'>Choose a language</label>" +
                "<select name= 'language' id='language-select'" +
                "    <option value=''>--Please choose an option--</option>" +
                "    <option value='english'>English</option>" +
                "    <option value='french'>French</option>" +
                "    <option value='welsh'>Welsh</option>" +
                "    <option value='arabic'>Arabic</option>" +
                "    <option value='spanish'>Spanish</option>" +
                "    <option value='thai'>Thai</option>" +
                "</select>" +
                "<input type = 'submit' value = 'Greet me!'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }





}

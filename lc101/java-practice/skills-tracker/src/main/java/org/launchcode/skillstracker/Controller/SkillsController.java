package org.launchcode.skillstracker.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {
    @GetMapping("list")
    public String initList() {
        return "<h1>Skills Tracker</h1>" +
                "<h2>" +
                "<ol>" +
                "<li> Python </li>" +
                "<li> JavaScript</li>" +
                "<li> Java</li>" +
                "</ol>" +
                "</h2>";
    }

    @GetMapping("form")
    public String selectFavorite() {
    return "<html>" +
            "<form method= 'post'>"+
            "<label> Name:" +
            "<br>" +
            "<input type = 'text' name = 'name'>" +
            "<br>" +
            "<label> My Favorite Language" +
            "<br>" +
            "<select name = 'Favorite'>" +
            "<option value = 'Python'>Python</option>" +
            "<option value = 'JavaScript'>JavaScript</option>" +
            "<option value = 'Java'>Java</option>" +
            "</select>" +
            "</label>" +
            "<br>" +
            "<label> My Second Favorite Language" +
            "<br>" +
            "<select name = 'secondFavorite'> " +
            "<option value = 'Python'>Python</option>" +
            "<option value = 'JavaScript'>JavaScript</option>" +
            "<option value = 'Java'>Java</option>" +
            "</select>" +
            "</label>" +
            "<br>" +
            "<label> My Third Favorite Language" +
            "<br>" +
            "<select name = 'thirdFavorite'> " +
            "<option value = 'Python'>Python</option>" +
            "<option value = 'JavaScript'>JavaScript</option>" +
            "<option value = 'Java'>Java</option>" +
            "</select>" +
            "</label>" +
            "<br>" +
            "<input type = 'submit' value = 'Submit'>" +
            "</form>" +
            "</html>";
    }

    @PostMapping("form")
    public String results (@RequestParam String name,
                           @RequestParam String Favorite,
                           @RequestParam String secondFavorite,
                           @RequestParam String thirdFavorite) {
        return "<h1>" +
                name +
                "<ol>" +
                "<li>" +
                Favorite +
                "</li>" +
                "<li>" +
                secondFavorite +
                "</li>" +
                "<li>" +
                thirdFavorite +
                "</li>" +
                "</ol>";

    }
}

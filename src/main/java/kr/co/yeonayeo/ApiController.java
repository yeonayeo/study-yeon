package kr.co.yeonayeo;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class ApiController {
//    @RequestMapping(value = "/api/test", method = RequestMethod.GET)
//    @ResponseStatus(value = HttpStatus.OK)
//    public String getApiTest() {
//        return "{\"result\":\"ok\"}";
//    }
    @GetMapping("/profile/info")
    public Profile getProfileInfo() {
        Profile profile = new Profile();
        profile.setName("김연아");
        profile.setEmail("dusk0364@gmail.com");

        return profile;
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello";
    }
}

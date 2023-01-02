package com.groupeisi.dashboadservice.controller;

import com.groupeisi.dashboadservice.model.AppUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@RestController
public class restTemplateController {
    private static final String GET_ALL_APP_USER_API="http://localhost:8890/AppUser/getAll";
    private static final String GET_ALL_APP_USER_ID_API="http://localhost:8890/AppUser/getAppUSer/{id}";

    static RestTemplate restTemplate = new RestTemplate();


    @GetMapping("/All")
    public ResponseEntity<String> GetAllAppUserApi(){
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<>("parameters",headers);

        ResponseEntity<String> result = restTemplate.exchange(GET_ALL_APP_USER_API,HttpMethod.GET, entity, String.class);

        return result;
    }

    @GetMapping("getByID/{id}")
    public @ResponseBody AppUser GetAllAppUserByIDApi(@PathVariable int id){
        Map<String,Integer> param = new HashMap<>();
        param.put("id",id);

        AppUser app  = restTemplate.getForObject(GET_ALL_APP_USER_ID_API, AppUser.class,param);
        return app;
    }

}

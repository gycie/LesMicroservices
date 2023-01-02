package com.groupeisi.controller;

import com.groupeisi.model.AppUser;
import com.groupeisi.service.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/AppUser")
public class AppUserController {
    @Autowired
    private AppUserService appUserService;
    @GetMapping("/getAppUSer/{id}")
    public @ResponseBody AppUser getAppUser(@PathVariable int id){
        return appUserService.getAppUser(id);
    }
    @GetMapping("/getAll")
    public @ResponseBody List<AppUser> getAll(){
        return appUserService.getAll();
    }
}

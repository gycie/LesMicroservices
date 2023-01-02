package com.groupeisi.service;

import com.groupeisi.dao.IAppUser;
import com.groupeisi.model.AppUser;
import com.groupeisi.repository.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AppUserService implements IAppUser {
    @Autowired
private AppUserRepository appUserRepository;
    @Override
    public AppUser getAppUser(int id) {
        AppUser a = new AppUser();
        for(AppUser appUser : appUserRepository.findAll()){
            if (appUser.getId() == id) {
                a = appUser;
            }

        }
        return a;
    }

    @Override
    public List<AppUser> getAll() {
        return appUserRepository.findAll();
    }
}

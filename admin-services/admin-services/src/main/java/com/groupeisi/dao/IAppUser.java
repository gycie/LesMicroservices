package com.groupeisi.dao;

import com.groupeisi.model.AppUser;

import java.util.List;

public interface IAppUser {
    public AppUser getAppUser(int id);
    public List<AppUser> getAll();
}

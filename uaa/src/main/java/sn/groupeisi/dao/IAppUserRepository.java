package sn.groupeisi.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import sn.groupeisi.Enities.AppUser;

public interface IAppUserRepository extends JpaRepository<AppUser, Integer> {
    AppUser findEmail(String email);
}

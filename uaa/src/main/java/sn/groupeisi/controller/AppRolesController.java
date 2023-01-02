package sn.groupeisi.controller;

import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sn.groupeisi.Enities.AppRoles;
/*import sn.groupeisi.service.AppRolesService;



@RestController
@RequestMapping("/roles")
@AllArgsConstructor
public class AppRolesController {
    private AppRolesService appRolesService;

    @GetMapping
    public Page<AppRoles> getAppRoles(Pageable pageable) {
        return appRolesService.getAppRoles(pageable);
    }

    @GetMapping("{id}")
    public ResponseEntity<AppRoles> getAppRole(@PathVariable("id") int id) {
        //return clientService.getClient(id);
        return ResponseEntity.ok(appRolesService.getAppRole(id));
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    //@IsAdmin
    public AppRoles createClient(@Valid @RequestBody AppRoles appRoles) {
        return appRolesService.createAppRoles(appRoles);
    }

    @PutMapping("{id}")
    //@IsAdmin
    public AppRoles updateAppRoles(@PathVariable("id") int id, @Valid @RequestBody AppRoles appRoles) {
        return appRolesService.updateAppRoles(id, appRoles);
    }

    @DeleteMapping("{id}")
    public void deleteAppRoles(@PathVariable("id") int id) {
        appRolesService.deleteAppRoles(id);
    }

}
*/
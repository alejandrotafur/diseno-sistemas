
package com.controllers.com.innversionesjp.prueba;

import java.util.List;

import com.models.User;


@RestController
@RequestMapping("/api/prueba")

public class UserController {

    

    @GetMapping("/getAll")
    public List<User>getAll(){
        return null;
    }
}

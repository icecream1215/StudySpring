package hello.springmvc.basic.requestmapping;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mapping/users")
public class MappingClassController {

    //@GetMapping("/mapping/users")
    @GetMapping
    public String user(){
        return "get users";
    }

    //@PostMapping("/mapping/users")
    @PostMapping
    public String addUser(){
        return "post user";
    }

    //@GetMapping("/mapping/users/{userId}")
    @GetMapping("/{userId}")
    public String findUser(@PathVariable String userId){
        return "get UserId = " + userId;
    }

    //@PatchMapping("/mapping/users/{userId}")
    @PatchMapping("/{userId}")
    public String updateUser(@PathVariable String userId){
        return "update userId = " + userId;
    }

    //@DeleteMapping("/mapping/users/{userId}")
    @DeleteMapping("/{userId}")
    public String deleteUser(@PathVariable String userId){
        return "delete userId = " + userId;
    }
}

package ATMtrans.controller.atmTransiesController;

import ATMtrans.domain.atmTransies.User;
import ATMtrans.factoryDomain.factoryAtmTransies.UserFactory;
import ATMtrans.service.Implement.atmTransiesServiceImpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("ATMtrans/user")

public class UserController {
    @Autowired
    private UserServiceImpl service;

    @GetMapping("/create/{userName}")
    public @ResponseBody
    User create (@PathVariable String userName, String userPassword){
        User electricity = UserFactory.getUser(userName, userPassword);
        return service.create(electricity);

    }
    @GetMapping ("/getall")
    @ResponseBody
    public Set<User> getAll(){
        return service.getAll();
    }


}

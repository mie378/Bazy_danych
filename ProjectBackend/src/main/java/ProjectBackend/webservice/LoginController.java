package ProjectBackend.webservice;

import ProjectBackend.data.users.UsersDBController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@Service
@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private UsersDBController usersDBController;

    public LoginController(UsersDBController usersDBController){
        this.usersDBController=usersDBController;
    }

    @CrossOrigin(origins="http://localhost:3000")
    @RequestMapping(path="/submit",method= RequestMethod.POST)
    public String login(String username, String password){
        return this.usersDBController.login(username,password);
    }
}

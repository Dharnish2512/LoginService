package com.dharn.loginservice.service;

import com.dharn.loginservice.entity.LoginModel;
import com.dharn.loginservice.entity.User;
import com.dharn.loginservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class LoginServiceImpl implements LoginService {
    private RestTemplate restTemplate = new RestTemplate();
    @Autowired
    private UserRepository userRepository;


    @Override
    public User checkUser(final LoginModel loginModel) {
        final User userByEmail = userRepository.findUserByEmail(loginModel.getEmail());

        if (userByEmail != null && loginModel.getPassword().equals(userByEmail.getPassword()) && loginModel.getEmail().equals(userByEmail.getEmail())) {
            String url = "http://localhost:8086/user/login/{email}";
            User forObject = restTemplate.getForObject(url, User.class, loginModel.getEmail());

            System.out.println(forObject.getEmail());
            return forObject;
        }
        return null;
    }
}


// HttpHeaders httpHeaders = new HttpHeaders();
//            httpHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//HttpEntity<LoginModel> loginModelHttpEntity = new HttpEntity<>(loginModel);
//            ResponseEntity<User> exchange = restTemplate.exchange(url, HttpMethod.POST, loginModelHttpEntity,User.class);


//        String url = "http://localhost:8086/user/login/{email}";
//        User forObject = restTemplate.getForObject(url, User.class, loginModel.getEmail());


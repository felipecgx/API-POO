    package com.jogos.api.repository;

    import com.jogos.api.dto.UserDTO;
    import com.jogos.api.model.UserEntity;
    import com.jogos.api.service.UserService;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Repository;

    import java.util.ArrayList;
    import java.util.List;

    @Repository

    public class UserRepository {

        @Autowired
        private UserService service;

        private List<UserEntity> ListUsers = new ArrayList<>();

        public void save(UserDTO user){
            UserEntity UserEnt;

            UserEnt = service.converter(user);

            ListUsers.add(UserEnt);
        }

        public int conferer(UserDTO user){
            UserEntity tmp;

            tmp = service.converter(user);

            for(int i = 0; i < ListUsers.size();i++){
                UserEntity tmp1 = ListUsers.get(i);

                if(tmp.getEmail().equals(tmp1.getEmail())){
                    return 1;
                }
            }
            return 0;
        }

        public int confererADM(UserDTO user){
            UserEntity adm;

            adm = service.converter(user);

            if(adm.getEmail().equals("adm@gmail.com") && adm.getPassword().equals("abrir")){
                return 1;
            }

            return 0;
        }
    }


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

        private UserEntity login = new UserEntity();

        private int ListConferer(UserDTO user){
            UserEntity tmp;

            tmp = service.converter(user);

            for(int i = 0; i < ListUsers.size();i++){
                UserEntity tmp1 = ListUsers.get(i);

                if(tmp.getEmail().equals(tmp1.getEmail()) && tmp.getPassword().equals(tmp1.getPassword())){
                    return 1;
                }
            }
            return 0;
        }

        private int confererADM(){

            if(this.login.getEmail().equals("adm@gmail.com") && this.login.getPassword().equals("abrir")){
                return 1;
            }

            return 0;
        }

        public int login(UserDTO user){

            int retorno;

            retorno = ListConferer(user);

            if(retorno == 0){
                return 1;
            }

            this.login.setEmail(user.getEmail());
            this.login.setPassword(user.getPassword());

            return 0;
        }

        public int LoginConferer(){
            int retorno;
            if(this.login.getEmail() == null){
                return 1;
            }
            retorno = confererADM();
            if(retorno == 1){
                return 2;
            }
            return 0;
        }
    }


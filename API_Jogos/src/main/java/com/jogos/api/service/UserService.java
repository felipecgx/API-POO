    package com.jogos.api.service;

    import com.jogos.api.dto.UserDTO;
    import com.jogos.api.model.UserEntity;
    import org.springframework.stereotype.Service;

    @Service

    public class UserService {

        public int signup(UserDTO user){

            if(user.getName().trim().equals("") || user.getName().trim().split(" ").length < 2){
                return 1;
            }
            if(!user.getEmail().contains("@")){
                return 2;
            }
            if(user.getPassword().length() < 4){
                return 3;
            }

            return 0;
        }

        public UserEntity converter(UserDTO dto){
            UserEntity entity = new UserEntity();

            entity.setName(dto.getName());
            entity.setEmail(dto.getEmail());
            entity.setPassword(dto.getPassword());

            return entity;
        }


    }

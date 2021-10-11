    package com.jogos.api.service;

    import com.jogos.api.dto.UserDTO;
    import com.jogos.api.model.UserEntity;
    import com.jogos.api.repository.UserInterfaceRepository;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Service;

    @Service

    public class UserService {

        @Autowired
        private UserInterfaceRepository userInterfaceRepo;

        public int signup(UserDTO user){

            //mudar autenticação para não ficar parecido com o do professor
            if(user.getName().trim().equals("") || user.getName().trim().split(" ").length < 2){
                return 1;
            }
            if(!user.getEmail().contains("@")){//mudar as validações do email 1h 37min Aula 06
                return 2;//usar
            }
            if(validatePassword(user.getPassword())==false){//usar métodos privados para validar (encapsulamento)
                return 3;   //se a validação for false, entra e retorna o erro
            }

            //encapsular as regras de negócio

            return 0;
        }

        /*public List<UserDTO> getUsers(String name) {
            String filter = name != null ? name : "";
            Optional<List<UserEntity>> result = userInterfaceRepo.findByNameContaining(filter);

            List<UserDTO> lst = new ArrayList<>();

            if (result.isPresent()) {
                List<UserEntity> users = result.get();
                for (UserEntity u : users) {
                    UserDTO dto = new UserDTO(u.getId(), u.getName(), u.getEmail(), u.getPassword());
                    lst.add(dto);
                }
            }

            return lst;
        }*/

        //professor usou isso no fim da aula


        public UserEntity converter(UserDTO dto){
            UserEntity entity = new UserEntity();

            entity.setName(dto.getName());
            entity.setEmail(dto.getEmail());
            entity.setPassword(dto.getPassword());

            userInterfaceRepo.save(entity); //vai dar update e salvar os novos dados no banco de dados

            return entity;
        }

        private boolean validatePassword(String senha){//executar um método passando por cima da classe pai = polimorfismo
           if(senha.length() < 4){
               return false;
               //pelo menos 2 numeros e 1 caracter maiusculo e minusculo
           }else{
               return true;
           }
        }




    }

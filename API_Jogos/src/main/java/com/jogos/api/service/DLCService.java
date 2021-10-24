    package com.jogos.api.service;

    import com.jogos.api.dto.DLCDTO;
    import com.jogos.api.dto.GameDTO;
    import com.jogos.api.model.DLCEntity;
    import com.jogos.api.model.GameEntity;
    import com.jogos.api.repository.DLCRepository;
    import com.jogos.api.repository.GameRepository;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Service;
    import org.yaml.snakeyaml.events.Event;

    import java.util.ArrayList;
    import java.util.List;
    import java.util.Optional;

    @Service

    public class DLCService extends GameService{ //ALTERAR COM EXTENDS

        @Autowired
        private DLCRepository repo;

        @Autowired
        private GameRepository grepo;

        public List<DLCDTO> getDLC(String ownedGameName){

            List<DLCDTO> list = new ArrayList<>();
            List<DLCEntity> DLCList = repo.findByOwnedGame(ownedGameName);

            for(int i = 0; i < DLCList.size();i++){

                DLCEntity enty = DLCList.get(i);

                DLCDTO DTO = new DLCDTO();

                //exclusivos da DLC
                DTO.setId(enty.getId());
                DTO.setOwnedGame(enty.getOwnedGame());
                //

                DTO.setName(enty.getName());
                DTO.setReleaseDate(enty.getReleaseDate());
                DTO.setDescription(enty.getDescription());
                DTO.setDeveloper(enty.getDeveloper());
                DTO.setDistributor(enty.getDistributor());
                DTO.setScore(enty.getScore());
                DTO.setPrice(enty.getPrice());
                DTO.setGenre(enty.getGenre());
                DTO.setRating(enty.getRating());

                list.add(DTO);

            }
                return list;
        }

        public int NameConferer(String ownedGame){

            Optional<GameEntity> Enty = grepo.findByName(ownedGame);

            if(Enty.get().isHasDLC() == false){
                return 1;
            }else{
                return 0;
            }
        }

        public boolean IDExists(Long ID){

            return repo.existsById(ID);
        }

        public void update(DLCEntity DLC, Long id){

            Optional<DLCEntity> enty = repo.findById(id);

            if(enty.isPresent()){

                DLCEntity enty_update = enty.get();

                enty_update.setOwnedGame(DLC.getOwnedGame());

                //não mudou mesmo apagando as funções no dlc entity
                enty_update.setName(DLC.getName());
                enty_update.setReleaseDate(DLC.getReleaseDate());
                enty_update.setDescription(DLC.getDescription());
                enty_update.setDeveloper(DLC.getDeveloper());
                enty_update.setPeopleInvolved(DLC.getPeopleInvolved());
                enty_update.setSoldCopies(DLC.getSoldCopies());
                enty_update.setDistributor(DLC.getDistributor());
                enty_update.setScore(DLC.getScore());
                enty_update.setPrice(DLC.getPrice());
                enty_update.setGenre(DLC.getGenre());
                enty_update.setRating(DLC.getRating());
                //

                repo.save(enty_update);
            }

        }

    }

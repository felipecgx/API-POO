    package com.jogos.api.service;

    import com.jogos.api.dto.UserDTO;
    import com.jogos.api.model.UserEntity;
    import com.jogos.api.repository.UserRepository;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Service;

    import java.util.Optional;
    import java.util.regex.Matcher;
    import java.util.regex.Pattern;


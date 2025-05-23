package timetogeter.global.security.util.jwt;

import org.springframework.security.core.Authentication;
import timetogeter.context.auth.application.dto.TokenCommand;

public interface TokenProvider {
    String validateToken(String token);
    TokenCommand generateToken(Authentication authentication);
}

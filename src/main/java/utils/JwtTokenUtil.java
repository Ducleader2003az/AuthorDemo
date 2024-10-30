package utils;

import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

import javax.crypto.SecretKey;
import java.util.Base64;

public class JwtTokenUtil {
    public byte[] generateSecretKey(){
        SecretKey secretKey = Keys.secretKeyFor(SignatureAlgorithm.HS256);
        String base64SecretKey = Base64.getEncoder().encodeToString(secretKey.getEncoded());

        return base64SecretKey.getBytes();
    }
}

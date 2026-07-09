package com.cognizant.jwt_handson.util;

import java.security.Key;
import java.util.Date;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

public class JwtUtil {

    // 32+ character secret key (256 bits)
    private static final String SECRET =
            "mysecretkeymysecretkeymysecretkey123";

    private static final Key KEY =
            Keys.hmacShaKeyFor(SECRET.getBytes());

    public static String generateToken(String username) {

        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 20 * 60 * 1000))
                .signWith(KEY, SignatureAlgorithm.HS256)
                .compact();
    }
}
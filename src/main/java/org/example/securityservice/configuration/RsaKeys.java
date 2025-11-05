package org.example.securityservice.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;

@ConfigurationProperties(prefix = "rsa")
//@EnableConfigurationProperties(RsaKeys.class)
public record RsaKeys(RSAPublicKey publicKey, RSAPrivateKey privateKey) {

}
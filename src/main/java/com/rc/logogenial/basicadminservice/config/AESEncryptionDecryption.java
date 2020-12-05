package com.rc.logogenial.basicadminservice.config;

        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.beans.factory.annotation.Value;

        import java.nio.charset.StandardCharsets;
        import java.security.MessageDigest;
        import java.security.NoSuchAlgorithmException;
        import java.util.Arrays;
        import java.util.Base64;
        import javax.crypto.Cipher;
        import javax.crypto.spec.SecretKeySpec;

/**
 * Java String Encryption Decryption Example
 * @author Ramesh Fadatare
 *
 */
public class AESEncryptionDecryption {
    private static SecretKeySpec secretKey;
    private static byte[] key;

    @Value("${app.encode.secret}")
    private String secret="GEN1AL4PP-DAT4";

    @Value("${app.encode.method}")
    private String encodeMethod="SHA1";

    private static final String ALGORITHM = "AES";

    @Value("${client.keystore.type}")
    public void setSecret(String keystoreType) {
        this.secret = keystoreType;
    }


    public AESEncryptionDecryption() {

    }

    public void prepareSecreteKey(String myKey) {
        MessageDigest sha = null;
        try {
            key = myKey.getBytes(StandardCharsets.UTF_8);
            sha = MessageDigest.getInstance(encodeMethod);
            key = sha.digest(key);
            key = Arrays.copyOf(key, 16);
            secretKey = new SecretKeySpec(key, ALGORITHM);
        } catch (NoSuchAlgorithmException e) {
            System.out.println("Error while preparing SecretKey: " + e.toString());
        }
    }

    public String encrypt(String strToEncrypt) {
        try {
            prepareSecreteKey(secret);
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            return Base64.getEncoder().encodeToString(cipher.doFinal(strToEncrypt.getBytes("UTF-8")));
        } catch (Exception e) {
            System.out.println("Error while encrypting: " + e.toString());
        }
        return null;
    }

    public String decrypt(String strToDecrypt) {
        try {
            prepareSecreteKey(secret);
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            return new String(cipher.doFinal(Base64.getDecoder().decode(strToDecrypt)));
        } catch (Exception e) {
            System.out.println("Error while decrypting: " + e.toString());
        }
        return null;
    }

}
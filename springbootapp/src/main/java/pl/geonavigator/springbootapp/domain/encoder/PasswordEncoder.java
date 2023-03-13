package pl.geonavigator.springbootapp.domain.encoder;

public interface PasswordEncoder {
    String encode(String text);
    boolean check(String text, String hashed);
}

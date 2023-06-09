package shop.mtcoding.village.dto;

import lombok.Getter;
import lombok.Setter;
import shop.mtcoding.village.model.User;

public class UserRequest {

    @Getter
    @Setter
    public static class JoinDTO {
        private String username;
        private String password;
        private String email;
        private String role;

        public User toEntity() {
            return User.builder()
                    .username(username)
                    .password(password)
                    .email(email)
                    .role(role)
                    .status(true)
                    .build();
        }
    }

    // username 필터를 리빌딩하는건 추천하지 않음 dto 에서 AOP사용하는게 더 편함 
    @Getter
    @Setter
    public static class LoginDTO {
        private String username;
        private String password;
    }
}

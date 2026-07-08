package ru.yandex.courier;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.apache.commons.lang3.RandomStringUtils;

@Data
@AllArgsConstructor
public class CourierCreate {
    private String login;
    private String password;
    private String firstName;

    // метод генерирует рандомные значения для логина, пароля и имени
    public static CourierCreate getGeneratorDataCourier() {
        String login = RandomStringUtils.randomAlphabetic(12);
        String password = RandomStringUtils.randomAlphabetic(6);
        String firstName = RandomStringUtils.randomAlphabetic(10);
        return new CourierCreate(login, password, firstName);
    }
}

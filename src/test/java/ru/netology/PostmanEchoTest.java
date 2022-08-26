package ru.netology;

import io.restassured.http.ContentType;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class PostmanEchoTest {

    @Test
    void shouldReturnPost() {

// Given - When - Then
// Предусловия
        given()
                .baseUri("https://postman-echo.com")
                .body("some data") // отправляемые данные (заголовки и query можно выставлять аналогично)
// Выполняемые действия
                .when()
                .post("/post")
// Проверки
                .then()
                .statusCode(200)
                .body("data",equalTo("some data"))

//                .body("",equalTo("some data"))
//                .body("data", equalTo("1"))


        ;
    }
}
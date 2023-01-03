package io.swagger.petstore.petstoreinfo;

import io.restassured.response.ValidatableResponse;
import io.swagger.petstore.constants.EndPoint;
import io.swagger.petstore.model.UserPojo;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class UserSteps {


    @Step("Creating user record with id: {0}, username: {1}, firstName: {2}, lastName: {3}, email: {4}, password: {5}, phone: {6} and userStatus: {7}  ")
    public ValidatableResponse createUserByUserName(int id, String username, String firstName, String lastName, String email, String password, String phone, int userStatus) {

        UserPojo userPojo = new UserPojo();
        userPojo.setId(id);
        userPojo.setUsername(username);
        userPojo.setFirstName(firstName);
        userPojo.setLastName(lastName);
        userPojo.setEmail(email);
        userPojo.setPassword(password);
        userPojo.setPhone(phone);
        userPojo.setUserStatus(userStatus);

        return SerenityRest.given().log().all()
                .header("Content-Type", "application/json")
                .header("accept", "application/json")
                .when()
                .body(userPojo)
                .post(EndPoint.POST_USER)
                .then().log().all().statusCode(200);
    }

    @Step("Getting user record with username: {0}")
    public ValidatableResponse getUserByUserName(String username) {
        return SerenityRest.given().log().all()
                .when()
                .pathParam("username", username)
                .get(EndPoint.GET_USER)
                .then().log().all();
    }

    @Step("Updating existing user record with id: {0}, username: {1}, firstName: {2}, lastName: {3}, email: {4}, password: {5}, phone: {6} and userStatus: {7}  ")
    public ValidatableResponse updateUserByUserName(int id, String username, String firstName, String lastName, String email, String password, String phone, int userStatus) {
        UserPojo userPojo = new UserPojo();
        userPojo.setId(id);
        userPojo.setUsername(username);
        userPojo.setFirstName(firstName);
        userPojo.setLastName(lastName);
        userPojo.setEmail(email);
        userPojo.setPassword(password);
        userPojo.setPhone(phone);
        userPojo.setUserStatus(userStatus);

        return SerenityRest.given().log().all()
                .header("Content-Type", "application/json")
                .pathParam("username", username)
                .when()
                .body(userPojo)
                .put(EndPoint.UPDATE_USER)
                .then().log().all().statusCode(200);
    }

    @Step("Deleting existing user record with username: {0}")
    public void deleteUserByUserName(String username) {

        SerenityRest.given().log().all()
                .when()
                .pathParam("username", username)
                .delete(EndPoint.DELETE_USER)
                .then().log().all().statusCode(200);
    }

}

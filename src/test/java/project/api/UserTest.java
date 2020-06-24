package project.api;

import by.stormnet.core.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import project.api.entities.UserService;

public class UserTest {
    private UserService userService = new UserService();

    @Test
    public void AddUserTest() {
        String body = "{\n" +
                " \"name\": \"morpheus\",\n" +
                " \"job\": \"leader\"\n" +
                "}";
        Response response = userService.postTest();
        int code = response.getCode();
        Assert.assertTrue(code == 201, "User is not created");
    }

    @Test
    public void UpdateUserTest() {
        String body = "{\n" +
                " \"name\": \"morpheus\",\n" +
                " \"job\": \"zion resident\"\n" +
                "}";
        Response response = userService.putTest();
        int code = response.getCode();
        Assert.assertTrue(code == 200, "User is not updated");
    }

    @Test
    public void DeleteUserTest() {
        Response response = userService.deleteTest();
        int code = response.getCode();
        Assert.assertTrue(code == 204, "User is not deleted");
    }
}

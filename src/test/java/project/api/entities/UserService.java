package project.api.entities;

import by.stormnet.core.FrameworkHttpClient;
import by.stormnet.core.Response;

public class UserService extends AbstractServiceTest{

    private FrameworkHttpClient client = new FrameworkHttpClient();
    private String testPutUrl = URL + "/api/users";
    private String testPostUrl = URL + "/api/users/2";
    private String testDeleteUrl = URL + "/api/users/2";
    private String bodyPost = "{\n" +
            " \"name\": \"morpheus\",\n" +
            " \"job\": \"leader\"\n" +
            "}";
    private String bodyPut = "{\n" +
            " \"name\": \"morpheus\",\n" +
            " \"job\": \"zion resident\"\n" +
            "}";;;

    public Response putTest() {
        System.out.println("User is updated");
        return client.doPut(testPutUrl, bodyPut);
    }

    public Response postTest() {
        System.out.println("User is created");
        return client.doPost(testPostUrl, bodyPost);
    }

    public Response deleteTest() {
        System.out.println("User is deleted");
        return client.doDelete(testDeleteUrl);
    }
}

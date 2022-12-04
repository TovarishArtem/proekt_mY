
public class VK_API {
    private final int APP_ID = 51492888;
    private final String CODE = "qYF4V1Q1HuS4oDh3MiJ6";
    private final VkApiClient vk;
    private final UserActor actor;

    public VkRepository() {
        TransportClient transportClient = new HttpTransportClient();
        vk = new VkApiClient(transportClient);
        actor = new UserActor(APP_ID, CODE);
    }
}
package BDD.Resources;

public enum RESTResource {

    addPlace("/maps/api/place/add/json"),
    getPlace("/maps/api/place/get/json"),
    deletePlace("/maps/api/place/delete/json");

    private String action = "";

    RESTResource(String action)
    {
        this.action=action;
    }

    public String getAction()
    {
        return action;
    }
    
}

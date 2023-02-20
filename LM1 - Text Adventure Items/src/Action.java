public class Action {
    private Method method;
    private String movement;
    private String name;
    public String getMovement(){
        return movement;
    }
    public void setMovement(String movement){
        this.movement = movement;
    }
    public void setName(String name){
        this.name = name;
    }
    public Action(Method method, String movement, String name){
        this.method = method;
        this.movement = movement;
        this.name = name;
    }
    public String charAction(){
        return movement + ": " + name;
    }
}

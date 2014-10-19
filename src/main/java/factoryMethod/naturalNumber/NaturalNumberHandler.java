package factoryMethod.naturalNumber;

public class NaturalNumberHandler {

    private NaturalNumberCreator creator;

    public void setCreator(NaturalNumberCreator creator) {
        this.creator = creator;
    }
    
    public NaturalNumberCreator getCreator() {
        assert this.creator != null;
        return this.creator;
    }
}

package designpattern.mediator;

/**
 * @author flowerwine
 * @projectName Algorithm
 */
public class SelectHouse implements Procedure {
    private Mediator mediator;
    private String name;

    public SelectHouse(Mediator mediator) {
        this.mediator = mediator;
        this.name = "选房";
        this.mediator.add(this);
    }

    @Override
    public void handle(String message) {

    }

    @Override
    public String getName() {
        return name;
    }
}

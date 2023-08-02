package composite;

import java.util.Arrays;
import java.util.List;

public class CompoundShape extends BaseShape {
    private List<BaseShape> components;

    public CompoundShape(BaseShape... components) {
        this.components = Arrays.asList(components);
    }

    public void print() {
        components.forEach(BaseShape::print);
    }
}

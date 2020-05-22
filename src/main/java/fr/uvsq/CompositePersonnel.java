package fr.uvsq;

import java.util.ArrayList;
import java.util.List;

public class CompositePersonnel implements InterfacePersonnel {

    private List<InterfacePersonnel> childInterfacePersonnel = new ArrayList<InterfacePersonnel>();

    @Override
    public void print() {
        for (InterfacePersonnel interP : childInterfacePersonnel) {
            interP.print();
        }
    }

    public void add(InterfacePersonnel interP) {
        childInterfacePersonnel.add(interP);
    }

    public void remove(InterfacePersonnel interP) {
        childInterfacePersonnel.remove(interP);
    }
}

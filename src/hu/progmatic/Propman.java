package hu.progmatic;

import java.util.Arrays;

public class Propman extends TheatricalGroupMember {

    private String[] props;

    public Propman() {
    }

    public Propman(String[] props) {
        this.props = props;
    }

    public Propman(String name, int salary, String[] props) {
        super(name, salary);
        this.props = props;
    }

    public String[] getProps() {
        return props;
    }

    public void setProps(String[] props) {
        this.props = props;
    }

    @Override
    public String toString() {
        return "\n============================\n" +
                "\nPropman " +
                "\nprops = " + Arrays.toString(props) +
                "\nname = " + name + '\'' +
                "\nsalary = " + salary +
                '\n';
    }
}

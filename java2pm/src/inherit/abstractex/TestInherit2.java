package inherit.abstractex;

public class TestInherit2 {

public static void main(String[] args) {

//RBIBank r = new RBIBank(); OBJ CANNOT BE CREATED FOR Abstract class

RBIBank r = new Icici();

r.createAccount(); // RBI
r.processLoan(); // ICICI
r.createPPF(); // ICICI

}
}



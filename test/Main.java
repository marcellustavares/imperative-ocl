import org.orcas.iocl.Iocl;
import org.orcas.iocl.exp.OclExpression;

public class Main {

    public static void main(String[] args) throws Exception {
        String exp = "1*(2-1)";


        Iocl iocl = Iocl.getInstance();

        OclExpression oclExpression = iocl.parse(exp);

        System.out.println(oclExpression);
    }

}
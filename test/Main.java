import org.orcas.iocl.cst.IOCLExpressionCS;
import org.orcas.iocl.cst.OperationCallExpCS;
import org.orcas.iocl.exception.IOCLException;
import org.orcas.iocl.parser.IOCLParserUtil;


public class Main {

    public static void main(String[] args) throws IOCLException {
        String exp = "Sequence{}->size()";

        IOCLExpressionCS ioclExp = IOCLParserUtil.parse(exp);

        OperationCallExpCS oc = (OperationCallExpCS) ioclExp;

        int i = -2 * +2;

        System.out.println(oc.getSource());
        System.out.println(oc.getSimpleNameCS().getValue());
    }

}
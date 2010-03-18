import org.orcas.compiler.JavaVisitor;
import org.orcas.iocl.exception.IOCLException;
import org.orcas.iocl.exp.IOCLExpression;
import org.orcas.iocl.handler.IOCLHandlerUtil;

public class Test {

    public static void main(String[] args) throws Exception {

        String exp = "'marcellus'";

        try {
            IOCLExpression ioclExp = IOCLHandlerUtil.parseIOCLExpression(exp);

            JavaVisitor javaVisitor = new JavaVisitor();

            System.out.println(ioclExp.accept(javaVisitor));

        } catch (IOCLException e) {
            e.printStackTrace();
        }
    }

}
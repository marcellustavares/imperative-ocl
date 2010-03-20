import junit.framework.TestCase;

import org.orcas.iocl.cst.BooleanLiteralExpCS;
import org.orcas.iocl.cst.IOCLExpressionCS;
import org.orcas.iocl.cst.IntegerLiteralExpCS;
import org.orcas.iocl.cst.RealLiteralExpCS;
import org.orcas.iocl.cst.StringLiteralExpCS;
import org.orcas.iocl.exception.IOCLException;
import org.orcas.iocl.parser.IOCLParserUtil;

public class TestPrimitiveLiteralExp extends TestCase {

    public void testBooleanLiteralExp() throws IOCLException {
        exp = "true";
        ioclExp = IOCLParserUtil.parse(exp);

        assertTrue(ioclExp instanceof BooleanLiteralExpCS);

        exp = "false";
        ioclExp = IOCLParserUtil.parse(exp);

        assertTrue(ioclExp instanceof BooleanLiteralExpCS);
    }

    public void testIntegerLiteralExp() throws IOCLException {
        exp = "2";
        ioclExp = IOCLParserUtil.parse(exp);

        assertTrue(ioclExp instanceof IntegerLiteralExpCS);
    }

    public void testRealLiteralExp() throws IOCLException {
        exp = "2.2";
        ioclExp = IOCLParserUtil.parse(exp);

        assertTrue(ioclExp instanceof RealLiteralExpCS);
    }

    public void testStringLiteralExp() throws IOCLException {
        exp = "'marcellus'";
        ioclExp = IOCLParserUtil.parse(exp);

        exp = "'\u4147 ok'  ";
        ioclExp = IOCLParserUtil.parse(exp);

        exp = "' t  e\t\nst '      ";
        ioclExp = IOCLParserUtil.parse(exp);

        assertTrue(ioclExp instanceof StringLiteralExpCS);
    }

    protected String exp;
    protected IOCLExpressionCS ioclExp;

}
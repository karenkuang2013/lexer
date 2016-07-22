package codegen;

/** The Code class records bytecode information
*/
public class Code {
    private Codes.ByteCodes bytecode;

    /**
     *
     * @param code
     */
    public Code(Codes.ByteCodes code) {
        bytecode = code;
    }

    /**
     *
     * @return
     */
    public Codes.ByteCodes getBytecode() {
        return bytecode;
    }

    public String toString() {
        return bytecode.toString();
    }

    /**
     *
     */
    public void print() {
        System.out.println(toString());
    }
}


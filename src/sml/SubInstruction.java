package sml;

/**
 * This class subtracts 2 instructions and places the result into a specified register
 *
 * @author James Thornton
 */

public class SubInstruction extends Instruction {

    public SubInstruction(String label, int result, int op1, int op2) {
        super(label, "sub", result, op1, op2);
    }

    @Override
    public void execute(Machine m) {

        int value1 = m.getRegisters().getRegister(op1);
        int value2 = m.getRegisters().getRegister(op2);
        m.getRegisters().setRegister(result, value1 - value2);
    }

    @Override
    public String toString() {
        return super.toString() + " " + op1 + " - " + op2 + " to " + result;
    }
}

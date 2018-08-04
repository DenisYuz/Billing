package billing;

public class RegCustomer extends Customer {

    RegCustomer(String m_cuName, double m_cuCurrentBill) {
        super(m_cuName, m_cuCurrentBill);
    }

    public RegCustomer(String name) {
        super(name);
    }

    @Override
    void addToBill(double billToAdd) {
        this.m_cuCurrentBill += billToAdd;
    }
}

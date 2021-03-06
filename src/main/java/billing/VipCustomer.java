package billing;

public class VipCustomer extends Customer implements IPresent {

    private double bilingFactor = 0.8;

    VipCustomer(String m_cuName, double m_cuCurrentBill) {
        super(m_cuName, m_cuCurrentBill);
    }

    public VipCustomer(String name) {
        super(name);
    }

    @Override
    void addToBill(double billToAdd) {
        this.m_cuCurrentBill += bilingFactor * billToAdd;
    }

    @Override
    public String toString() {
        return "VipCustomer{" +
                "m_cuName='" + m_cuName + '\'' +
                ", m_cuCurrentBill=" + m_cuCurrentBill +
                '}';
    }

    @Override
    public void receivedPresent(String present) {
        System.out.println("VIP customer received present: " + present);
    }
}

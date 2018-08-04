package billing;

abstract public class Customer {
    String m_cuName;
    double m_cuCurrentBill;

    public String get_Name() {
        return m_cuName;
    }

    public double get_CurrentBill() {
        return m_cuCurrentBill;
    }

    public void init(String Name, double currentBill) {
        this.m_cuName = Name;
        this.m_cuCurrentBill = currentBill;
    }

    Customer(String m_cuName, double m_cuCurrentBill) {
        this.m_cuName = m_cuName;
        this.m_cuCurrentBill = m_cuCurrentBill;
    }

    Customer(String name) {
        this.m_cuName = name;
        this.m_cuCurrentBill = 0;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "m_cuName='" + m_cuName + '\'' +
                ", m_cuCurrentBill=" + m_cuCurrentBill +
                '}';
    }

    abstract void addToBill(double billToAdd);
}

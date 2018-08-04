package billing;

public class Manager implements IPresent {
    public String get_ManagerName() {
        return m_ManagerName;
    }

    public void set_ManagerName(String m_ManagerName) {
        this.m_ManagerName = m_ManagerName;
    }

    private String m_ManagerName;

    Manager(String m_ManagerName) {
        this.m_ManagerName = m_ManagerName;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "m_ManagerName='" + m_ManagerName + '\'' +
                '}';
    }

    @Override
    public void receivedPresent(String present) {
        System.out.println("Manager received present: " + present);
    }
}

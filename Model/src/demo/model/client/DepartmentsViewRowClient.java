package demo.model.client;

import oracle.jbo.client.remote.RowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Jan 30 16:37:31 MSK 2014
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class DepartmentsViewRowClient extends RowImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public DepartmentsViewRowClient() {
    }

    public Integer getDepartmentId() {
        return (Integer) getAttribute("DepartmentId");
    }

    public void setDepartmentId(Integer value) {
        setAttribute("DepartmentId", value);
    }

    public String getDepartmentName() {
        return (String) getAttribute("DepartmentName");
    }

    public void setDepartmentName(String value) {
        setAttribute("DepartmentName", value);
    }

    public Integer getManagerId() {
        return (Integer) getAttribute("ManagerId");
    }

    public void setManagerId(Integer value) {
        setAttribute("ManagerId", value);
    }

    public Integer getLocationId() {
        return (Integer) getAttribute("LocationId");
    }

    public void setLocationId(Integer value) {
        setAttribute("LocationId", value);
    }
}


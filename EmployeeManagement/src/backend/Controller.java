package backend;


public class Controller {

    IEmployeeManagement employeeManagement;

    public Controller(){
        employeeManagement = new EmployeeManagement();
    }

    public void addCanBo(){
        employeeManagement.addCanBo();
    }
    public void timKiemTheoTen(){

        employeeManagement.timKiemTheoTen();
    }

    public void hienThiThongTin(){
        employeeManagement.hienThiThongTin();
    }
    public void xoaCanBo(){
        employeeManagement.xoaCanBo();
    }
}

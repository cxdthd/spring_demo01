package spring5.bean;

/**
 * @author YANG
 * @create 2021-07-24 11:08
 */
//员工类
public class Emp {
    private String ename;
    private String gender;
    //员工属于某一个部门，使用对象形式表示
    private Dept dept;

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void test() {
        System.out.println(ename + ":" + gender + ":" + dept);
    }
}

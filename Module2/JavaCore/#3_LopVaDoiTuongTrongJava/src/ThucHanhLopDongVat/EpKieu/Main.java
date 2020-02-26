package ThucHanhLopDongVat.EpKieu;

class Parent {
    public void disp() {
        System.out.println("Parent disp called");
    }
}
class Child extends Parent {
    public void disp()
    {
        System.out.println("Child disp called");
    }
    public static void main(String args[])
    {
        Parent p = new Child();
        p.disp();
        Child c = (Child) p;
        c.disp();
    }
}

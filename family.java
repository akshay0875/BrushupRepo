public class family extends child {

    public static void main(String[] args) {
        grandparent g = new grandparent();
        parent p = new parent();
        child c = new child();

        g.member();
        p.member();
        c.member();

    }
}

class grandparent{
    void member(){
        System.out.println("this is grandparent class");
    }
}

class parent extends grandparent{
    @Override
    void member() {
        System.out.println("this is the parent class");
    }
}

class child extends parent {

    @Override
    void member() {
        System.out.println(" this is the child class");
    }
}

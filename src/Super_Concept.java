public class Super_Concept {
    int id;
    String name;
    void setName(String name)
    {
        this.name=name;

    }
    void setId(int id )
    {
        this.id=id;
    }

}

class SecondClass extends Super_Concept{
    void display()
    {


        System.out.println("Details is here "+id+" "+name);

    }
    void dis()
    {
        System.out.println(super.id);
        super.setName("Rajdev");
        display();
    }

    public static void main(String [] args)
    {

        SecondClass secondClass=new SecondClass();
        secondClass.setName("Digamber Singh");
        secondClass.setId(22536750);
        secondClass.display();
        secondClass.dis();
    }
}

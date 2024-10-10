class Aggregation
{
    
    int a;
    int b;
    Aggregation(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
}
class Aggreg
{
    Aggregation f;
    int a;
    int b;
    Aggreg(int a,int b,Aggregation f)
    {
        this.a=a;
        this.b=b;
        this.f=f;
    }
    public void disp()
    {
        System.out.println(a);
        System.out.println(b);
        System.out.println(f.a);//parent class variables
        System.out.println(f.b);//parent class variables
    }
    public static void main(String arg[])
    {
        Aggregation h=new Aggregation(12,13);
        
        Aggreg j=new Aggreg(29,8,h);
       
        j.disp();
    }
}
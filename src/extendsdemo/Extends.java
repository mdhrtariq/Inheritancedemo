package extendsdemo;
class Admin {
       public void show(int i ,int j )
       {
           System.out.println(i+j);
        }
}

class Extendstrail
{
    public static void main(String[] args)
    {
        Admin obj = new Admin();
        obj.show(4,15);
    }
}
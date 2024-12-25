import java.util.Scanner;
class student
{
    int i=0,j;
    Scanner sc = new Scanner(System.in);
    int sid[] = new int[10];
    String name[] = new String[10];
    String city[] = new String[10];
    String mob[] = new String[10];

    public void input()
    {
        System.out.println("enter sid:");
        sid[i] = sc.nextInt();
        System.out.println("enter name:");
        name[i] = sc.next();
        System.out.println("enter city:");
        city[i] = sc.next();
        System.out.println("enter mobile number:");
        mob[i] = sc.next();
        i++;
    }
    public void display()
    {
       System.out.println("sid\tname\tcity\tmob");
       System.out.println("--------------------------------------");
       for(j=0;j<i;j++)
       {
        System.out.println(sid[j]+"\t"+name[j]+"\t"+city[j]+"\t"+mob[j]);
       }
    }
    public void delete()
    {
        System.out.println("enter stduent id:");
        int id = sc.nextInt();
        for(j=0;j<i;j++)
        {
            if(id==sid[j])
            {
                for(int k=j;k<=i;k++)
                {
                    sid[k]=sid[j+1];
                    name[k]=name[j+1];
                    city[k]=city[j+1];
                    mob[k]=mob[j+1];
                }
            }
        }
        i--;

    }
    public void update()
    {
        System.out.println("enter student id:");
       int id = sc.nextInt();
       for(j=0;j<i;j++)
       {
        if(id==sid[j])
        {
            System.out.println("id:" + sid[j]);
            System.out.println("1.name: "+ name[j]);
            System.out.println("2.city: "+ city[j]);
            System.out.println("3.mobno: "+ mob[j]);
            System.out.println("enter choice");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                System.out.println("enter new student name:");
                String new_name = sc.next();
                name[j]=new_name;
                System.out.println("record updated");
                break;
                case 2:
                System.out.println("enter new city name: ");
                String new_city = sc.next();
                city[j]=new_city;
                System.out.println("record updated");    
                break;
                case 3:
                System.out.println("enter new mob number: ");
                String new_no = sc.next();
                mob[j]=new_no;
                System.out.println("record updated");
                break;        
                default:
                System.out.println("invalid choice");
                    break;
            }
        }
       }
    }
    
}
class info {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       student obj = new student();
       while (true) {
        System.out.println("1. Input Data");
       System.out.println("2. Display data");
       System.out.println("3. delete data");
       System.out.println("4. update Data");
       System.out.println("5. exit");
       System.out.println("enter your choice:");
       int n = sc.nextInt();
       switch (n) {
        case 1:
        obj.input();
            break;
       case 2:
       obj.display();
       break;
       case 3:
       obj.delete();
       break;
       case 4:
       obj.update();
       break;
       case 5:
       System.out.println("Exiting...");
       System.exit(0);
        default:
        System.out.println("invalid choice");
            break;
       }
       }
           
        }

    }
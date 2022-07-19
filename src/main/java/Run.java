import org.w3c.dom.ls.LSOutput;

public class Run {
    public static void main(String[] args) {
        String name = "Damian";
        int age = 30;
        boolean isManager = false;
        double salary = 10.500;
        Student Seba;
        String myBestFriend;
        myBestFriend = "Adi";
        String browser = "COS";
        String driver;
        switch (browser) {
            case "Chrome":
                driver = "ChromeDriver";
                System.out.println("I choose Chrome driver");
                break;
            case "Firefox":
                driver = "FirefoxDriver";
                System.out.println("I choose Firefox driver");
                break;
            case "Opera":
                driver = "OperDriver";
                System.out.println("I choose Opera driver");
                break;
            default:
                System.out.println("Wybrałeś przeglądarkę spoza listy");
        }
        int multiLotek []={1,2,3,4};
        //6 to liczba miejsc w tablicy
        int liczbyTotolotek[] = new int[6];
        liczbyTotolotek[0] = 21230;
        liczbyTotolotek[1] = 3120;
        liczbyTotolotek[2] = 4320;
        liczbyTotolotek[3] = 5420;
        liczbyTotolotek[4] = 61230;
        liczbyTotolotek[5] = 2310;
        System.out.println(liczbyTotolotek[5]);

        String family[] = new String[4];
        family[0]= "Andrzej";
        family[1]="Mateusz";
        family[2]="Jacek";
        family[3]="Zbigniew";
        System.out.println(family[0]);
        System.out.println("Ilość członków rodziny " + family.length);

//nazwa tablicy .for i to się samo nazywa jako zmienna 's', szybki sout - s.sout
        for (String s : family) {
            System.out.println(s);
        }
    }
}

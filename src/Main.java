public class Main {

    public static void main(String[] args) {

        //the setup of the games we will be working or detailing
        Game WoW = new Game();

        Game LoL = new Game();

        Game CsGo = new Game();

        Game Minecraft = new Game();

        //dates of release year
        WoW.setAgeOfGame(2004);
        LoL.setAgeOfGame(2009);
        CsGo.setAgeOfGame(2012);
        Minecraft.setAgeOfGame(2009);

        //company notating
        WoW.setCompany("Blizzard");
        LoL.setCompany("Riot Games");
        CsGo.setCompany("Valve");


        //notation of copies sold
        WoW.setCopiesSold(100000000);
        LoL.setCopiesSold(0);
        CsGo.setCopiesSold(25000000);
        Minecraft.setCopiesSold(176000000);

        System.out.println("WoW age is " + WoW.getAge());
        System.out.println("LoL age is " + LoL.getAge());
        System.out.println("CsGo age is" + CsGo.getAge());
        System.out.println("Minecraft age is" + Minecraft.getAge());

        System.out.println("The Company of WoW is " + WoW.getCompany() );
        System.out.println("The Company of LoL is " + LoL.getCompany() );
        System.out.println("The Company of CsGo is " + CsGo.getCompany() );
        System.out.println("The Company of Minecraft is " + Minecraft.getCompany() );


        System.out.println("in WoW there have been " + WoW.getCopiesSold() +" accounts since 2004 ");
        System.out.println("LoL is free therefore " + LoL.getCopiesSold() + " sales of copies");
        System.out.println("CsGo have sold around " + CsGo.getCopiesSold());
        System.out.println("Minecraft have sold " + Minecraft.getCopiesSold());




    }
}

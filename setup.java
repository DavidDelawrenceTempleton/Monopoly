import javax.swing.JOptionPane;


public class setup {
	
	public static Players [] playerSetup()
	{
		Object[] lOptions = {"2","3","4"};
		boolean bStarted = false;
		Players [] aPlayers;
		do{
			//keep null, Prompt, Title of box, Type of message, icon {ignore this}, object[] containing options, default anwser
			String sPlayerCount = (String)JOptionPane.showInputDialog(null, "Select Number of Players", "Players", JOptionPane.PLAIN_MESSAGE, null, lOptions, "2");
			//System.out.println(playerCount);
			if (sPlayerCount == null){
				Menu.QuitPrompt();
			}
			int iNumPlayers=Integer.parseInt(sPlayerCount);
			aPlayers = playerInstantiate(iNumPlayers);
			bStarted = true;
		}while(!bStarted);
		return(aPlayers);

	}

	private static Players [] playerInstantiate(int iNumPlayers)
	{
		if(iNumPlayers==2)
		{
			String sPlayer1Name = JOptionPane.showInputDialog(null,"Please enter player 1's name: ");
			Players oPlayer1 = new Players(sPlayer1Name,1);
			String sPlayer2Name = JOptionPane.showInputDialog(null,"Please enter player 2's name: ");
			Players oPlayer2 = new Players(sPlayer2Name,2);
			Players [] aPlayers = {oPlayer1,oPlayer2};
			return aPlayers;
		}
		else if(iNumPlayers==3)
		{
			String sPlayer1Name = JOptionPane.showInputDialog(null,"Please enter player 1's name: ");
			Players oPlayer1 = new Players(sPlayer1Name,1);
			String sPlayer2Name = JOptionPane.showInputDialog(null,"Please enter player 2's name: ");
			Players oPlayer2 = new Players(sPlayer2Name,2);
			String sPlayer3Name = JOptionPane.showInputDialog(null,"Please enter player 3's name: ");
			Players oPlayer3 = new Players(sPlayer3Name,3);
			Players [] aPlayers = {oPlayer1,oPlayer2,oPlayer3};
			return aPlayers;
		}
		else
		{
			String sPlayer1Name = JOptionPane.showInputDialog(null,"Please enter player 1's name: ");
			Players oPlayer1 = new Players(sPlayer1Name,1);
			String sPlayer2Name = JOptionPane.showInputDialog(null,"Please enter player 2's name: ");
			Players oPlayer2 = new Players(sPlayer2Name,2);
			String sPlayer3Name = JOptionPane.showInputDialog(null,"Please enter player 3's name: ");
			Players oPlayer3 = new Players(sPlayer3Name,3);
			String sPlayer4Name = JOptionPane.showInputDialog(null,"Please enter player 4's name: ");
			Players oPlayer4 = new Players(sPlayer4Name,4);
			Players [] aPlayers = {oPlayer1,oPlayer2,oPlayer3,oPlayer4};
			return aPlayers;
		}
		
	}
	
	public static Properties [] propertiesSetup(){
		Properties oGo = new Properties(0,"Go",0,0,0,0,0,0,0,0,0,0,0,false);
		Properties oMediterraneanAve = new Properties(1,"Mediterranean Avenue",60,2,10,30,90,160,250,30,50,50,1,true);
		Properties oCommunityChest = new Properties(2,"Community Chest",0,0,0,0,0,0,0,0,0,0,0,false);
		Properties oBalticAvenue = new Properties(3,"Baltic Avenue",60,4,20,60,180,320,450,30,50,50,1,true);
		Properties oIncomeTax = new Properties(4,"Income Tax",0,0,0,0,0,0,0,0,0,0,0,false);
		Properties oReadingRailroad = new Properties(5,"Reading Railroad",200,25,25,50,100,200,200,100,0,0,9,true);
		Properties oOrientalAvenue = new Properties(6,"Oriental Avenue",100,6,30,90,270,400,550,50,50,50,2,true);
		Properties oChance = new Properties(7,"Chance",0,0,0,0,0,0,0,0,0,0,0,false);
		Properties oVermontAvenue = new Properties(8,"Vermont Avenue",100,6,30,90,270,400,550,50,50,50,2,true);
		Properties oConnecticutAvenue = new Properties(9,"Connenecticut Avenue",120,8,40,100,300,450,600,60,50,50,2,true);
		Properties oJail = new Properties(10,"Jail",0,0,0,0,0,0,0,0,0,0,0,false);
		Properties oStCharlesPlace = new Properties(11,"St. Charles Place",140,10,50,150,450,625,750,70,100,100,3,true);
		Properties oElectricCompany = new Properties(12,"Electric Company",150,0,0,0,0,0,0,75,0,0,10,true);//1 owned 4x the dice, both owned 10x the dice
		Properties oStatesAvenue = new Properties(13,"States Avenue",140,10,50,150,450,625,750,70,100,100,3,true);
		Properties oVirginiaAvenue = new Properties(14,"Virginia Avenue",160,12,60,180,500,700,900,80,100,100,3,true);
		Properties oPennsylvaniaRailroad = new Properties(15,"Pennsylvania Railroad",200,25,25,50,100,200,200,100,0,0,9,true);
		Properties oStJamesPlace = new Properties(16,"St. James Place",180,14,70,200,550,750,950,90,100,100,4,true);
		Properties oCommunityChestTwo = new Properties(17,"Community Chest",0,0,0,0,0,0,0,0,0,0,0,false);
		Properties oTennesseeAvenue = new Properties(18,"Tennessee Avenue",180,14,70,200,550,750,950,90,100,100,4,true);
		Properties oNewYourkAvenue = new Properties(19,"New York Avenue",200,16,80,220,600,800,1000,100,100,100,4,true);
		Properties oFreeParking = new Properties(20,"Free Parking",0,0,0,0,0,0,0,0,0,0,0,false);
		Properties oKentuckyAvenue = new Properties(21,"Kentucky Avenue",220,18,90,250,700,875,1050,110,150,150,5,true);
		Properties oChanceTwo = new Properties(22,"Chance",0,0,0,0,0,0,0,0,0,0,0,false);
		Properties oIndianaAvenue = new Properties(23,"Indiana Avenue",220,18,90,250,700,875,1050,110,150,150,5,true);
		Properties oIllinoisAvenue = new Properties(24,"Illinois Avenue",240,20,100,300,750,925,1100,120,150,150,5,true);
		Properties oBandORailroad = new Properties(25,"B.&O. Railroad",200,25,25,50,100,200,200,100,0,0,9,true);
		Properties oAtlanticAvenue = new Properties(26,"Atlantic Avenue",260,22,110,330,800,975,1150,130,150,150,6,true);
		Properties oVentnorAvenue = new Properties(27,"Ventor Avenue",260,22,110,330,800,975,1150,130,150,150,6,true);
		Properties oWaterWorks = new Properties(28,"Water Works",150,0,0,0,0,0,0,75,0,0,10,true);//1 owned 4x the dice, both owned 10x the dice
		Properties oMarvinGardens = new Properties(29,"Marvin Gardens",280,24,120,360,850,1025,1200,140,150,150,6,true);
		Properties oGoToJail = new Properties(30,"Go To Jail",0,0,0,0,0,0,0,0,0,0,0,false);
		Properties oPacificAvenue = new Properties(31,"Pacific Avenue",300,260,130,390,900,1100,1275,150,200,200,7,true);
		Properties oNorthCarolinaAvenue = new Properties(32,"North Carolina Avenue",300,260,130,390,900,1100,1275,150,200,200,7,true);
		Properties oCommunityChestThree = new Properties(33,"Community Chest",0,0,0,0,0,0,0,0,0,0,0,false);
		Properties oPennsylvaniaAvenue = new Properties(34,"Pennsylvania Avenue",320,28,150,450,1000,1200,1400,160,200,200,7,true);
		Properties oShortLine = new Properties(35,"Short Line",200,25,25,50,100,200,200,100,0,0,9,true);
		Properties oChanceThree = new Properties(36,"Chance",0,0,0,0,0,0,0,0,0,0,0,false);
		Properties oParkPlace = new Properties(37,"Park Place",350,35,175,500,1100,1300,1500,175,200,200,8,true);
		Properties oLuxuryTax = new Properties(38,"Luxury Tax",0,0,0,0,0,0,0,0,0,0,0,false);
		Properties oBoardWalk = new Properties(39,"Boardwalk",400,50,200,600,1400,1700,2000,200,200,200,8,true);
		
		Properties [] oBoard = {oGo,oMediterraneanAve,oCommunityChest,oBalticAvenue,oIncomeTax,
				oReadingRailroad,oOrientalAvenue,oChance,oVermontAvenue,oConnecticutAvenue,oJail,oStCharlesPlace,oElectricCompany,
				oStatesAvenue,oVirginiaAvenue,oPennsylvaniaRailroad,oStJamesPlace,oCommunityChestTwo,oTennesseeAvenue,oNewYourkAvenue,
				oFreeParking,oKentuckyAvenue,oChanceTwo,oIndianaAvenue,oIllinoisAvenue,oBandORailroad,oAtlanticAvenue,oVentnorAvenue,
				oWaterWorks,oMarvinGardens,oGoToJail,oPacificAvenue,oNorthCarolinaAvenue,oCommunityChestThree,oPennsylvaniaAvenue,
				oShortLine,oChanceThree,oParkPlace,oLuxuryTax,oBoardWalk};
		
		return oBoard;

	}
}
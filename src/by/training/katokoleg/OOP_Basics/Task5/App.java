import controller.AppCommand;
import controller.AppCommandFactoryImpl;
import controller.AppCommandName;
import controller.AppController;
import controller.Session.State;
import controller.command.GetFlowersCommand;
import controller.command.GetWrapperCommand;
import controller.command.RemoveFlowerByNameFromBouquetCommand;
import controller.command.SaveBouquetCommand;
import dao.DAOBouquetImpl;
import dao.DAOFlowerImpl;
import dao.DAOWrapperImpl;
import exceptions.WrongFlowerNameException;
import service.BouquetServiceImpl;
import service.FlowerServiceImpl;
import service.WrapperServiceImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class App {

    public static void main(String[] args) {

        DAOWrapperImpl daoWrapper = new DAOWrapperImpl();
        DAOFlowerImpl daoFlower = new DAOFlowerImpl();
        DAOBouquetImpl daoBouquet = new DAOBouquetImpl();
        BouquetServiceImpl bouquetService = new BouquetServiceImpl(daoBouquet);
        FlowerServiceImpl flowerService = new FlowerServiceImpl(daoFlower);
        WrapperServiceImpl wrapperService = new WrapperServiceImpl(daoWrapper);
        GetFlowersCommand getFlowersCommand = new GetFlowersCommand(flowerService);
        GetWrapperCommand getWrapperCommand = new GetWrapperCommand(wrapperService);
        RemoveFlowerByNameFromBouquetCommand removeFlowerCommand = new RemoveFlowerByNameFromBouquetCommand(bouquetService);
        SaveBouquetCommand saveBouquetCommand = new SaveBouquetCommand(bouquetService);

        Map<AppCommandName, AppCommand> commands = new HashMap<>();
        commands.put(AppCommandName.WATCHFLOWERS, getFlowersCommand);
        commands.put(AppCommandName.WATCHWRAPPERS, getWrapperCommand);
        commands.put(AppCommandName.REMOVEFLOWER, removeFlowerCommand);
        commands.put(AppCommandName.SAVEBOUQUET, saveBouquetCommand);
        AppCommandFactoryImpl appCommandFactory = new AppCommandFactoryImpl(commands);
        AppController controller = new AppController(appCommandFactory);

        Map<String, Object> userData = new HashMap<>();

        System.out.println("Hello. We are glad to see you in our bouquet maker app");
        System.out.println("You can make your own bouquet by yourself");
        System.out.println("Ok. Let's start.");

        State bouquet = new State();
        userData.put("bouquet", bouquet);
        controller.handleUserData(userData);

        try {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
                printInfo();
                while (true) {
                    String command = reader.readLine();
                    if (command.equals("-quit")) {
                        break;
                    }
                    userData.put("commandName", command);
                    controller.handleUserData(userData);

                    if (command.equals("-svb")) {
                        userData.put("bouquet", new State());
                    }
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Program finished.");
    }


    private static void printInfo() {
        System.out.println("Choose what do you want to do:");
        System.out.println("for watch flowers type command: -wf");
        System.out.println("for watch wrappers type command: -ww");
        System.out.println("for watch bouquet type command: -wb");
        System.out.println("for add flower to bouquet type command: -adfl");
        System.out.println("for add wrapper to bouquet type command: -adwr");
        System.out.println("for remove flower from bouquet type command: -rmfl");
        System.out.println("for remove wrapper from bouquet type command: -rmwr");
        System.out.println("if you want to quit type command: -quit ");
        System.out.println();
    }
}

package DAO;

/**
 * Created by Анюта on 12.04.2017.
 */
public class Factory {

    private static ShopDAO shopDAO = null;
    //  private static DriverDAO driverDAO = null;
    // private static RouteDAO routeDAO = null;
    private static Factory instance = null;

    public static synchronized Factory getInstance() {
        if (instance == null) {
            instance = new Factory();
        }
        return instance;
    }

    public ShopDAO getDAO() {
        if (shopDAO == null) {
            shopDAO = new ShopDAOImpl();
        }
        return shopDAO;
    }

}
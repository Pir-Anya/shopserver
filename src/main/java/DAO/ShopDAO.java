package DAO;
import shop.category;
import shop.goods;

import java.util.Collection;
import java.sql.SQLException;


public interface ShopDAO {
        public void addGood(goods good) throws SQLException;
      //  public void updateBus(Long bus_id, Bus bus) throws SQLException;
       // public Bus getBusById(Long bus_id) throws SQLException;
        public Collection getAllGoods() throws SQLException;
       // public void deleteBus(Bus bus) throws SQLException;
        public Collection getGoodsByCategory(category cat) throws SQLException;
      //  public Collection getBussesByRoute(Route route) throws SQLException;

}





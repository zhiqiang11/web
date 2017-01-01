package Service;

import Domain.BaseDomain;
import Domain.MemDetailDomain;
import Domain.MemoDomain;
import org.springframework.context.annotation.Bean;

import java.util.List;

/**
 * @author 张志强
 * @version v0.1 2017/1/1.
 */
public interface MemoTourServiceInterface {
    /**
     *
     * @param memid
     * @param id
     * @param cityname
     */
    void createMemoTable(String memid,String id,String cityname);
    void addRemarkTable(String memid,String describtion);
    void createSectionTable(String id, String memid, List<String> sectionNames, List<String> sectionPoints);
    void createRestaurantTable(String id,String memid,List<String> restaurantNames,List<String> restaurantPoints);
    void createHotelTable(String id,String memid,List<String> hotelNames,List<String> hotelPoints);
    MemoDomain getMemoInfoByMemid(String memid);
    List<BaseDomain> getSectionInfoByMemid(String memid);
    List<BaseDomain> getHotelInfoByMemid(String memid);
    List<BaseDomain> getRestaurantInfoByMemid(String memid);
    List<String> getMemIDByCityname(String cityname);
    MemDetailDomain getMemoDetailInfo(String memid);
    List<MemDetailDomain> getMemotourByCityname(String cityname);
}

package controller;

import Domain.MemDetailDomain;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

/**
 * @author 张志强
 * @version v0.1 2016/12/31.
 */
@WebService(targetNamespace = "http://service.ws.memotour/",name="MemoTour")
   // @WebService
public interface MemoTour {
    /**
     * 生成路书基本信息表
     * 用户id
     * 路书memid
     * 城市名称
     */
    @WebMethod
    void createMemoTable(@WebParam(name = "memid") String memid, @WebParam(name = "id")String id, @WebParam(name = "cityname")String cityname);
    /**
     * 生成景点信息表
     * 景点id
     * 路书id
     * 景点名称
     * 景点坐标
     */
    @WebMethod
     void createSectionTable(@WebParam(name = "id")String id, @WebParam(name = "memid")String memid, @WebParam(name = "sectionNames")List<String> sectionNames,@WebParam(name = "sectionPoints") List<String> sectionPoints);
    /**
     * 生成饭店信息表
     * 饭店id
     * 路书id
     * 饭店名称
     * 饭店坐标
     */
    @WebMethod
     void createRestaurantTable(@WebParam(name = "id")String id, @WebParam(name = "memid")String memid,@WebParam(name = "restaurantNames")List<String> restaurantNames,@WebParam(name="restaurantPoints") List<String> restaurantPoints);
    /**
     * 生成酒店信息表
     * 酒店id
     * 路书id
     * 酒店名称
     * 酒店坐标
     */
    @WebMethod
     void createHotelTable(@WebParam(name = "id")String id,@WebParam(name = "memid")String memid, @WebParam(name = "hotelNames")List<String> hotelNames,@WebParam(name = "hotelPoints") List<String> hotelPoints);
    /**
     * 添加路书描述
     * 路书id
     * 路书描述信息
     */
    @WebMethod
     void addRemarkTable(@WebParam(name = "memid")String memid,@WebParam(name = "describtion")String describtion);
    /**
     * 获取路书详细信息
     * 路书memid
     */
    @WebMethod
     MemDetailDomain getMemoDetailInfo(@WebParam(name = "memid")String memid);
    /**
     * 路书推荐功能
     * 城市名称
     */
    @WebMethod
     List<MemDetailDomain> getMemoDetailInfoByCityname(@WebParam(name = "cityname")String cityname);
}

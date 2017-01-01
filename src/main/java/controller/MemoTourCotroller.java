package controller;

import Domain.MemDetailDomain;
import Service.MemoTourService;
import Service.MemoTourServiceInterface;
import com.sun.istack.NotNull;
import com.sun.istack.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import javax.jws.WebService;
import java.util.List;

/**
 * @author 张志强
 * @version v0.1 2016/12/31.
 */

@WebService(serviceName = "HelloService", portName = "HelloPort",
           targetNamespace = "http://service.ws.memotour/",
           endpointInterface = "controller.MemoTour")
//@WebService
@RestController
public class MemoTourCotroller implements MemoTour {
    /**
     * 路书信息服务接口
     */
    @Autowired
    private MemoTourService memoTourService;

    /**
     * 生成路书基本信息表
     * 用户id
     * 路书memid
     * 城市名称
     */
    @Override
    public void createMemoTable(String memid, String id, String cityname) {
        memoTourService.createMemoTable(memid, id, cityname);
    }

    /**
     * 生成景点信息表
     * 景点id
     * 路书id
     * 景点名称
     * 景点坐标
     */
    @Override
    public void createSectionTable(String id, String memid, List<String> sectionNames, List<String> sectionPoints) {
        memoTourService.createSectionTable(id,memid, sectionNames, sectionPoints);
    }

    /**
     * 生成饭店信息表
     * 饭店id
     * 路书id
     * 饭店名称
     * 饭店坐标
     */
    @Override
    public void createRestaurantTable(String id, String memid,List<String> restaurantNames, List<String> restaurantPoints) {
        memoTourService.createRestaurantTable(id,memid, restaurantNames, restaurantPoints);
    }

    /**
     * 生成酒店信息表
     * 酒店id
     * 路书id
     * 酒店名称
     * 酒店坐标
     */
    @Override
    public void createHotelTable(String id,String memid, List<String> hotelNames, List<String> hotelPoints) {
        memoTourService.createHotelTable(id,memid, hotelNames, hotelPoints);
    }
    /**
     * 添加路书描述
     * 路书id
     * 用户id
     * 城市名称
     * 路书描述信息
     */
    @Override
    public void addRemarkTable(String memid,String describtion){
       memoTourService.addRemarkTable(memid, describtion);
    }
    /**
     * 获取路书详细信息
     * 路书memid
     */
    @Override
    public MemDetailDomain getMemoDetailInfo(String memid) {

        return memoTourService.getMemoDetailInfo(memid);
    }

    /**
     * 路书推荐功能
     * 城市名称
     */
    @Override
    public List<MemDetailDomain> getMemoDetailInfoByCityname(String cityname) {
        return memoTourService.getMemotourByCityname(cityname);
    }
}

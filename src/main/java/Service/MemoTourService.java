package Service;

import Domain.BaseDomain;
import Domain.MemDetailDomain;
import Domain.MemoDomain;
import org.apache.ibatis.annotations.Mapper;
import Mapper.MemoTourMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 张志强
 * @version v0.1 2016/12/31.
 */
@Service
@Scope(value = "prototype")
public class MemoTourService {
    /**
     * 数据库服务接口
     */
    @Autowired
    private MemoTourMapper memoTourMapper;
    /**
     * 生成基本路书信息表
     */
    @Bean
    public void createMemoTable(String memid,String id,String cityname){
        MemoDomain memoDomain=new MemoDomain();
        memoDomain.setId(id);
        memoDomain.setMemid(memid);
        memoDomain.setCityName(cityname);
        memoTourMapper.insertMemoInfo(memoDomain);
    }
    /**
     * 添加路书描述信息
     */
    public void addRemarkTable(String memid,String describtion){
        memoTourMapper.updateMem(memid,describtion);
    }
    /**
     * 生成景点表
     */

    public void createSectionTable(String id, String memid, List<String> sectionNames, List<String> sectionPoints){
       // List<BaseDomain> sectionInfo=new ArrayList<BaseDomain>();
        int count=0;
        count=sectionNames.size();
        for(int i=0;i<count;i++){
            BaseDomain sectionDomain=new BaseDomain();
            sectionDomain.setId(id);
            sectionDomain.setMemid(memid);
            sectionDomain.setName(sectionNames.get(i));
            String[] point=sectionPoints.get(i).split(",");
            sectionDomain.setLat(point[0]);
            sectionDomain.setLon(point[1]);
            memoTourMapper.insertSectionInfo(sectionDomain);
            //sectionInfo.add(sectionDomain);
        }
    }
    /**
     * 生成饭店表
     */

    public void createRestaurantTable(String id,String memid,List<String> restaurantNames,List<String> restaurantPoints){
        //List<BaseDomain> restaurantInfo=new ArrayList<BaseDomain>();
        int count=0;
        count=restaurantNames.size();
        for(int i=0;i<count;i++){
            BaseDomain restaurantDomain=new BaseDomain();
            restaurantDomain.setId(id);
            restaurantDomain.setMemid(memid);
            restaurantDomain.setName(restaurantNames.get(i));
            String[] point=restaurantPoints.get(i).split(",");
            restaurantDomain.setLat(point[0]);
            restaurantDomain.setLon(point[1]);
            //restaurantInfo.add(restaurantDomain);
            memoTourMapper.insertRestaurantInfo(restaurantDomain);
        }
    }
    /**
     * 生成酒店表
     */

    public void createHotelTable(String id,String memid,List<String> hotelNames,List<String> hotelPoints){
       // List<BaseDomain> hotelInfo=new ArrayList<BaseDomain>();
        int count=0;
        count=hotelNames.size();
        for(int i=0;i<count;i++){
            BaseDomain hotelDomain=new BaseDomain();
            hotelDomain.setId(id);
            hotelDomain.setMemid(memid);
            hotelDomain.setName(hotelNames.get(i));
            String[] point=hotelPoints.get(i).split(",");
            hotelDomain.setLat(point[0]);
            hotelDomain.setLon(point[1]);
           // hotelInfo.add(hotelDomain);
            memoTourMapper.insertHotelInfo(hotelDomain);
        }

    }
    /**
     * 通过路书id获取路书基本信息
     */

    public MemoDomain getMemoInfoByMemid(String memid){
         return memoTourMapper.getMemoInfo(memid);
    }
    /**
     *通过路书id获取景点信息
     */

    public List<BaseDomain> getSectionInfoByMemid(String memid){
        return memoTourMapper.getSectionInfo(memid);
    }
    /**
     * 通过路书id获取酒店信息
     */

    public List<BaseDomain> getHotelInfoByMemid(String memid){
        return memoTourMapper.getHotelInfo(memid);
    }
    /**
     * 通过路书id获取饭店信息
     */

    public List<BaseDomain> getRestaurantInfoByMemid(String memid){
        return memoTourMapper.getRestaurantInfo(memid);
    }
    /**
     * 通过城市名称获取路书id
     */

    public List<String> getMemIDByCityname(String cityname){
        return memoTourMapper.getMemidlist(cityname);
    }


    /**
     * 获取详细路书表
     */

    public MemDetailDomain getMemoDetailInfo(String memid) {
        MemDetailDomain memDetailDomain = new MemDetailDomain();
        memDetailDomain.setMemoInfo(getMemoInfoByMemid(memid));
        memDetailDomain.setHotelInfo(getHotelInfoByMemid(memid));
        memDetailDomain.setRestaurantInfo(getRestaurantInfoByMemid(memid));
        memDetailDomain.setSectionInfo(getSectionInfoByMemid(memid));
        return memDetailDomain;
    }
    /**
     * 根据城市名称获取路书列表
     */

    public List<MemDetailDomain> getMemotourByCityname(String cityname){
        List<MemDetailDomain> memDetailDomains=new ArrayList<MemDetailDomain>();
        List<String> memidlist=new ArrayList<String>();
        memidlist=getMemIDByCityname(cityname);
        for(String memid : memidlist){
            memDetailDomains.add(getMemoDetailInfo(memid));
        }
        return memDetailDomains;
    }

    public MemoTourService (){
        System.out.print("I am created");
    }
}

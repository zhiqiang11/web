package Domain;

import java.util.List;

/**
 * @author 张志强
 * @version v0.1 2016/12/31.
 */
public class MemDetailDomain {
    /**
     * 路书基本信息
     */
    private MemoDomain memoInfo;
    /**
     * 酒店信息
     */
    private List<BaseDomain> hotelInfo;
    /**
     * 景点信息
     */
    private  List<BaseDomain> sectionInfo;
    /**
     * 饭店信息
     */
    private List<BaseDomain> restaurantInfo;
    /**
     * 获取路书基本信息
     */
    public MemoDomain getMemoInfo(){
        return memoInfo;
    }
    /**
     * 设置路书基本信息
     */
    public void setMemoInfo(MemoDomain memoInfo){
        this.memoInfo=memoInfo;
    }
    /**
     * 获取酒店信息
     */
    public List<BaseDomain> getHotelInfo(){
        return  hotelInfo;
    }
    /**
     * 设置酒店信息
     */
    public void setHotelInfo(List<BaseDomain> hotelInfo){
        this.hotelInfo=hotelInfo;
    }
    /**
     * 获取景点信息
     */
    public List<BaseDomain> getSectionInfo(){
        return sectionInfo;
    }
    /**
     * 设置景点信息
     */
    public void setSectionInfo(List<BaseDomain> sectionInfo){
        this.sectionInfo=sectionInfo;
    }
    /**
     * 获取饭店信息
     */
    public List<BaseDomain> getRestaurantInfo(){
        return restaurantInfo;
    }
    /**
     * 设置饭店信息
     */
    public void setRestaurantInfo(List<BaseDomain> restaurantInfo){
        this.restaurantInfo=restaurantInfo;
    }
}

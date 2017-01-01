package Domain;

/**
 * @author 张志强
 * @version v0.1 2016/12/31.
 */
public class MemoDomain {
    /**
     * 用户id
     */
    private  String memid;
    /**
     * 路书id
     */
    private String id;
    /**
     * 城市名称
     */
    private String cityName;
    /**
     * 描述信息
     */
    private String describetion=null;
    /**
     * 获取id
     */
    public String getId(){
        return id;
    }
    /**
     * 设置id
     */
    public void setId(String id){
        this.id=id;
    }
    /**
     * 获取memid
     */
    public String getMemid(){
        return memid;
    }
    /**
     * 设置memid
     */
    public void setMemid(String memid){
        this.memid=memid;
    }
    /**
     * 获取城市名称
     */
    public String getCityName(){
        return cityName;
    }
    /**
     * 设置城市名称
     */
    public void setCityName(String cityName){
        this.cityName=cityName;
    }
    /**
     * 获取描述信息
     */
    public String getDescribetion(){
        return describetion;
    }
    /**
     * 设置描述信息
     */
    public void setDescribetion(String describetion){
        this.describetion=describetion;
    }
}

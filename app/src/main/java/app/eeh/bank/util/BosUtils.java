package app.eeh.bank.util;

import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.services.bos.BosClient;
import com.baidubce.services.bos.BosClientConfiguration;
import com.baidubce.services.bos.model.BucketSummary;
import com.erajie.rxutils.RxLogTool;

import java.util.List;

/**
 * @author EraJieZhang
 * @data 2020-12-15
 */
public class BosUtils {
    private static final String Access_Key_ID = "148ec9263f18433bb7bda2212fd7a25d";
    private static final String Secret_Access_Key = "a211f26cbfa94a689eb7164fdfedb7fe";
    private static final String End_Point = "https://bj.bcebos.com";

    /**
     * 创建BOSClient实例
     * @return BOSClient实例
     */
    public static BosClient initBos(){
        BosClientConfiguration config = new BosClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(Access_Key_ID, Secret_Access_Key));
        config.setEndpoint(End_Point);
//
//        // 设置HTTP最大连接数为10
//        config.setMaxConnections(10);
//
//        // 设置TCP连接超时为5000毫秒
//        config.setConnectionTimeoutInMillis(5000);
//
//        // 设置Socket传输数据超时的时间为2000毫秒
//        config.setSocketTimeoutInMillis(2000);

        BosClient client = new BosClient(config);
        return client;
    }

    /**
     * 查看Bucket列表
     * @param client BOSClient实例
     */
    public static void getBookNameFileName(BosClient client){
        List<BucketSummary> buckets = client.listBuckets().getBuckets();
        // 遍历Bucket
        for (BucketSummary bucket : buckets) {
            RxLogTool.d(bucket.toString());
        }
    }

    /**
     * 判断Bucket是否存在
     * @param client BOSClient实例
     * @param bucketName 查询的buckName
     * @return  是否存在
     */
    public static boolean checkBucketExist(BosClient client,String bucketName){
        boolean exists = client.doesBucketExist(bucketName);
        RxLogTool.d(exists);
        return exists;
    }
}
